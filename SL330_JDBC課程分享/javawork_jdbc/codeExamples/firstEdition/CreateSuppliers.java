import java.net.URL;
import java.sql.*;
     
public class CreateSuppliers {

	public static void main(String args[]) {
		String url = "jdbc:mySubprotocol:myDataSource";
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
			Class.forName("myDriver.ClassName");

		} catch(java.lang.ClassNotFoundException e) {
			System.err.print("ClassNotFoundException: "); 
			System.err.println(e.getMessage());
		}

		try {
			con = DriverManager.getConnection(url, 
									 "myLogin", "myPassword");
	
			stmt = con.createStatement();							
	   		stmt.executeUpdate(createString);
	
			stmt.close();
			con.close();
	
		} catch(SQLException ex) {
			System.err.println("SQLException: " + ex.getMessage());
		}
	}
}

