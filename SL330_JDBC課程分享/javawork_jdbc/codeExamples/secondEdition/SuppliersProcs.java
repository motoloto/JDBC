import java.sql.*;

public class SuppliersProcs {

	public static void showSuppliers(ResultSet[] rs ) throws SQLException {
		String query = "select SUPPLIERS.SUP_NAME, COFFEES.COF_NAME " +
			           "from SUPPLIERS, COFFEES " + 
			           "where SUPPLIERS.SUP_ID = COFFEES.SUP_ID";

		Connection con = DriverManager.getConnection("jdbc:default:connection");
		Statement stmt = con.createStatement();
		rs[0] = stmt.executeQuery(query);
	}
}
