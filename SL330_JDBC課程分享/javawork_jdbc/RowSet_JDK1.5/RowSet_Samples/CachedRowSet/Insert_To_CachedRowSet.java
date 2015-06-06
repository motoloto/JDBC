import java.sql.*;
import com.sun.rowset.*;

class Insert_To_CachedRowSet {

    public static void main(String[] args) throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        CachedRowSetImpl crs = new CachedRowSetImpl();
         crs.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
         crs.setUsername("user1");
         crs.setPassword("u111	");
         crs.setCommand("select * from COFFEES");
         crs.setTableName("COFFEES");
         crs.execute();

         for (int i=1; i <= 2 ; i++) {
            crs.moveToInsertRow();
            crs.updateString("COF_NAME","ÂÅ¤s©@°Ø"+i);
            crs.updateFloat("PRICE", 10.5f);
            crs.insertRow();
            crs.moveToCurrentRow();
         }
         System.out.println(crs.getTableName());
         System.out.println(crs.getUrl());
        
         crs.acceptChanges();
    }
}