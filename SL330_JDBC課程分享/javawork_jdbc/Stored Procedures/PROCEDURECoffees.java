
import java.sql.*;
	 
public class PROCEDURECoffees {

   public static void main(String args[]) {
               String coffeeName= "Colombian"; //French_Roast 

               String url = "jdbc:oracle:thin:@localhost:1521:XE";
               String storeedProc= "CREATE OR REPLACE PROCEDURE get_single_row_details(var_COF_NAME in varchar, var_PRICE out varchar) "+
                                   "IS "+ 
                                   "var_temp_PRICE varchar(20); "+ 
                                   "BEGIN "+ 
                                   "SELECT PRICE "+ 
                                   "INTO var_temp_PRICE "+ 
                                   "FROM COFFEES "+
                                   "WHERE COF_NAME = var_COF_NAME; "+
                                   "var_PRICE := var_temp_PRICE; "+ 
                                   "return; "+ 
                                   "END;";
	
                try {
	                Class.forName("oracle.jdbc.driver.OracleDriver");

                } catch(java.lang.ClassNotFoundException e) {
	                System.err.print("ClassNotFoundException: "); 
	                System.err.println(e.getMessage());
                }

                try {
                        Connection con = DriverManager.getConnection(url, "user1", "u111");
                        Statement stmt = con.createStatement();	
                        stmt.executeUpdate(storeedProc);
      
                        CallableStatement cstmt = con.prepareCall("{call get_single_row_details(?, ?)}");
                        cstmt.setString(1, coffeeName);
                        cstmt.registerOutParameter(2, Types.FLOAT);
                        cstmt.execute();
                        float sales = cstmt.getFloat(2);
                        System.out.println(sales);

                        stmt.close();
                        cstmt.close();
                        con.close();
	
                } catch(SQLException ex) {
                        System.err.println("SQLException: " + ex.getMessage());
                }
	 }
}

  /*
    CREATE OR REPLACE PROCEDURE get_single_row_details(var_COF_NAME in varchar2, var_PRICE out varchar2) 
    IS 
    var_temp_PRICE varchar2(20); 
    BEGIN 
      SELECT PRICE 
      INTO var_temp_PRICE 
      FROM COFFEES 
      WHERE COF_NAME = var_COF_NAME; 

      var_PRICE := var_temp_PRICE; 
      return; 
    END;
   */
  
  
  /*
     VARIABLE var_PRICE VARCHAR2(20)
     EXEC get_single_row_details('Colombian',:var_PRICE )
     print :var_PRICE;
  */