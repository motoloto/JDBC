import java.sql.*;
     
public class Dereference {

	public static void main(String [] args) {
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

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM BOOKS");
			while (rs.next()) {
				int id = rs.getInt("BOOK_ID");
				String title = rs.getString("TITLE");
				Ref author = rs.getRef("AUTHOR");

				PreparedStatement pstmt = con.prepareStatement(
					"SELECT LAST_NAME, FIRST_NAME, PUBLISHER, TYPE " +
					"FROM WRITERS WHERE OID = ?");
				pstmt.setRef(1, author);
				ResultSet rs2 = pstmt.executeQuery();
				rs2.next();
				String last = rs2.getString("LAST_NAME");
				String first = rs2.getString("FIRST_NAME");
				String publisher = rs2.getString("PUBLISHER");
				String type = rs2.getString("TYPE");

				System.out.println(id + "  " + title + "  " + first +
					 " " + last + "  " + publisher + "  " + type); 
				rs2.close();
				pstmt.close();
			}

			stmt.close();
			con.close();
		} catch(SQLException ex) {
			System.err.println("SQLException: " + ex.getMessage());
		}	
	}
}


