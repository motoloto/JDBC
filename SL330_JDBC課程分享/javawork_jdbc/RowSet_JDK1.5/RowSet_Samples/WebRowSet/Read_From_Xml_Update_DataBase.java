import java.sql.*;
import java.io.*;
//import sun.jdbc.rowset.*;
import com.sun.rowset.*;

class Read_From_Xml_Update_DataBase {

    public static void main(String[] args) throws Exception {
        
        BufferedReader in = new BufferedReader(new FileReader("COFFEES_UPDATED.xml"));
        WebRowSetImpl wrs = new WebRowSetImpl();
        wrs.readXml(in);   //���� readXml method
                           //�NCOFFEES_UPDATED.xml�ɮ�, �নwrs����
                           //�d�ݤ��� javax.sql.rowset.WebRowSet
                           //�����O   com.sun.rowset.WebRowSetImpl 
        in.close();

        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl2", "scott", "tiger");
        wrs.acceptChanges(con);  //�����Nwrs����e�i��Ʈw
        con.close();
        
        ResultSetMetaData rsmd = wrs.getMetaData();
	      int numberOfColumns = rsmd.getColumnCount();

        for (int i = 1; i <= numberOfColumns; i++)
	        System.out.print(rsmd.getColumnName(i) + " ");
	
        System.out.println();
        
        while (wrs.next()) { //���K�d��wrs
           for (int i = 1; i <= numberOfColumns; i++) 
	          System.out.print(wrs.getString(i) +" ");
	          System.out.println();  
        }
    }
}
