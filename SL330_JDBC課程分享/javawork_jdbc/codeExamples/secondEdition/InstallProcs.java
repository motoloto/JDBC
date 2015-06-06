import java.sql.*;

class InstallProcs {

	static void main(String[] args) {
		String url = "jdbc:mySubprotocol:myDataSource";
		Connection con;
		String installJar;
		String createProc;
		installJar = "{call sqlj.install_jar('file:/myDir/SQLRoutines.jar', " +
					 "'routines_jar', 0)}";							
		createProc = "create procedure show_suppliers " +
					 "reads sql data " +
					 "dynamic result sets 1 " +
					 "external name 'routines_jar:SuppliersProcs.showSuppliers'" +
					 "language java parameter style java";

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

			stmt.executeUpdate(installJar);							
	   	    stmt.executeUpdate(createProc);
	
			stmt.close();
			con.close();

		} catch(SQLException ex) {
			System.err.println("SQLException: " + ex.getMessage());
		}
	}
}
