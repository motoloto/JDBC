import java.sql.*;

class Oracle_Basic1 {

    public static void main(String argv[]) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");  //驅動程式-第四類
            
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");     //驅動程式-第一類: JDBC-ODBC橋接器
            //至 設定-控制台-系統管理工具-資料來源(ODBC)
            //-> 選擇系統資料來源名稱->新增->選Oracle...->完成 
            //-> [Data Source Name(資料來源名稱)\輸入:dsn1] [TNS Service Name\選擇:ORCL2] [User ID\輸入:scott] [OK] -> 確定
        } catch (java.lang.ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
        }

        try {
            Connection con =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "user1", "u111");
            //Connection con =  DriverManager.getConnection("jdbc:odbc:dsn1", "scott", "tiger");  	  	   	

           // Statement stmt = con.createStatement();
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery("SELECT * from emp2");
            
						ResultSetMetaData rsStr=rs.getMetaData();
						int rows=rsStr.getColumnCount();
						String []str= new String[rows];
						
            while (rs.next()) {
            		for(int i=0;i<rows;i++){
            			 str[i] = rs.getString(i+1);
            		}
                String str1 = rs.getString(1);
                String str2 = rs.getString(2);
                String str3 = rs.getString(3);

                System.out.print(" EMPNO= " + str[1]);
                System.out.print(" ENAME= " + str[2]);
                System.out.print(" ENAME= " + str[3]);

        
          
                System.out.print("\n");
            }

            rs.close();
            stmt.close();
            con.close();

        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }
}