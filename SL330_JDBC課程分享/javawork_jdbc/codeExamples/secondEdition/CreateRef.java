import java.sql.*;

public class CreateRef {

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
			String createManagers = "CREATE TABLE MANAGERS OF MANAGER " +
						"(OID REF(MANAGER) VALUES ARE SYSTEM GENERATED)";

			String insertManager1 = "INSERT INTO MANAGERS " +
					"(MGR_ID, LAST_NAME, FIRST_NAME, PHONE) VALUES " +
					"(000001, 'MONTOYA', 'ALFREDO', '8317225600')";

			String insertManager2 = "INSERT INTO MANAGERS " +
					"(MGR_ID, LAST_NAME, FIRST_NAME, PHONE) VALUES " +
					"(000002, 'HASKINS', 'MARGARET', '4084355600')";

			String insertManager3 = "INSERT INTO MANAGERS " +
					"(MGR_ID, LAST_NAME, FIRST_NAME, PHONE) VALUES " +
					"(000003, 'CHEN', 'HELEN', '4153785600')";

			con = DriverManager.getConnection(url,
									"myLogin", "myPassword");

			stmt = con.createStatement();
			stmt.executeUpdate(createManagers);

			con.setAutoCommit(false);

			stmt.addBatch(insertManager1);
			stmt.addBatch(insertManager2);
			stmt.addBatch(insertManager3);
			int [] updateCounts = stmt.executeBatch();
			
			con.commit();

			System.out.println("Update count for:  ");
			for(int i = 0; i < updateCounts.length; i++) {
				System.out.print("    command " + (i + 1) + " = ");
				System.out.println(updateCounts[i]);
			}

			stmt.close();
			con.close();

		} catch(BatchUpdateException b) {
            System.err.println("-----BatchUpdateException-----");
            System.err.println("Message:  " + b.getMessage());
            System.err.println("SQLState:  " + b.getSQLState());
            System.err.println("Vendor:  " + b.getErrorCode());
            System.err.print("Update counts for successful commands:  ");
            int [] rowsUpdated = b.getUpdateCounts();
            for (int i = 0; i < rowsUpdated.length; i++) {
                System.err.print(rowsUpdated[i] + "   ");
            }
            System.err.println("");
		} catch(SQLException ex) {
			System.err.println("------SQLException------");
			System.err.println("Error message:  " + ex.getMessage());
			System.err.println("SQLState:  " + ex.getSQLState());
			System.err.println("Vendor:  " + ex.getErrorCode());
		}
	}
}

