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
			connPool.setConnectionSwitch("ON"); // �D�����: �q��Ʈw���X�s�u,�إ߳s�u��
		} catch (SQLException ex) {
			System.out.println(" ConnPool �s������:" + ex.getMessage());
		}

		SQLAgentUser$Pool$thread sr1 = new SQLAgentUser$Pool$thread(
				"select * from coffees", connPool);
		SQLAgentUser$Pool$thread sr2 = new SQLAgentUser$Pool$thread(
				"select * from suppliers", connPool);
		SQLAgentUser$Pool$thread sr3 = new SQLAgentUser$Pool$thread(
				"select * from coffees", connPool);
		SQLAgentUser$Pool$thread sr4 = new SQLAgentUser$Pool$thread(
				"select * from suppliers", connPool);

		Thread t1 = new Thread(sr1, "�����1");
		Thread t2 = new Thread(sr2, "�����2");
		Thread t3 = new Thread(sr3, "�����3");
		Thread t4 = new Thread(sr4, "�����4");
		t1.start();
		t2.start();
		t3.start();
		t4.start();

		// �D�����: ���ԩҦ��������������
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
		} catch (InterruptedException e) {
			System.out.println("Main thread Interrupted");
		}
		// �D�����: �����s�u��, �ñN�s�u�k�ٸ�Ʈw
		try {
			connPool.setConnectionSwitch("OFF");
			System.out.println(" [�D�����: " + Thread.currentThread().getName()
					+ "] ���ԩҦ�������������椧��, �~�����s�u��");
		} catch (SQLException ex) {
			System.out.println(" ConnPool �s������:" + ex.getMessage());
		}
	}

	public void run() {
		setConnPool(connPool); // �q�������O,�N�n�ϥγs�u��

		System.out.println("����SQL���O: " + sqlStatements + "......");

		try {
			// �����:�q�s�u�������X�s�u
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
					+ ".....���榨�\!\n");

			rs.close();
			stmt.close();
			// �����:�N�s�u�k�ٳs�u��
			setConnectionSwitch("off");

		} catch (SQLException ex) {
			System.err.println("SQLException: " + ex.getMessage());
		}
	}

}