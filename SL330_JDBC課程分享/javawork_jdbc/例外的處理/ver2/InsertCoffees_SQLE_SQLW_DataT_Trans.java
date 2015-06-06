import java.sql.*;

public class InsertCoffees_SQLE_SQLW_DataT_Trans {

    public static void main(String args[]) {

        String url = "jdbc:oracle:thin:@localhost:1521:orcl2";
        String user = "scott";
        String passwd = "tiger";
        Connection con = null;
        Statement stmt;
        ResultSet rs;
        String query = "select COF_NAME , PRICE from COFFEES order by COF_NAME";
        String query2 = "select COF_NAME , PRICE from COFFEES2 order by COF_NAME";

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (java.lang.ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
        }

        try {
            con = DriverManager.getConnection(url, user, passwd);
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);

            System.out.println(
            "●insert之前===============================================");
            while (rs.next()) {
                String s = rs.getString("COF_NAME");
                int f = rs.getInt("PRICE"); //float f = rs.getFloat("PRICE");  //int f = rs.getInt("PRICE");
                System.out.println("\t" + s + "   " + f);

                SQLWarning stmt_Warning = stmt.getWarnings(); //捕捉警告 (但是Oracle不支援)
                printWarning(stmt_Warning);
                SQLWarning rs_Warning = rs.getWarnings();     //捕捉警告 (但是Oracle不支援)
                printWarning(rs_Warning);
            }
            System.out.println();

            //●insert資料
            con.setAutoCommit(false);
             stmt.executeUpdate("insert into COFFEES values('1_Colombian', 00101, 7.99, 0, 0)");
             stmt.executeUpdate("insert into COFFEES values('2_French_Roast', 00049, 8.99, 0, 0)");
             stmt.executeUpdate("insert into COFFEES values('3_Espresso', 00150, 9.99, 0, 0)");
             stmt.executeUpdate("insert into COFFEES values('4_Colombian_Decaf', 00101, 8.99, 0, 0)");
             stmt.executeUpdate("insert into COFFEES values('5_French_Roast_Decaf', 00049, 9.99, 0, 0)");
            con.commit();
            con.setAutoCommit(true);
            
            rs = stmt.executeQuery(query2);
            
            System.out.println(
            "●insert之後===============================================");
            while (rs.next()) {
                String s = rs.getString("COF_NAME");
                float f = rs.getFloat("PRICE"); //float f = rs.getFloat("PRICE");  //int f = rs.getInt("PRICE");
                System.out.println("\t" + s + "   " + f);

                SQLWarning stmt_Warning = stmt.getWarnings(); //捕捉警告 (但是Oracle不支援)
                printWarning(stmt_Warning);
                SQLWarning rs_Warning = rs.getWarnings();     //捕捉警告 (但是Oracle不支援)
                printWarning(rs_Warning);
            }
            System.out.println();

            stmt.close();
            con.close();

        } catch (SQLException ex) {
            
            SQLException gen = new SQLException("SQL 操作已經取消", "S1008", 0);
            ex.setNextException(gen); // Append the old exception
            
            while (ex != null) {
                System.err.println("-------------SQLException caught-------------");
                System.err.println("Message: " + ex.getMessage()); //回傳String
                System.err.println("SQL state: " + ex.getSQLState()); //回傳String
                System.err.println("Vendor code: " + ex.getErrorCode()); //回傳int
                ex = ex.getNextException();
            }

            if (con != null) {
                try {
                    System.err.print("-------Transaction is being rolled back------ ");
                    con.rollback(); //設定於當有exception發生時之catch區塊內     
                } catch (SQLException excep) {
                    System.err.print("SQLException: ");
                    System.err.println(excep.getMessage());
                }
            }

        }
    }
    static boolean printWarning(SQLWarning w) throws SQLException {
        if (w == null)
            return false;
        while (w != null) {
            System.err.println("\n----Warning----");
            System.err.println("Message: " + w.getMessage());
            System.err.println("SQL state: " + w.getSQLState());
            System.err.println("Vendor code: " + w.getErrorCode());
            System.out.println("---------------");
            w = w.getNextWarning();
            System.out.println();
        }
        return true;
    }
}
