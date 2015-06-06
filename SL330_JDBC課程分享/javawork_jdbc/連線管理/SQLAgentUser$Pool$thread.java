import java.sql.*;

class SQLAgentUser$Pool$thread extends SQLAgent implements Runnable {

	String sqlStatements;
	ConnPool connPool;

	public SQLAgentUser$Pool$thread(String sqlStatements, ConnPool connPool) {
		this.sqlStatements = sqlStatements;
		this.connPool = connPool;
	}

	public static void main(String argv[]) {
		ConnPool connPool = new ConnPool();
		connPool.setDriverName("oracle.jdbc.driver.OracleDriver");
		connPool.setJdbcURL("jdbc:oracle:thin:@localhost:1521:orcl2");
		connPool.setUserName("scott");
		connPool.setPassword("tiger");
		try {
			connPool.setConnectionSwitch("ON"); // 主執行緒: 從資料庫取出連線,建立連線池
		} catch (SQLException ex) {
			System.out.println(" ConnPool 連結失敗:" + ex.getMessage());
		}

		SQLAgentUser$Pool$thread sr1 = new SQLAgentUser$Pool$thread(
				"select * from coffees", connPool);
		SQLAgentUser$Pool$thread sr2 = new SQLAgentUser$Pool$thread(
				"select * from suppliers", connPool);
		SQLAgentUser$Pool$thread sr3 = new SQLAgentUser$Pool$thread(
				"select * from coffees", connPool);
		SQLAgentUser$Pool$thread sr4 = new SQLAgentUser$Pool$thread(
				"select * from suppliers", connPool);

		Thread t1 = new Thread(sr1, "執行緒1");
		Thread t2 = new Thread(sr2, "執行緒2");
		Thread t3 = new Thread(sr3, "執行緒3");
		Thread t4 = new Thread(sr4, "執行緒4");
		t1.start();
		t2.start();
		t3.start();
		t4.start();

		// 主執行緒: 等候所有執行緒結束執行
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
		} catch (InterruptedException e) {
			System.out.println("Main thread Interrupted");
		}
		// 主執行緒: 關閉連線池, 並將連線歸還資料庫
		try {
			connPool.setConnectionSwitch("OFF");
			System.out.println(" [主執行緒: " + Thread.currentThread().getName()
					+ "] 等候所有執行緒結束執行之後, 才關閉連線池");
		} catch (SQLException ex) {
			System.out.println(" ConnPool 連結失敗:" + ex.getMessage());
		}
	}

	public void run() {
		setConnPool(connPool); // 通知父類別,將要使用連線池

		System.out.println("執行SQL指令: " + sqlStatements + "......");

		try {
			// 執行緒:從連線池中取出連線
			setConnectionSwitch("on");
			Connection con = getConnection();

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sqlStatements);
			ResultSetMetaData rsmd = rs.getMetaData();
			int numberOfColumns = rsmd.getColumnCount();

			for (int i = 1; i <= numberOfColumns; i++)
				System.out.print(rsmd.getColumnName(i) + " ");

			System.out.println();
			while (rs.next()) {
				for (int i = 1; i <= numberOfColumns; i++)
					System.out.print(rs.getObject(i) + " ");
				System.out.println();
			}
			System.out.println(Thread.currentThread().getName()
					+ ".....執行成功!\n");

			rs.close();
			stmt.close();
			// 執行緒:將連線歸還連線池
			setConnectionSwitch("off");

		} catch (SQLException ex) {
			System.err.println("SQLException: " + ex.getMessage());
		}
	}

}