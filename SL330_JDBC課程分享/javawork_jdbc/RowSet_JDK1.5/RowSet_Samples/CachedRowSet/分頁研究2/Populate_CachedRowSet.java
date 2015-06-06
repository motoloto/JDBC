import java.sql.*;
import com.sun.rowset.*;

class Populate_CachedRowSet {

    public static void main(String argv[]) throws ClassNotFoundException , SQLException{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl2", "scott", "tiger");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select DEPTNO 部門編號, DNAME 部門名稱 from dept2");
            CachedRowSetImpl crs = new CachedRowSetImpl();
            crs.populate(rs);   

            rs.close();
            stmt.close();
            con.close(); //【注意: 資料庫連線已在此關閉】
            
            while (crs.next()) {
                String str1 = crs.getString(1);
                String str2 = crs.getString(2);

                System.out.print(" 部門編號=" + str1);
                System.out.print(" 部門名稱=" + str2);
                System.out.print("\n");
            }
            
            System.out.println("-------------------------------------");
            
            while (crs.previous()) {
                String str1 = crs.getString(1);
                String str2 = crs.getString(2);

                System.out.print(" 部門編號=" + str1);
                System.out.print(" 部門名稱=" + str2);
                System.out.print("\n");
            }
    }
}