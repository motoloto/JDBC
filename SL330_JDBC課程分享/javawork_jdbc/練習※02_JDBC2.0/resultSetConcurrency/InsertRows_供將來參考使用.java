
import java.sql.*;

public class InsertRows {

	public static void main(String args[]) {

		String url = "jdbc:oracle:thin:@localhost:1521:orcl2";
		Connection con;
		Statement stmt;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch(java.lang.ClassNotFoundException e) {
			System.err.print("ClassNotFoundException: ");
			System.err.println(e.getMessage());
		}

		try {

			con = DriverManager.getConnection(url,
									 "scott", "tiger");

			stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE); // �Φ��զX��-> ��SQL Server 2008 - ���䴩�f�tmoveToInsertRow()...��method  
			                                                                                         // �Φ��զX��-> ��Oracle          - ���䴩�f�tmoveToInsertRow()...��method (�L�Ī���Ū���G���@�~: moveToInsertRow)
      
    //stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE); // ��SQL Server 2008 - ���䴩���زզX
                                                                                                 // ��Oracle          - ���䴩���زզX , �������䴩�f�tmoveToInsertRow()...��method
      
      ResultSet uprs = stmt.executeQuery("SELECT * FROM COFFEES");

			uprs.moveToInsertRow(); 
			
			uprs.updateString("COF_NAME", "Kona");
			uprs.updateInt("SUP_ID", 150);
			uprs.updateFloat("PRICE", 10.99f);
			uprs.updateInt("SALES", 0);
			uprs.updateInt("TOTAL", 0);

			uprs.insertRow();

			uprs.updateString("COF_NAME", "Kona_Decaf");
			uprs.updateInt("SUP_ID", 150);
			uprs.updateFloat("PRICE", 11.99f);
			uprs.updateInt("SALES", 0);
			uprs.updateInt("TOTAL", 0);

			uprs.insertRow();

			uprs.beforeFirst();

			System.out.println("Table COFFEES after insertion:");
			while (uprs.next()) {
				String name = uprs.getString("COF_NAME");
				int id = uprs.getInt("SUP_ID");
				float price = uprs.getFloat("PRICE");
				int sales = uprs.getInt("SALES");
				int total = uprs.getInt("TOTAL");
				System.out.print(name + "   " + id + "   " + price);
				System.out.println("   " + sales + "   " + total);
			}

			uprs.close();
			stmt.close();
			con.close();

		} catch(SQLException ex) {
			System.err.println("SQLException: " + ex.getMessage());
		}
	}
}

