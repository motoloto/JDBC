import java.sql.*;

public class TypeConcurrency {

	public static void main(String args[]) {

		String url = "jdbc:mySubprotocol:myDataSource";
		Connection con;
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

			stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
     									ResultSet.CONCUR_READ_ONLY);

            ResultSet srs = stmt.executeQuery("SELECT * FROM COFFEES");

			int type = srs.getType();

			System.out.println("srs is type " + type);

			int concur = srs.getConcurrency();

			System.out.println("srs has concurrency " + concur);
			while (srs.next()) {
				String name = srs.getString("COF_NAME");
				int id = srs.getInt("SUP_ID");
				float price = srs.getFloat("PRICE");
				int sales = srs.getInt("SALES");
				int total = srs.getInt("TOTAL");
				System.out.print(name + "   " + id + "   " + price);
				System.out.println("   " + sales + "   " + total);
			}

			srs.close();
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

