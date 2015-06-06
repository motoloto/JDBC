import java.sql.*;
import java.io.*;
import com.sun.rowset.*;

class Read_From_Xml_Update {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new FileReader("COFFEES.xml"));
        WebRowSetImpl wrs = new WebRowSetImpl();
        wrs.readXml(in);  //↓● readXml method
                          //將COFFEES.xml檔案, 轉成wrs物件
                          //查看介面 javax.sql.rowset.WebRowSet
                          //或類別   com.sun.rowset.WebRowSetImpl 
        in.close();

        ResultSetMetaData rsmd = wrs.getMetaData();
	      int numberOfColumns = rsmd.getColumnCount();

        for (int i = 1; i <= numberOfColumns; i++)
	        System.out.print(rsmd.getColumnName(i) + " ");
	
        System.out.println();
        
        //↓ update 之前 
        while (wrs.next()) {
            for (int i = 1; i <= numberOfColumns; i++) 
	           System.out.print(wrs.getString(i) +" ");
	           System.out.println(); 
        }
        
        //↓● update wrs物件 的"PRICE"欄位的值 
        wrs.beforeFirst();
        while (wrs.next()) {
           wrs.updateDouble("PRICE", wrs.getDouble("PRICE") * 2);
           wrs.updateRow();
        }			
         
        
        System.out.println("===============================");         
        //↓ update 之後 
        wrs.beforeFirst();
        while (wrs.next()) {
            for (int i = 1; i <= numberOfColumns; i++) 
	           System.out.print(wrs.getString(i) +" ");
	           System.out.println(); 
        }
      
      /*  
        //同樣可以到退
        System.out.println("===============================");         
        while (wrs.previous()) {
            for (int i = 1; i <= numberOfColumns; i++) 
	           System.out.print(wrs.getString(i) +" ");
	           System.out.println(); 
        }
      */
      
        BufferedWriter out = new BufferedWriter(new FileWriter("COFFEES_UPDATED.xml"));
        wrs.writeXml(out);  //↓● writeXml method
                            //將修改過後的 wrs物件, 轉成COFFEES_UPDATED.xml檔案
                            //查看介面 javax.sql.rowset.WebRowSet
                            //或類別   com.sun.rowset.WebRowSetImpl 
        
        out.flush();
        out.close();
    
    }
}
