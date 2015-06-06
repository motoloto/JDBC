import java.sql.*;

public class CreateUDTs {
	public static void main(String args[]) {

		String url = "jdbc:mySubprotocol:myDataSource";
		Connection con;
		Statement stmt;

		String createAddress = "CREATE TYPE ADDRESS (NUM INTEGER, " +
                        "STREET VARCHAR(40), CITY VARCHAR(40), " +
                        "STATE CHAR(2), ZIP CHAR(5))";

		String createManager = "CREATE TYPE MANAGER (MGR_ID INTEGER, " +
			"LAST_NAME VARCHAR(40), FIRST_NAME VARCHAR(40), " +
			"PHONE char(10))";

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

			stmt.executeUpdate(createAddress);
			stmt.executeUpdate("CREATE TYPE PHONE_NO AS CHAR(10)");
			stmt.executeUpdate(createManager);

			stmt.close();
			con.close();

        } catch(SQLException ex) {
            System.err.println("-----SQLException-----");
            System.err.println("SQLState:  " + ex.getSQLState());
            System.err.println("Message:  " + ex.getMessage());
            System.err.println("Vendor:  " + ex.getErrorCode());
        }
	}
}
