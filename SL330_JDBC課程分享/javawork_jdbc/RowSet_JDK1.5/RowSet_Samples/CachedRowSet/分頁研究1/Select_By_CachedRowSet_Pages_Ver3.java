import java.sql.*;
import java.io.*;
import com.sun.rowset.*;

class Select_By_CachedRowSet_Pages_Ver3 {

    public static void main(String[] args) throws Exception {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         CachedRowSetImpl crs = new CachedRowSetImpl();
         crs.setUrl("jdbc:oracle:thin:@localhost:1521:orcl2");
         crs.setUsername("scott");
         crs.setPassword("tiger");
         crs.setCommand("select DEPTNO 部門編號, DNAME 部門名稱 from dept2");
         //crs.setCommand("select EMPNO,  ENAME   from emp2");
         crs.setPageSize(3);  //設定每頁的筆數
         crs.execute();       //執行Query，會自動連線，之後再斷線
         ResultSetMetaData rsmd = crs.getMetaData();
	       int numberOfColumns = rsmd.getColumnCount();
         
         System.out.print("       ");
         for (int i = 1; i <= numberOfColumns; i++)
	          System.out.print(rsmd.getColumnName(i) + " ");
	
         System.out.println();
          
         int pageNumber =1;      //第一頁
            while (crs.next()) {
               System.out.print("游標"+crs.getRow()+". ");  //游標位置
               for (int i = 1; i <= numberOfColumns; i++) 
		             System.out.print(crs.getString(i) +"       ");
	             System.out.println();  
            }			
            System.out.print("---------------------------"+"第"+(pageNumber++)+"頁---"); //分頁線
            System.out.print("(注意):(這個列集物件crs.size()="+crs.size()+")---");
            System.out.println("(每頁getPageSize()="+crs.getPageSize()+")");
         
         pageNumber =2; 
         while(crs.nextPage()) { //有下一頁嗎?
            while (crs.next()) {
               System.out.print("游標"+crs.getRow()+". ");  //游標位置
               for (int i = 1; i <= numberOfColumns; i++) 
		             System.out.print(crs.getString(i) +"       ");
	             System.out.println();  
            }			
            System.out.print("---------------------------"+"第"+(pageNumber++)+"頁---"); //分頁線
            System.out.print("(注意):(這個列集物件crs.size()="+crs.size()+")---");
            System.out.println("(每頁getPageSize()="+crs.getPageSize()+")");
         } 
    }
}

/*
   ※注意: Oracle 獨有的 rownum , 其它資料庫是無法使用的, 如以下:

   select * from 
    (select rownum as ranking, ename, job, sal from emp order by empno )
   where ranking between 1 and 5

*/