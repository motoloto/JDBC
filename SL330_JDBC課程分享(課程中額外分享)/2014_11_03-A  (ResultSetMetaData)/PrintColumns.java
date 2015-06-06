import java.sql.*;
	 
class PrintColumns  {

	public static void main(String args[]) {
		  
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		Connection con;
		String query = "select * from emp2";
		//String query = "select COF_NAME ���~�W��, PRICE ���� from COFFEES";
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
	
			PrintColumnTypes.printColTypes(rsmd);
			System.out.println("");
	
			int numberOfColumns = rsmd.getColumnCount();
	
			for (int i = 1; i <= numberOfColumns; i++) {
				if (i > 1) System.out.print(",  ");
				String columnName = rsmd.getColumnName(i);
				System.out.print(columnName);
			}
			System.out.println("");
	
			while (rs.next()) {
				for (int i = 1; i <= numberOfColumns; i++) {
					if (i > 1) System.out.print(",  ");
					String columnValue = rs.getString(i);
					System.out.print(columnValue);
				}
				System.out.println("");	
			}
	
			stmt.close();
			con.close();
		} catch(SQLException ex) {
			System.err.print("SQLException: ");
			System.err.println(ex.getMessage());
		}	
	}
}
