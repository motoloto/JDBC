
import java.sql.*;
	 
public class PROCEDURECoffees2 {

      public static void main(String args[]) {
               String coffeeName= "Colombian"; //French_Roast 

               String url = "jdbc:oracle:thin:@localhost:1521:orcl2";
               String storeedProc= "CREATE OR REPLACE PROCEDURE INSERT_COFFEES "+
                                   "(COF_NAME in VARCHAR, SUP_ID in INTEGER, PRICE in  FLOAT, "+
                                   "SALES in INTEGER, TOTAL in INTEGER) "+
                                   "IS "+
                                   "BEGIN "+ 
                                   "INSERT INTO COFFEES "+
                                   "(COF_NAME , SUP_ID, PRICE, SALES,TOTAL) "+
                                   "VALUES "+
                                   "(COF_NAME , SUP_ID, PRICE, SALES,TOTAL); "+
                                   "END; ";

                try {
	                Class.forName("oracle.jdbc.driver.OracleDriver");

                } catch(java.lang.ClassNotFoundException e) {
	                System.err.print("ClassNotFoundException: "); 
	                System.err.println(e.getMessage());
                }

               try {
                        Connection con = DriverManager.getConnection(url, "scott", "tiger");
                        Statement stmt = con.createStatement();	
                        stmt.executeUpdate(storeedProc);
      
                        CallableStatement cstmt = con.prepareCall("{call INSERT_COFFEES(?,?,?,?,?)}");

                        cstmt.setString(1, "藍山咖啡");
                        cstmt.setInt(2, 101);
                        cstmt.setFloat(3, 99.99f);
                        cstmt.setInt(4, 0);
                        cstmt.setInt(5, 0);
      
                        /*也可以  
                            cstmt.setString(1, "藍山咖啡");
                            cstmt.setString(2, "101");
                            cstmt.setString(3, "99.99");
                            cstmt.setString(4, "0");
                            cstmt.setString(5, "0");
                        */  
                        
                        cstmt.execute();
	
                        stmt.close();
                        cstmt.close();
                        con.close();
	
               } catch(SQLException ex) {
                    System.err.println("SQLException: " + ex.getMessage());
               }
      }
}

/*
DROP TABLE COFFEES;
 
CREATE TABLE COFFEES 
 (COF_NAME varchar(32), 
  SUP_ID int, 
  PRICE float, 
  SALES int, 
  TOTAL int);
*/

/* 
CREATE OR REPLACE PROCEDURE INSERT_COFFEES
(COF_NAME in VARCHAR, SUP_ID in INTEGER, PRICE in  FLOAT,
SALES in INTEGER, TOTAL in INTEGER)
IS
 BEGIN 
INSERT INTO COFFEES
(COF_NAME , SUP_ID, PRICE, SALES,TOTAL)
VALUES
(COF_NAME , SUP_ID, PRICE, SALES,TOTAL);
END;
*/

/*
EXEC INSERT_COFFEES('藍山咖啡' , 00101, 99.99, 0, 0);

select * from COFFEES;
*/