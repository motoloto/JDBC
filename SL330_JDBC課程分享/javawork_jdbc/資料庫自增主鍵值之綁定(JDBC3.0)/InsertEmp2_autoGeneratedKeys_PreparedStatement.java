import java.sql.*;

class InsertEmp2_autoGeneratedKeys_PreparedStatement {

	public static void main(String argv[]) throws ClassNotFoundException,SQLException {

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl2", "scott", "tiger");
	    
	  //新增員工
    String insert_stmt = 
        	"INSERT INTO emp2 (empno,ename,job,hiredate,sal,comm,deptno) VALUES (emp2_seq.NEXTVAL, ?, ?, to_date(?,'yyyy-mm-dd'), ?, ?, ?)";
		String cols[] = { "EMPNO" }; //或 int cols[] = {1};
		PreparedStatement pstmt = con.prepareStatement(insert_stmt, cols);
		pstmt.setString(1, "吳永志1");
		pstmt.setString(2, "MANAGER");
		pstmt.setString(3, "2005-01-01");
		pstmt.setString(4, "50000");
		pstmt.setString(5, "500");
		pstmt.setString(6, "10");
		pstmt.executeUpdate();
		
		//掘取對應的自增主鍵值
		ResultSet rsKeys = pstmt.getGeneratedKeys();
		ResultSetMetaData rsmd = rsKeys.getMetaData();
		int columnCount = rsmd.getColumnCount();
		if (rsKeys.next()) {
			do {
				for (int i = 1; i <= columnCount; i++) {
					String key = rsKeys.getString(i);
					System.out.println("自增主鍵值(i=" + i + ") = " + key +"(剛新增成功的員工編號)");
				}
			} while (rsKeys.next());
		} else {
			System.out.println("NO KEYS WERE GENERATED.");
		}
		
		//查詢員工
		pstmt = con.prepareStatement("SELECT * from EMP2 order by empno");
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			String str1 = rs.getString(1);
			String str2 = rs.getString(2);

			System.out.print(" EMPNO= " + str1);
			System.out.print(" ENAME= " + str2);
			System.out.print("\n");
		}

		con.close();

	}
}