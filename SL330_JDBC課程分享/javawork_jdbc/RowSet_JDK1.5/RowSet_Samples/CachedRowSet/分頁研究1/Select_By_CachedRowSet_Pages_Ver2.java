import java.sql.*;
import java.io.*;
import com.sun.rowset.*;

class Select_By_CachedRowSet_Pages_Ver2 {

    public static void main(String[] args) throws Exception {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         CachedRowSetImpl crs = new CachedRowSetImpl();
         crs.setUrl("jdbc:oracle:thin:@localhost:1521:orcl2");
         crs.setUsername("scott");
         crs.setPassword("tiger");
         crs.setCommand("select DEPTNO �����s��, DNAME �����W�� from dept2");
         crs.setPageSize(2);  //�]�w�C��������
         crs.execute();       //����Query�A�|�۰ʳs�u�A����A�_�u

         ResultSetMetaData rsmd = crs.getMetaData();
	       int numberOfColumns = rsmd.getColumnCount();

         for (int i = 1; i <= numberOfColumns; i++)
	          System.out.print(rsmd.getColumnName(i) + " ");
	
         System.out.println();
        
         while (crs.next()) { //�Ĥ@��
               for (int i = 1; i <= numberOfColumns; i++) 
		             System.out.print(crs.getString(i) +"       ");
	               System.out.println();  
         }			
         System.out.println("---------------------"); //�����u
        
         while(crs.nextPage()) { //���U�@����?
            while (crs.next()) {
               for (int i = 1; i <= numberOfColumns; i++) 
		             System.out.print(crs.getString(i) +"       ");
	               System.out.println();  
            }			
            System.out.println("---------------------"); //�����u
         } 
       
         System.out.println("****************************************************************");
         
         crs.afterLast();
       
         while(crs.previousPage()) { //���W�@����?
           // crs.beforeFirst(); //�i�ٲ�
            while (crs.next()) {
               for (int i = 1; i <= numberOfColumns; i++) 
		             System.out.print(crs.getString(i) +"       ");
	               System.out.println();  
            }			
            System.out.println("---------------------"); //�����u
         }  

    }
}