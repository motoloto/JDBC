import java.sql.*;
import java.io.*;
import com.sun.rowset.*;

class Write_To_Xml {

    public static void main(String[] args) throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        WebRowSetImpl wrs = new WebRowSetImpl();
        wrs.setUrl("jdbc:oracle:thin:@localhost:1521:orcl2");
        wrs.setUsername("scott");
        wrs.setPassword("tiger");
        wrs.setCommand("select * from COFFEES");
        wrs.execute();

        BufferedWriter out = new BufferedWriter( new FileWriter("COFFEES.xml"));
        wrs.writeXml(out);  //● writeXml method
                            //將wrs物件, 轉成COFFEES.xml檔案
                            //查看介面 javax.sql.rowset.WebRowSet
                            //或類別   com.sun.rowset.WebRowSetImpl 
        out.flush();
        out.close();
   }
}