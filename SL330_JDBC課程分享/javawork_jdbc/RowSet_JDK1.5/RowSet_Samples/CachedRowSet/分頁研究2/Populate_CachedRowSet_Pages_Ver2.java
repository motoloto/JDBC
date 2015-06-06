/*
  java Populate_CachedRowSet_Pages_Ver2 3 1
  java Populate_CachedRowSet_Pages_Ver2 x y
*/


import java.sql.*;
import com.sun.rowset.*;

class Populate_CachedRowSet_Pages_Ver2 {

    public static void main(String argv[]) throws ClassNotFoundException , SQLException{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl2", "scott", "tiger");
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("select DEPTNO �����s��, DNAME �����W�� from dept2");
                rs.last();
                int len=rs.getRow();
                System.out.println("����������`�@��="+len+"��");
                //rs.beforeFirst();  //�H���d�ҦӨ�, ����{���X�i�H�٥h          
            
            int pageSize = Integer.parseInt(argv[0]);  // ��RuntimeException �� NumberFormatException�Ц۳B�z
            int startRow = Integer.parseInt(argv[1]);  // ��RuntimeException �� NumberFormatException�Ц۳B�z
            CachedRowSetImpl crs = new CachedRowSetImpl();
            crs.setPageSize(pageSize);    //���]�w�C��������
            crs.populate(rs,startRow);    //���`�N���j�j�\��  
            System.out.println("���C�@����"+pageSize+"��");
            
            rs.close();
            stmt.close();
            con.close(); //�i�`�N: ��Ʈw�s�u�w�b�������j

            System.out.println("�����X�q��"+startRow+"���}�l�����@��");
            while (crs.next()) {   //�����X�n�����@���Ӥw ����b���u�q�F...
                String str1 = crs.getString(1);
                String str2 = crs.getString(2);

                System.out.print(" �����s��=" + str1);
                System.out.print(" �����W��=" + str2);
                System.out.print("\n");
            }
    }
}