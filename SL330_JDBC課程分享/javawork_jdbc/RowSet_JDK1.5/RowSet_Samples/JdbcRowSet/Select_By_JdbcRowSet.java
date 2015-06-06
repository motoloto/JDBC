import java.sql.*;
import java.io.*;
import com.sun.rowset.*;

class Select_By_JdbcRowSet {

    public static void main(String[] args) throws Exception {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         JdbcRowSetImpl jrs = new JdbcRowSetImpl();
         jrs.setUrl("jdbc:oracle:thin:@localhost:1521:orcl2");
         jrs.setUsername("scott");
         jrs.setPassword("tiger");
         jrs.setCommand("select * from coffees");
         jrs.execute(); //執行Query，會自動連線，不會斷線

         ResultSetMetaData rsmd = jrs.getMetaData();
	       int numberOfColumns = rsmd.getColumnCount();

         for (int i = 1; i <= numberOfColumns; i++)
	         System.out.print(rsmd.getColumnName(i) + " ");
	
         System.out.println();
         while (jrs.next()) {
            for (int i = 1; i <= numberOfColumns; i++) 
		         System.out.print(jrs.getString(i) +" ");
	           System.out.println();  
	       }			
         
         
         System.out.println("========================");         
         
         while (jrs.previous()) {
            for (int i = 1; i <= numberOfColumns; i++) 
		         System.out.print(jrs.getString(i) +" ");
	           System.out.println();  
	       }
        
         jrs.close(); //關閉
    }
}