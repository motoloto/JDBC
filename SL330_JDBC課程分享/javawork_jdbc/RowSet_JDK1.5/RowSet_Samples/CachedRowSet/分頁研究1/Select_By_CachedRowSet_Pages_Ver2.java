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
         crs.setCommand("select DEPTNO 部門編號, DNAME 部門名稱 from dept2");
         crs.setPageSize(2);  //設定每頁的筆數
         crs.execute();       //執行Query，會自動連線，之後再斷線

         ResultSetMetaData rsmd = crs.getMetaData();
	       int numberOfColumns = rsmd.getColumnCount();

         for (int i = 1; i <= numberOfColumns; i++)
	          System.out.print(rsmd.getColumnName(i) + " ");
	
         System.out.println();
        
         while (crs.next()) { //第一頁
               for (int i = 1; i <= numberOfColumns; i++) 
		             System.out.print(crs.getString(i) +"       ");
	               System.out.println();  
         }			
         System.out.println("---------------------"); //分頁線
        
         while(crs.nextPage()) { //有下一頁嗎?
            while (crs.next()) {
               for (int i = 1; i <= numberOfColumns; i++) 
		             System.out.print(crs.getString(i) +"       ");
	               System.out.println();  
            }			
            System.out.println("---------------------"); //分頁線
         } 
       
         System.out.println("****************************************************************");
         
         crs.afterLast();
       
         while(crs.previousPage()) { //有上一頁嗎?
           // crs.beforeFirst(); //可省略
            while (crs.next()) {
               for (int i = 1; i <= numberOfColumns; i++) 
		             System.out.print(crs.getString(i) +"       ");
	               System.out.println();  
            }			
            System.out.println("---------------------"); //分頁線
         }  

    }
}