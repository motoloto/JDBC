import java.sql.*;

class Cursor_JDBC2 {

    public static void main(String argv[]) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");  //驅動程式-第四類
        } catch (java.lang.ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
        }

        try {
              Connection con =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl2", "scott", "tiger");

              //Statement stmt = con.createStatement();  //SQLException: Oracle - 無效的僅轉送結果集作業: beforeFirst
                                                         //SQLException: Microsoft SQL Server 2008 - 不支援在順向結果集上執行要求的作業。
              
              //Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
              //Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);  // ●Microsoft SQL Server 2008 - 不支援此種組合
              //Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
              Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
              
              ResultSet rs = stmt.executeQuery("select * from emp2");
                
                System.out.println("起始位置="+ rs.getRow());
                rs.next();  //不可遺漏 rs.next();
                System.out.print(rs.getRow()+" ");
                System.out.print(" empno= " + rs.getString(1));
                System.out.print(" firstname= " + rs.getString(2) +"\n");
                rs.beforeFirst();
            
            System.out.println("-------------------------A---------------------------");
            
            while (rs.next()) {
                System.out.print(rs.getRow()+" ");
                System.out.print(" empno= " + rs.getString(1));
                System.out.print(" firstname= " + rs.getString(2) +"\n");
            }

            System.out.println("-------------------------B---------------------------");
           
            while (rs.previous()) {
                System.out.print(rs.getRow()+" ");
                System.out.print(" empno= " + rs.getString(1));
                System.out.print(" firstname= " + rs.getString(2) +"\n");
            }
        
            System.out.println("-------------------------C---------------------------");
           
                rs.absolute(1);     //rs.absolute(1); rs.absolute(-1); rs.absolute(-2); rs.absolute(10000)??;
                                    //absolute(0) 時 -->runtime Exception  呼叫的橫列值無效。 
                rs.relative(0);     //rs.relative(1); rs.relative(-1); rs.relative(-2); rs.relative(10000)??;
                   
                rs.first();         
                //rs.first(); rs.last();  
                //Calling absolute(1) is the same as calling first().
                //Calling absolute(-1) is the same as calling last().
                System.out.print(rs.getRow()+" ");
                System.out.print(" empno= " + rs.getString(1));
                System.out.print(" firstname= " + rs.getString(2) +"\n");
              
            System.out.println("-------------------------D---------------------------");
            
                rs.last();
                int len=rs.getRow();
                System.out.println("※全部資料共"+len+"筆"+" [使用ResultSet游標移動的方式]");
                rs.beforeFirst();
                
            System.out.println("-------------------------E---------------------------");
            
                ResultSet rs2 = stmt.executeQuery("select count(*) as count from EMP2");
                rs2.next();
                int len2=rs2.getInt("count");
                System.out.println("※全部資料共"+len2+"筆"+" [直接下SQL指令的方式]");
                
                
            
            rs.close();
            stmt.close();
            con.close();

        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }
}