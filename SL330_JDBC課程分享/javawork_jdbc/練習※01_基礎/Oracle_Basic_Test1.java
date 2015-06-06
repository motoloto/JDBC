import java.sql.*;

class Oracle_Basic_Test1 {

    public static void main(String argv[]) throws ClassNotFoundException , SQLException{
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl2", "scott", "tiger");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * from EMP2");
            
            //��¦��-��Ʈw�������`�N�ƶ�:
            
            while (rs.next()) {
                //��쫬�A- int:  
                //String str1 = rs.getString(1);  String str1 = rs.getString("empno");  
                //Object str1 = rs.getObject(1);  Object str1 = rs.getObject("empno");
                //int str1 = rs.getInt(1);        int str1 = rs.getInt("empno");
                int str1 = rs.getInt(1);
                
                //��쫬�A- VARCHAR: 
                //String str2 = rs.getString(2);
                //-->run time exception �ܽd: int str2 = rs.getInt(2);
                String str2 = rs.getString(2);
                
                //��쫬�A- float:   
                //String str5 = rs.getString(5);       �i5000.5�j
                //int str5 = rs.getInt(5);             �i5000 ���`�N: ��ƺI�_�j
                //float str5 = rs.getFloat(5);         �i5000.5�j
                float str5 = rs.getFloat(5);            
                
                //��쫬�A- date:
                //String str4 = rs.getString(4);       �iOracle�d�ߥ���to_char��, �|��1981-11-17 00:00:00.0�����G�j
                //Object str4 = rs.getObject(4);       �iOracle�d�ߥ���to_char��, �|��1981-11-17 00:00:00.0 �� 1981-11-17�����G�j
                //java.sql.Date str4 = rs.getDate(4);  �i1981-11-17  ���`�N: �Ojava.sql.Date�j
                //java.util.Date str4 = rs.getDate(4); �i1981-11-17  ��OK , why??�j
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
            
             /* �B�~����
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