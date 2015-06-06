import java.sql.*;
     
public class PrimaryKeysSuppliers  {

	public static void main(String args[]) {
		  
		String url = "jdbc:mySubprotocol:myDataSource";
		Connection con;
		String createString = "create table SUPPLIERSPK " +
								"(SUP_ID INTEGER NOT NULL, " +
								"SUP_NAME VARCHAR(40), " +
								"STREET VARCHAR(40), " +
								"CITY VARCHAR(20), " +
								"STATE CHAR(2), " +
								"ZIP CHAR(5), " +
								"primary key(SUP_ID))";
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
			
			stmt  = con.createStatement();
			stmt.executeUpdate(createString);
	
			DatabaseMetaData dbmd = con.getMetaData();
	
			ResultSet rs = dbmd.getPrimaryKeys(null, null, "SUPPLIERSPK");
			while (rs.next()) {
				String name = rs.getString("TABLE_NAME");
				String columnName = rs.getString("COLUMN_NAME");
				String keySeq = rs.getString("KEY_SEQ");
				String pkName = rs.getString("PK_NAME");
				System.out.println("table name :  " + name);
				System.out.println("column name:  " + columnName);
				System.out.println("sequence in key:  " + keySeq);
				System.out.println("primary key name:  " + pkName);
				System.out.println("");
			}
		
			rs.close();
			con.close();
	
		} catch(SQLException ex) {
			System.err.print("SQLException: ");
			System.err.println(ex.getMessage());
		}
	}
}

