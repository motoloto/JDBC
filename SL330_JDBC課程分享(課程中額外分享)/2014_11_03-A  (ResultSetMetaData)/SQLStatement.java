import java.sql.*;
	 
public class SQLStatement  {

	public static void main(String args[]) {
		  
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		Connection con;
		String query = "select * from emp2";
		Statement stmt;
	
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

		} catch(java.lang.ClassNotFoundException e) {
			System.err.print("ClassNotFoundException: ");
			System.err.println(e.getMessage());
		}
	
		try {
			con = DriverManager.getConnection(url, 
									 "scott", "tiger");
	
			stmt = con.createStatement();							
	
			ResultSet rs = stmt.executeQuery(query);
			ResultSetMetaData rsmd = rs.getMetaData();
			int numberOfColumns = rsmd.getColumnCount();
			//int rowCount = 1;
			int rowCount = 0;
			while (rs.next()) {
				//System.out.println("Row " + rowCount + ":  ");
				for (int i = 1; i <= numberOfColumns; i++) {
					//System.out.print("   Column " + i + ":  ");
					System.out.print(rs.getString(i)+"\t");
				}
				System.out.println("");
				rowCount++;
			}
			System.out.println("※全部資料共"+rowCount+"筆");
			stmt.close();
			con.close();

		} catch(SQLException ex) {
			System.err.print("SQLException: ");
			System.err.println(ex.getMessage());
		}	
	}
}
