import java.net.URL;
import java.sql.*;
     
public class TypeInfo {

	public static void main(String args[]) {
		  
		String url = "jdbc:mySubprotocol:myDataSource";
		Connection con;
		DatabaseMetaData dbmd;      
	
	
		try {
			Class.forName("myDriver.ClassName");

		} catch(java.lang.ClassNotFoundException e) {
			System.err.print("ClassNotFoundException: "); 
			System.err.println(e.getMessage());
		}

		try {
			con = DriverManager.getConnection(url, 
								 "myLogin", "myPassword");

			dbmd = con.getMetaData();      

			ResultSet rs = dbmd.getTypeInfo();
			while (rs.next()) {
				String typeName = rs.getString("TYPE_NAME");
				short dataType = rs.getShort("DATA_TYPE");
				String createParams = rs.getString("CREATE_PARAMS");
				int nullable = rs.getInt("NULLABLE");
				boolean caseSensitive = rs.getBoolean("CASE_SENSITIVE");
				System.out.println("DBMS type " + typeName + ":");
				System.out.println("     java.sql.Types:  "  + dataType);
				System.out.print("     parameters used to create: ");
				System.out.println(createParams);
				System.out.println("     nullable?:  "  + nullable);
				System.out.print("     case sensitive?:  ");
				System.out.println(caseSensitive);
				System.out.println("");

			}

			con.close();


		} catch(SQLException ex) {
			System.err.println("SQLException: " + ex.getMessage());
		}
	}
}

