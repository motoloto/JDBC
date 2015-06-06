import java.sql.*;
import com.sun.rowset.*;

class Delete_From_CachedRowSet {

    public static void main(String[] args) throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        CachedRowSetImpl crs = new CachedRowSetImpl();
         crs.setUrl("jdbc:oracle:thin:@localhost:1521:orcl2");
         crs.setUsername("scott");
         crs.setPassword("tiger");
         crs.setCommand("select COF_NAME from COFFEES where COF_NAME like ?");
         crs.setString(1,"ÂÅ¤s©@°Ø%");
         crs.setTableName("COFFEES");
         crs.execute();

         while (crs.next()) {
            crs.deleteRow();
         }
        
         crs.acceptChanges();
    }
}