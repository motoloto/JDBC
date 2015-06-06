import java.sql.*;
     
public class SQLStatement  {

	public static void main(String args[]) {
		  
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		Connection con;
		//String query = "select SUPPLIERS.SUP_NAME, COFFEES.COF_NAME " +
		//			   "from COFFEES, SUPPLIERS " +
		//			   "where SUPPLIERS.SUP_NAME like 'Acme, Inc.' and " +
		//			   "SUPPLIERS.SUP_ID = COFFEES.SUP_ID";
		String query = "select * " +
					   "from emp2 " 
					   ;
		Statement stmt;
	
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

		} catch(java.lang.ClassNotFoundException e) {
			System.err.print("ClassNotFoundException: ");
			System.err.println(e.getMessage());
		}
	
		try {
			con = DriverManager.getConnection(url, 
									 "user1", "u111");
	
			stmt = con.createStatement();							
	
			ResultSet rs = stmt.executeQuery(query);
			ResultSetMetaData rsmd = rs.getMetaData();
			int numberOfColumns = rsmd.getColumnCount();
			int rowCount = 0;
			//int rowCount = 1;
			while (rs.next()) {
				
				for (int i = 1; i <= numberOfColumns; i++) {
			
					System.out.print(rs.getString(i)+"\t");
				}2014/11/3 02:16�U��
				System.out.println("");
				rowCount++;
			}
			stmt.close();
			con.close();

		} catch(SQLException ex) {
			System.err.print("SQLException: ");
			System.err.println(ex.getMessage());
		}	
	}
}

