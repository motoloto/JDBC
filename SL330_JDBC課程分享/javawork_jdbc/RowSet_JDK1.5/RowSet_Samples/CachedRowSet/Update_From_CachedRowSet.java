import java.sql.*;
import com.sun.rowset.*;

class Update_From_CachedRowSet {

    public static void main(String[] args) throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        CachedRowSetImpl crs = new CachedRowSetImpl();
         crs.setUrl("jdbc:oracle:thin:@localhost:1521:orcl2");
         crs.setUsername("scott");
         crs.setPassword("tiger");
         crs.setCommand("select * from COFFEES where COF_NAME like ?");
         crs.setString(1,"Colombian%");
         crs.setTableName("coffees");
         crs.execute();

         while (crs.next()) {
            crs.updateDouble("PRICE", crs.getDouble("PRICE") * 2);
            crs.updateRow();
         }
        
         crs.acceptChanges();
    }
}