import java.sql.*;

class Oracle_Basic_Test2 {

    public static void main(String argv[]) throws ClassNotFoundException , SQLException{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl2", "scott", "tiger");
            
            //以下為相同結果的三種寫法
            
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * from EMP2 where empno=7001");
          
            /*
             PreparedStatement pstmt = con.prepareStatement("SELECT * from EMP2 where EMPNO=7001");
             ResultSet rs = pstmt.executeQuery();
            */
            
             /*
             PreparedStatement pstmt = con.prepareStatement("SELECT * from EMP2 where EMPNO=?");
             pstmt.setString(1,"7001");   
             ResultSet rs = pstmt.executeQuery();
                                       // pstmt.setString(1,"7001"); pstmt.setInt(1,7001); 皆可
                                       // 注意原欄位型別是int, 用pstmt.setString(1,"7001");也可以 
             */ 
            
            
            while (rs.next()) {
                String str1 = rs.getString(1);
                String str2 = rs.getString(2);
                
                System.out.print(" EMPNO= " + str1);
                System.out.print(" ENAME= " + str2);
                System.out.print("\n");
            }
 
            con.close();
 
    }
}