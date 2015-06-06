import java.sql.*;
import java.io.*;
import com.sun.rowset.*;

class Read_From_Xml_Update {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new FileReader("COFFEES.xml"));
        WebRowSetImpl wrs = new WebRowSetImpl();
        wrs.readXml(in);  //���� readXml method
                          //�NCOFFEES.xml�ɮ�, �নwrs����
                          //�d�ݤ��� javax.sql.rowset.WebRowSet
                          //�����O   com.sun.rowset.WebRowSetImpl 
        in.close();

        ResultSetMetaData rsmd = wrs.getMetaData();
	      int numberOfColumns = rsmd.getColumnCount();

        for (int i = 1; i <= numberOfColumns; i++)
	        System.out.print(rsmd.getColumnName(i) + " ");
	
        System.out.println();
        
        //�� update ���e 
        while (wrs.next()) {
            for (int i = 1; i <= numberOfColumns; i++) 
	           System.out.print(wrs.getString(i) +" ");
	           System.out.println(); 
        }
        
        //���� update wrs���� ��"PRICE"��쪺�� 
        wrs.beforeFirst();
        while (wrs.next()) {
           wrs.updateDouble("PRICE", wrs.getDouble("PRICE") * 2);
           wrs.updateRow();
        }			
         
        
        System.out.println("===============================");         
        //�� update ���� 
        wrs.beforeFirst();
        while (wrs.next()) {
            for (int i = 1; i <= numberOfColumns; i++) 
	           System.out.print(wrs.getString(i) +" ");
	           System.out.println(); 
        }
      
      /*  
        //�P�˥i�H��h
        System.out.println("===============================");         
        while (wrs.previous()) {
            for (int i = 1; i <= numberOfColumns; i++) 
	           System.out.print(wrs.getString(i) +" ");
	           System.out.println(); 
        }
      */
      
        BufferedWriter out = new BufferedWriter(new FileWriter("COFFEES_UPDATED.xml"));
        wrs.writeXml(out);  //���� writeXml method
                            //�N�ק�L�᪺ wrs����, �নCOFFEES_UPDATED.xml�ɮ�
                            //�d�ݤ��� javax.sql.rowset.WebRowSet
                            //�����O   com.sun.rowset.WebRowSetImpl 
        
        out.flush();
        out.close();
    
    }
}
