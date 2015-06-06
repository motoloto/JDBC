//2資料流處理
import java.sql.*;
import java.io.*;

public class JDBCInputStream2 {
    public static void main(String[] args) {
        try {
            String url = "jdbc:oracle:thin:@localhost:1521:XE";
            String driver = "oracle.jdbc.driver.OracleDriver";
            String user = "user1";
            String password = "u111";
            
            File f1 =new File("JDBCInputStream2.java");
            FileReader fr = new FileReader(f1);

            Class.forName(driver);
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement stmt = connection.createStatement();

            //stmt.executeUpdate("DROP TABLE source_code2"); //方便二次測試用
            stmt.executeUpdate("CREATE TABLE source_code2 (name CHAR(20), source LONG VARCHAR)"); // 註: ●使用Microsoft的SQL Server 2008時, 大型文字欄位型態可用【text】或【ntext】或【varchar(max)】或【nvarchar(max)】  ●使用其它資料庫時, 必須用【clob】或【LONG VARCHAR】

            // Create a PreparedStatement to INSERT a row in the table
            String ins = "INSERT INTO source_code2 VALUES(?,?)";
            PreparedStatement pstmt = connection.prepareStatement(ins);

            // Set values for the placeholders
            pstmt.setString(1, "JDBCInputStream2"); // Set first field
            pstmt.setCharacterStream(2, fr, (int)f1.length()); // Stream is source // 註: ●使用Microsoft的SQL Server 2008時, 必須用pstmt.setCharacterStream(2, fr);  ●當使用其它資料庫時, 也可用pstmt.setCharacterStream(2, fr, (int)f1.length()); 或 pstmt.setCharacterStream(2, fr, f1.length());

            int rowsUpdated = pstmt.executeUpdate();
            System.out.println("Rows affected: " + rowsUpdated);

            // Create a statement object and execute a SELECT
            Statement getCode = connection.createStatement();
            ResultSet rs = getCode.executeQuery("SELECT name,source FROM source_code2");
            BufferedReader reader; // Reader for a column
            String input; // Stores an input line

            while (rs.next()) {
                
                reader = new BufferedReader(rs.getCharacterStream(2));

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