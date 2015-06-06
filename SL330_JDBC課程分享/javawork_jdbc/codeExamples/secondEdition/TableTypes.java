import java.sql.*;
     
public class TableTypes  {

	public static void main(String args[]) {
		  
		String url = "jdbc:mySubprotocol:myDataSource";
		Connection con;
	
		try {
			Class.forName("myDriver.ClassName");
	
		} catch(java.lang.ClassNotFoundException e) {
			System.err.print("ClassNotFoundException: "); 
			System.err.println(e.getMessage());
		}

		try {
			con = DriverManager.getConnection(url, 
									 "myLogin", "myPassword");
	
			DatabaseMetaData dbmd = con.getMetaData();
			String dbmsName = dbmd.getDatabaseProductName();
			ResultSet rs = dbmd.getTableTypes();
			System.out.print("The following types of tables are ");
			System.out.println("available in " + dbmsName + ":  ");
			
			while (rs.next()) {
				String tableType = rs.getString("TABLE_TYPE");
				System.out.println("    " + tableType);
			}
		
			rs.close();
			con.close();
	
		} catch(SQLException ex) {
			System.err.print("SQLException: ");
			System.err.println(ex.getMessage());
		}
	}
}

