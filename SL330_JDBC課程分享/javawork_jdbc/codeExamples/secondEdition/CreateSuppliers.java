import java.sql.*;
     
public class CreateSuppliers {

	public static void main(String args[]) {
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		Connection con;
		String createString;
		createString = "create table SUPPLIERS " + 
						"(SUP_ID int, " +
						"SUP_NAME varchar(40), " +
						"STREET varchar(40), " +
						"CITY varchar(20), " +
						"STATE char(2), ZIP char(5))";
	
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
	   		stmt.executeUpdate(createString);
	
			stmt.close();
			con.close();
	
		} catch(SQLException ex) {
			System.err.println("SQLException: " + ex.getMessage());
		}
	}
}

