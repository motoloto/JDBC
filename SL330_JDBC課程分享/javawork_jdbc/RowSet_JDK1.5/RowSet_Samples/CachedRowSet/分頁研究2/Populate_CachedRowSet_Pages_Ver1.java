import java.sql.*;
import com.sun.rowset.*;

class Populate_CachedRowSet_Pages_Ver1 {

    public static void main(String argv[]) throws ClassNotFoundException , SQLException{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl2", "scott", "tiger");
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("select DEPTNO 部門編號, DNAME 部門名稱 from dept2");
                rs.last();
                int len=rs.getRow();
                System.out.println("※全部資料總共有="+len+"筆");
                //rs.beforeFirst();  //以此範例而言, 此行程式碼可以省去          
            
            CachedRowSetImpl crs = new CachedRowSetImpl();
            crs.setPageSize(3);    //●設定每頁的筆數
            crs.populate(rs,1);    //●注意此強大功能  
            System.out.println("※每一頁有3筆");
            
            rs.close();
            stmt.close();
            con.close(); //【注意: 資料庫連線已在此關閉】

            System.out.println("※取出從第1筆開始的那一頁");
            while (crs.next()) {   //●取出要的那一頁而已 ●實在太優秀了...
                String str1 = crs.getString(1);
                String str2 = crs.getString(2);

                System.out.print(" 部門編號=" + str1);
                System.out.print(" 部門名稱=" + str2);
                System.out.print("\n");
            }
    }
}