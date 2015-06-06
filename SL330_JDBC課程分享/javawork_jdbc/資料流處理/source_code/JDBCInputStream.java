//1資料流處理
import java.sql.*;
import java.io.*;

public class JDBCInputStream {
    public static void main(String[] args) {
        try {
            String url = "jdbc:oracle:thin:@localhost:1521:XE";
            String driver = "oracle.jdbc.driver.OracleDriver";
            String user = "user1";
            String password = "u111";

            FileInputStream fis = new FileInputStream("JDBCInputStream.java");

            Class.forName(driver);
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement stmt = connection.createStatement();

            //stmt.executeUpdate("DROP TABLE source_code"); //方便二次測試用
            stmt.executeUpdate("CREATE TABLE source_code (name CHAR(20), source LONG VARCHAR)"); // 註: ●使用Microsoft的SQL Server 2008時, 大型文字欄位型態可用【text】或【ntext】或【varchar(max)】或【nvarchar(max)】  ●使用其它資料庫時, 必須用【clob】或【LONG VARCHAR】

            // Create a PreparedStatement to INSERT a row in the table
            String ins = "INSERT INTO source_code VALUES(?,?)";
            PreparedStatement pstmt = connection.prepareStatement(ins);

            // Set values for the placeholders
            pstmt.setString(1, "JDBCInputStream"); // Set first field
            pstmt.setAsciiStream(2, fis, fis.available()); // Stream is source

            int rowsUpdated = pstmt.executeUpdate();
            System.out.println("Rows affected: " + rowsUpdated+"<p dir='ltr' style='margin-left: 20px; margin-right: 0px'></p>");

            // Create a statement object and execute a SELECT
            Statement getCode = connection.createStatement();
            ResultSet rs = getCode.executeQuery("SELECT name,source FROM source_code");
            BufferedReader reader; // Reader for a column
            String input; // Stores an input line

            while (rs.next()){ // For each row
                
                // Create a buffered reader from the stream for a column
                reader = new BufferedReader(new InputStreamReader(rs.getAsciiStream(2)));

                // Read the column data from the buffered reader
                while ((input = reader.readLine()) != null) // While there is a line
                    System.out.println(input); // display it
            }

            connection.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}