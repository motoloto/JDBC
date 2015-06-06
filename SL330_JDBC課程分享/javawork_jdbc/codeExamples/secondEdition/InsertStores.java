import java.sql.*;

public class InsertStores {


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

			stmt = con.createStatement();
			con.setAutoCommit(false);

			String insertStore1 = "INSERT INTO STORES VALUES (" +
			  "100001, " +
			  "ADDRESS(888, 'Main_Street', 'Rancho_Alegre', " +
			         "'CA', '94049'), " +
			  "COF_ARRAY('Colombian', 'French_Roast', 'Espresso', " +
			         "'Colombian_Decaf', 'French_Roast_Decaf'), " +
			  "(SELECT OID FROM MANAGERS WHERE MGR_ID = 000001))";

			stmt.addBatch(insertStore1);

			String insertStore2 = "INSERT INTO STORES VALUES (" +
			  "100002, " +
			  "ADDRESS(1560, 'Alder', 'Ochos_Pinos', " +
				  "'CA', '94049'), " +
			  "COF_ARRAY('Colombian', 'French_Roast', 'Espresso', " +
			      "'Colombian_Decaf', 'French_Roast_Decaf', " +
				  "'Kona', 'Kona_Decaf'), " +
			  "(SELECT OID FROM MANAGERS WHERE MGR_ID = 000001))";

			stmt.addBatch(insertStore2);

			String insertStore3 = "INSERT INTO STORES VALUES (" +
			  "100003, " +
			  "ADDRESS(4344, 'First_Street', 'Verona', " +
				  "'CA', '94545'), " +
			  "COF_ARRAY('Colombian', 'French_Roast', 'Espresso', " +
			      "'Colombian_Decaf', 'French_Roast_Decaf', " +
				  "'Kona', 'Kona_Decaf'), " +
			  "(SELECT OID FROM MANAGERS WHERE MGR_ID = 000002))";

			stmt.addBatch(insertStore3);

			String insertStore4 = "INSERT INTO STORES VALUES (" +
			  "100004, " +
			  "ADDRESS(321, 'Sandy_Way', 'La_Playa', " +
				  "'CA', '94544'), " +
			  "COF_ARRAY('Colombian', 'French_Roast', 'Espresso', " +
			      "'Colombian_Decaf', 'French_Roast_Decaf', " +
				  "'Kona', 'Kona_Decaf'), " +
			  "(SELECT OID FROM MANAGERS WHERE MGR_ID = 000002))";

			stmt.addBatch(insertStore4);

			String insertStore5 = "INSERT INTO STORES VALUES (" +
			  "100005, " +
			  "ADDRESS(1000, 'Clover_Road', 'Happyville', " +
				  "'CA', '90566'), " +
			  "COF_ARRAY('Colombian', 'French_Roast', 'Espresso', " +
				  "'Colombian_Decaf', 'French_Roast_Decaf'), " +
			  "(SELECT OID FROM MANAGERS WHERE MGR_ID = 000003))";

			stmt.addBatch(insertStore5);

			int [] updateCounts = stmt.executeBatch();

            ResultSet rs = stmt.executeQuery("SELECT * FROM STORES");

			System.out.println("Table STORES after insertion:");
			System.out.println("STORE_NO  LOCATION          COF_TYPE     MGR");
			while (rs.next()) {
				int storeNo = rs.getInt("STORE_NO");
				Struct location = (Struct)rs.getObject("LOCATION");
				Object[] locAttrs = location.getAttributes();
				Array coffeeTypes =  rs.getArray("COF_TYPE");
				String[] cofTypes = (String[])coffeeTypes.getArray();

				Ref managerRef = rs.getRef("MGR");
				PreparedStatement pstmt = con.prepareStatement(
					"SELECT MANAGER FROM MANAGERS WHERE OID = ?");
				pstmt.setRef(1, managerRef);
				ResultSet rs2 = pstmt.executeQuery();
				rs2.next();
				Struct manager = (Struct)rs2.getObject("MANAGER");
				Object[] manAttrs = manager.getAttributes();
				
				System.out.print(storeNo + "   ");
				System.out.print(locAttrs[0] + " " + locAttrs[1] + " " + 
					locAttrs[2] + ", " + locAttrs[3] + "  " + locAttrs[4] + " ");
				for (int i = 0; i < cofTypes.length; i++)
					System.out.print(cofTypes[i] + " ");
				System.out.println(manAttrs[1] + ", " + manAttrs[2]);

				rs2.close();
				pstmt.close();
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
			System.err.println("SQLException: " + ex.getMessage());
			System.err.println("SQLState:  " + ex.getSQLState());
			System.err.println("Message:  " + ex.getMessage());
			System.err.println("Vendor:  " + ex.getErrorCode());
		}
	}
}



