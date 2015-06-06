import java.sql.*;
	 
public class InsertCoffees {

	public static void main(String args[]) {
		  
		String url = "jdbc:oracle:thin:@localhost:1521:orcl2";
		Connection con;
		Statement stmt;
		String query = "select COF_NAME, PRICE from COFFEES";
	
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
	
			stmt.executeUpdate("insert into COFFEES " +
		         "values('Colombian', 00101, 7.99, 0, 0)");
	
			stmt.executeUpdate("insert into COFFEES " +
		         "values('French_Roast', 00049, 8.99, 0, 0)");
			
			stmt.executeUpdate("insert into COFFEES " +
		         "values('Espresso', 00150, 9.99, 0, 0)");
	
			stmt.executeUpdate("insert into COFFEES " +
	             "values('Colombian_Decaf', 00101, 8.99, 0, 0)");
	
			stmt.executeUpdate("insert into COFFEES " +
		         "values('French_Roast_Decaf', 00049, 9.99, 0, 0)");
	
			ResultSet rs = stmt.executeQuery(query);
	
			System.out.println("Coffee Break Coffees and Prices:");
			while (rs.next()) {
				String s = rs.getString("COF_NAME");
				float f = rs.getFloat("PRICE");
				System.out.println(s + "   " + f);
			}
	
			stmt.close();
			con.close();
	
		} catch(SQLException ex) {
			System.err.println("SQLException: " + ex.getMessage());
		}
	}
}
