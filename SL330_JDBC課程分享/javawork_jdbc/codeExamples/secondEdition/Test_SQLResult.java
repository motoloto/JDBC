import java.sql.*;

public class Test_SQLResult {
  
  public static void main(String argv[]) {
	  Connection con = null;
	  String url = "jdbc:oracle:thin:@localhost:1521:XE";
	  String userid = "user1";
	  String passwd = "u111";
    
    String sql="select * from EMP2";
    //String sql="update EMP2 set SAL=800 where EMPNO=7001";
    //String sql="select * from EMP2 where EMPNO=7001";
    
    
    try {
        Class.forName("oracle.jdbc.driver.OracleDriver");
    } catch (ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
    }

    try {
        
        con = DriverManager.getConnection(url, userid, passwd);
        Statement stmt = con.createStatement();
        
        boolean isRS = stmt.execute(sql);
        /*
          �^�� true : 1. if the first result is a ResultSet object ��, �^�� true; 
                      2. �i�ϥ� ResultSet rs = stmt.getResultSet(); ���X ResultSet
        
          �^�� false: 1. if it is an update count or there are no results, �^�� false 
                      2. �ϥ� int num = stmt.getUpdateCount(); �^�ǧ�ʪ�����
       */
        System.out.println("isRS = "+isRS);
        
        if (isRS==true) {
          //�ϥ� ResultSet rs = stmt.getResultSet(); ���X ResultSet
          ResultSet rs = stmt.getResultSet();
          ResultSetMetaData rsmd = rs.getMetaData();
	        int numberOfColumns = rsmd.getColumnCount();

          for (int i = 1; i <= numberOfColumns; i++)
	          System.out.print(rsmd.getColumnName(i) + " ");
	
          System.out.println();
          while (rs.next()) {
            for (int i = 1; i <= numberOfColumns; i++) 
		         System.out.print(rs.getObject(i) +" ");
	           System.out.println();  
	        }			
        }else 
          //�ϥ� int num = stmt.getUpdateCount(); �^�ǧ�ʪ�����
          System.out.println("��ʪ�����: " + stmt.getUpdateCount() + "��");
    
    } catch (SQLException ex) {
          System.err.println("SQLException: " + ex.getMessage());
    } finally {
          try {
             if (con != null) con.close();
          } catch (SQLException ignored) { }
    }
  }
}
