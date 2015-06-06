import java.sql.*;
import java.io.*;

class PhotoWrite {

        static {
            try {
                 Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
            } catch (Exception e) {
                 e.printStackTrace();
            }
        }

        public static void main(String argv[]) {
              Connection con = null;
              PreparedStatement pstmt = null;
              String url = "jdbc:oracle:thin:@localhost:1521:XE";
              String userid = "user1";
              String passwd = "u111";
              String picName = "漂亮嗎.jpg";
	        
              try {
                con = DriverManager.getConnection(url, userid, passwd);
                File pic = new File("picFrom", picName); //相對路徑- picFrom
                                                         //絕對路徑- 譬如:
                                                         //File pic = new File("x:\\aa\\bb\\picFrom", picName);
                long flen = pic.length();
                String fileName = pic.getName();
                int dotPos = fileName.indexOf('.');
                String fno = fileName.substring(0, dotPos);  // .以前的為檔名 不包含
                String format = fileName.substring(dotPos + 1);  // .之後的為副檔名
                InputStream fin = new FileInputStream(pic);  

                System.out.println("\n\nUpdate the database... ");
                pstmt = con.prepareStatement(
                 "insert into EMP_PHOTO (empno, photo_format, picture)  values(?, ?, ?)");
                pstmt.setString(1, fno);  //fno=漂亮
                pstmt.setString(2, format);  //format=jpg
                pstmt.setBinaryStream(3, fin, (int)flen); //void pstmt.setBinaryStream(int parameterIndex, InputStream x, int length) throws SQLException
                int rowsUpdated = pstmt.executeUpdate(); //執行
			
                System.out.print("Changed " + rowsUpdated);

                if (1 == rowsUpdated)  //更動只有一行的話
                    System.out.println(" row.");
                else
                    System.out.println(" rows.");

                fin.close();
                pstmt.close();

              } catch (Exception e) {
                    e.printStackTrace();
              } finally {
                    try {
                      con.close();
                    } catch (SQLException e) {
                    }
             }
      }
}