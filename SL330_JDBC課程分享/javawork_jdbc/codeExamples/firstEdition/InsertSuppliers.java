import java.sql.*;
     
public class InsertSuppliers {

	public static void main(String args[]) {
		  
		String url = "jdbc:mySubprotocol:myDataSource";
		Connection con;
		Statement stmt;
		String query = "select SUP_NAME, SUP_ID from SUPPLIERS";
	
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
	
			stmt.executeUpdate("insert into SUPPLIERS " +
	                 "values(49, 'Superior Coffee', '1 Party Place', " +
				 "'Mendocino', 'CA', '95460')");
		
			stmt.executeUpdate("insert into SUPPLIERS " +
				"values(101, 'Acme, Inc.', '99 Market Street', " +
				"'Groundsville', 'CA', '95199')");
	
			stmt.executeUpdate("insert into SUPPLIERS " +
	                 "values(150, 'The High Ground', '100 Coffee Lane', " +
				 "'Meadows', 'CA', '93966')");
	
			ResultSet rs = stmt.executeQuery(query);
	
			System.out.println("Suppliers and their ID Numbers:");
			while (rs.next()) {
				String s = rs.getString("SUP_NAME");
				int n = rs.getInt("SUP_ID");
				System.out.println(s + "   " + n);
			}
	
			stmt.close();
			con.close();
	
		} catch(SQLException ex) {
			System.err.println("SQLException: " + ex.getMessage());
		}
	}
}

