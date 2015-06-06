import java.sql.*;
	 
public class RSMetaDataMethods {

	public static void main(String args[]) {
		  
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
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
	
			stmt = con.createStatement();							
	

		  ResultSet rs = stmt.executeQuery("select * from emp2");
			//ResultSet rs = stmt.executeQuery("select COF_NAME, SUP_ID 供應商編號, PRICE 單價, SALES, TOTAL from COFFEES");
				
			ResultSetMetaData rsmd = rs.getMetaData();
			int numberOfColumns = rsmd.getColumnCount();   // 取得 query 之直欄數
			
			for (int i = 1; i <= numberOfColumns; i++) {
				String colName = rsmd.getColumnName(i);    // 取得 query 之直欄名稱
				String tableName = rsmd.getTableName(i);
				String name = rsmd.getColumnTypeName(i);
				boolean caseSen = rsmd.isCaseSensitive(i);
				boolean writable = rsmd.isWritable(i);
				System.out.println("Information for column " + colName);
				System.out.println("    Column is in table " + tableName);
				System.out.println("    DBMS name for type is " + name);
				System.out.println("    Is case sensitive:  " + caseSen);
				System.out.println("    Is possibly writable:  " + writable);
				System.out.println("");
			}
	
			while (rs.next()) {
				for (int i = 1; i<=numberOfColumns; i++) {
					String s = rs.getString(i);
					System.out.print(s + "  ");
				}
				System.out.println("");
			}
			
			System.out.println();			
			System.out.println(" 本資料庫之 TransactionIsolation level= "+con.getTransactionIsolation());  // 取得 本資料庫之 TransactionIsolation level

			stmt.close();
			con.close();
		
		} catch(SQLException ex) {
			System.err.println("SQLException: " + ex.getMessage());
		}
	}
}
