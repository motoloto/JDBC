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
         crs.setCommand("select DEPTNO �����s��, DNAME �����W�� from dept2");
         //crs.setCommand("select EMPNO,  ENAME   from emp2");
         crs.setPageSize(3);  //�]�w�C��������
         crs.execute();       //����Query�A�|�۰ʳs�u�A����A�_�u
         ResultSetMetaData rsmd = crs.getMetaData();
	       int numberOfColumns = rsmd.getColumnCount();
         
         System.out.print("       ");
         for (int i = 1; i <= numberOfColumns; i++)
	          System.out.print(rsmd.getColumnName(i) + " ");
	
         System.out.println();
          
         int pageNumber =1;      //�Ĥ@��
            while (crs.next()) {
               System.out.print("���"+crs.getRow()+". ");  //��Ц�m
               for (int i = 1; i <= numberOfColumns; i++) 
		             System.out.print(crs.getString(i) +"       ");
	             System.out.println();  
            }			
            System.out.print("---------------------------"+"��"+(pageNumber++)+"��---"); //�����u
            System.out.print("(�`�N):(�o�ӦC������crs.size()="+crs.size()+")---");
            System.out.println("(�C��getPageSize()="+crs.getPageSize()+")");
         
         pageNumber =2; 
         while(crs.nextPage()) { //���U�@����?
            while (crs.next()) {
               System.out.print("���"+crs.getRow()+". ");  //��Ц�m
               for (int i = 1; i <= numberOfColumns; i++) 
		             System.out.print(crs.getString(i) +"       ");
	             System.out.println();  
            }			
            System.out.print("---------------------------"+"��"+(pageNumber++)+"��---"); //�����u
            System.out.print("(�`�N):(�o�ӦC������crs.size()="+crs.size()+")---");
            System.out.println("(�C��getPageSize()="+crs.getPageSize()+")");
         } 
    }
}

/*
   ���`�N: Oracle �W���� rownum , �䥦��Ʈw�O�L�k�ϥΪ�, �p�H�U:

   select * from 
    (select rownum as ranking, ename, job, sal from emp order by empno )
   where ranking between 1 and 5

*/