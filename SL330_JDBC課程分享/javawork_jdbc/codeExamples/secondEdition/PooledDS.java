import java.sql.*;
import java.util.*;
import javax.sql.*;
import javax.naming.*;

public class PooledDS {

	public static void main(String args[]) {

		Connection con = null;
		Statement stmt = null;
		try {
			Context ctx = new InitialContext();
			DataSource ds = (DataSource)ctx.lookup("jdbc/myLogicalName");
			con = ds.getConnection("myLogin", "myPassword");

		} catch(java.lang.Exception e) {
			e.printStackTrace();
			System.err.print(e.getClass().getName());
			System.err.println(e.getMessage());
		}

		try {

			stmt = con.createStatement();
			con.setAutoCommit(false);

			stmt.addBatch("INSERT INTO COFFEES " +
				"VALUES('Amaretto', 49, 9.99, 0, 0)");
			stmt.addBatch("INSERT INTO COFFEES " +
				"VALUES('Hazelnut', 49, 9.99, 0, 0)");
			stmt.addBatch("INSERT INTO COFFEES " +
				"VALUES('Amaretto_decaf', 49, 10.99, 0, 0)");
			stmt.addBatch("INSERT INTO COFFEES " +
				"VALUES('Hazelnut_decaf', 49, 10.99, 0, 0)");

			int [] updateCounts = stmt.executeBatch();


            ResultSet rs = stmt.executeQuery("SELECT * FROM COFFEES");

			System.out.println("Table COFFEES after insertion:");
			while (rs.next()) {
				String name = rs.getString("COF_NAME");
				int id = rs.getInt("SUP_ID");
				float price = rs.getFloat("PRICE");
				int sales = rs.getInt("SALES");
				int total = rs.getInt("TOTAL");
				System.out.print(name + "   " + id + "   " + price);
				System.out.println("   " + sales + "   " + total);
			}

			rs.close();
			stmt.close();
			con.close();

		} catch(BatchUpdateException b) {
			System.err.println("-----BatchUpdateException-----");
			System.err.println("SQLState:  " + b.getSQLState());
			System.err.println("Message:  " + b.getMessage());
			System.err.println("Vendor:  " + b.getErrorCode());
			System.err.print("Update counts:  ");
			int [] updateCounts = b.getUpdateCounts();
			for (int i = 0; i < updateCounts.length; i++) {
				System.err.print(updateCounts[i] + "   ");
			}
			System.err.println("");

		} catch(SQLException ex) {
			System.err.println("-----SQLException-----");
			System.err.println("SQLState:  " + ex.getSQLState());
			System.err.println("Message:  " + ex.getMessage());
			System.err.println("Vendor:  " + ex.getErrorCode());
		}
	}
}

