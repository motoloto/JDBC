import java.sql.*;

public class ScrollableResultSet {

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

			srs.absolute(4); 
			int rowNum = srs.getRow(); // rowNum should be 4
			System.out.println("rowNum should be 4 " + rowNum);
			srs.relative(-3); 
			rowNum = srs.getRow(); // rowNum should be 1
			System.out.println("rowNum should be 1 " + rowNum);
			srs.relative(2); 
			rowNum = srs.getRow(); // rowNum should be 3
			System.out.println("rowNum should be 3 " + rowNum);

			srs.absolute(1);
			System.out.println("after last? " + srs.isAfterLast() );
			if (!srs.isAfterLast()) {
				String name = srs.getString("COF_NAME");
				float price = srs.getFloat("PRICE");
				System.out.println(name + "     " + price);
			}

			srs.afterLast();
			while (srs.previous()) {
				String name = srs.getString("COF_NAME");
				float price = srs.getFloat("PRICE");
				System.out.println(name + "     " + price);
			}

			srs.close();
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
			System.out.println("");

		} catch(SQLException ex) {
			System.err.println("-----SQLException-----");
			System.err.println("SQLState:  " + ex.getSQLState());
			System.err.println("Message:  " + ex.getMessage());
			System.err.println("Vendor:  " + ex.getErrorCode());
		}
	}
}

