import java.sql.*;
import com.sun.rowset.*;

class Populate_CachedRowSet {

    public static void main(String argv[]) throws ClassNotFoundException , SQLException{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl2", "scott", "tiger");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from COFFEES");
            CachedRowSetImpl crs = new CachedRowSetImpl();
            crs.populate(rs);   

            rs.close();
            stmt.close();
            con.close(); //【注意: 資料庫連線已在此關閉】
            
            while (crs.next()) {
                String str1 = crs.getString(1);
                String str2 = crs.getString(2);

                System.out.print(" COF_NAME=" + str1);
                System.out.print(" SUP_ID=" + str2);
                System.out.print("\n");
            }
            
            System.out.println("-------------------------------------");
            
            while (crs.previous()) {
                String str1 = crs.getString(1);
                String str2 = crs.getString(2);

                System.out.print(" COF_NAME=" + str1);
                System.out.print(" SUP_ID=" + str2);
                System.out.print("\n");
            }
    }
}