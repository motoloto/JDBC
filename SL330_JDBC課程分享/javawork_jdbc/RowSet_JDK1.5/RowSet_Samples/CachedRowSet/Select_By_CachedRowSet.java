import java.sql.*;
import java.io.*;
import com.sun.rowset.*;

class Select_By_CachedRowSet {

    public static void main(String[] args) throws Exception {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         CachedRowSetImpl crs = new CachedRowSetImpl();
         crs.setUrl("jdbc:oracle:thin:@localhost:1521:orcl2");
         crs.setUsername("scott");
         crs.setPassword("tiger");
         crs.setCommand("select * from coffees");
         crs.execute(); //執行Query，會自動連線，之後再斷線

         ResultSetMetaData rsmd = crs.getMetaData();
	 int numberOfColumns = rsmd.getColumnCount();

         for (int i = 1; i <= numberOfColumns; i++)
	         System.out.print(rsmd.getColumnName(i) + " ");
	
         System.out.println();
         while (crs.next()) {
            for (int i = 1; i <= numberOfColumns; i++) 
                        System.out.print(crs.getString(i) +" ");
                   System.out.println();  
         }			
         
         System.out.println("========================");         
 
         while (crs.previous()) {
            for (int i = 1; i <= numberOfColumns; i++) 
                         System.out.print(crs.getString(i) +" ");
                   System.out.println();
         }
        
        ObjectOutputStream out =  //額外測試 Serializable
            new ObjectOutputStream(
                new BufferedOutputStream(
                    new FileOutputStream("COFFEES.ser")));
        out.writeObject(crs);
        out.flush();
        out.close();
    }
}