import java.sql.*;
     
public class CreateCoffees {

	public static void main(String args[]) {
		  
		String url = "jdbc:mySubprotocol:myDataSource";
		Connection con;
		String createString;
		createString = "create table COFFEES " +
							"(COF_NAME varchar(32), " +
							"SUP_ID int, " +
							"PRICE float, " +
							"SALES int, " +
							"TOTAL int)";
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

