import java.sql.*;

class Oracle_Basic_Test1 {

    public static void main(String argv[]) throws ClassNotFoundException , SQLException{
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl2", "scott", "tiger");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * from EMP2");
            
            //基礎的-資料庫取值應注意事項:
            
            while (rs.next()) {
                //欄位型態- int:  
                //String str1 = rs.getString(1);  String str1 = rs.getString("empno");  
                //Object str1 = rs.getObject(1);  Object str1 = rs.getObject("empno");
                //int str1 = rs.getInt(1);        int str1 = rs.getInt("empno");
                int str1 = rs.getInt(1);
                
                //欄位型態- VARCHAR: 
                //String str2 = rs.getString(2);
                //-->run time exception 示範: int str2 = rs.getInt(2);
                String str2 = rs.getString(2);
                
                //欄位型態- float:   
                //String str5 = rs.getString(5);       【5000.5】
                //int str5 = rs.getInt(5);             【5000 ●注意: 資料截斷】
                //float str5 = rs.getFloat(5);         【5000.5】
                float str5 = rs.getFloat(5);            
                
                //欄位型態- date:
                //String str4 = rs.getString(4);       【Oracle查詢未用to_char時, 會有1981-11-17 00:00:00.0的結果】
                //Object str4 = rs.getObject(4);       【Oracle查詢未用to_char時, 會有1981-11-17 00:00:00.0 或 1981-11-17的結果】
                //java.sql.Date str4 = rs.getDate(4);  【1981-11-17  ●注意: 是java.sql.Date】
                //java.util.Date str4 = rs.getDate(4); 【1981-11-17  ●OK , why??】
                java.sql.Date str4 = rs.getDate(4);
                
                System.out.print(" EMPNO= " + str1);
                System.out.print(" ENAME= " + str2);
                System.out.print(" SAL= " + str5);
                System.out.print(" HIREDATE= " + str4);
                System.out.print("\n");
            }
            
            rs.close();
            stmt.close();
            con.close();
            
             /* 額外測試
                System.out.println("----------------------------------------------");
                java.util.Date du = new java.util.Date();
                System.out.println("java.util.Date() = "+ du);
              
                System.out.println("java.sql.Date()  = "+ new java.sql.Date(du.getTime()));
             */
/*
  describe emp2;
  select * from emp2;
*/
    
    }
}