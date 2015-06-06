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
              String picName = "�}�G��.jpg";
	        
              try {
                con = DriverManager.getConnection(url, userid, passwd);
                File pic = new File("picFrom", picName); //�۹���|- picFrom
                                                         //������|- Ĵ�p:
                                                         //File pic = new File("x:\\aa\\bb\\picFrom", picName);
                long flen = pic.length();
                String fileName = pic.getName();
                int dotPos = fileName.indexOf('.');
                String fno = fileName.substring(0, dotPos);  // .�H�e�����ɦW ���]�t
                String format = fileName.substring(dotPos + 1);  // .���᪺�����ɦW
                InputStream fin = new FileInputStream(pic);  

                System.out.println("\n\nUpdate the database... ");
                pstmt = con.prepareStatement(
                 "insert into EMP_PHOTO (empno, photo_format, picture)  values(?, ?, ?)");
                pstmt.setString(1, fno);  //fno=�}�G
                pstmt.setString(2, format);  //format=jpg
                pstmt.setBinaryStream(3, fin, (int)flen); //void pstmt.setBinaryStream(int parameterIndex, InputStream x, int length) throws SQLException
                int rowsUpdated = pstmt.executeUpdate(); //����
			
                System.out.print("Changed " + rowsUpdated);

                if (1 == rowsUpdated)  //��ʥu���@�檺��
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