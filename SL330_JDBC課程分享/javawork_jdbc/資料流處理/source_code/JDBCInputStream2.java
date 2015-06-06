//2��Ƭy�B�z
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

            //stmt.executeUpdate("DROP TABLE source_code2"); //��K�G�����ե�
            stmt.executeUpdate("CREATE TABLE source_code2 (name CHAR(20), source LONG VARCHAR)"); // ��: ���ϥ�Microsoft��SQL Server 2008��, �j����r��쫬�A�i�Ρitext�j�Ρintext�j�Ρivarchar(max)�j�Ρinvarchar(max)�j  ���ϥΨ䥦��Ʈw��, �����Ρiclob�j�ΡiLONG VARCHAR�j

            // Create a PreparedStatement to INSERT a row in the table
            String ins = "INSERT INTO source_code2 VALUES(?,?)";
            PreparedStatement pstmt = connection.prepareStatement(ins);

            // Set values for the placeholders
            pstmt.setString(1, "JDBCInputStream2"); // Set first field
            pstmt.setCharacterStream(2, fr, (int)f1.length()); // Stream is source // ��: ���ϥ�Microsoft��SQL Server 2008��, ������pstmt.setCharacterStream(2, fr);  ����ϥΨ䥦��Ʈw��, �]�i��pstmt.setCharacterStream(2, fr, (int)f1.length()); �� pstmt.setCharacterStream(2, fr, f1.length());

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