import java.sql.*;
import com.sun.rowset.*;

class Populate_CachedRowSet_Pages_Ver1 {

    public static void main(String argv[]) throws ClassNotFoundException , SQLException{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl2", "scott", "tiger");
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("select DEPTNO �����s��, DNAME �����W�� from dept2");
                rs.last();
                int len=rs.getRow();
                System.out.println("����������`�@��="+len+"��");
                //rs.beforeFirst();  //�H���d�ҦӨ�, ����{���X�i�H�٥h          
            
            CachedRowSetImpl crs = new CachedRowSetImpl();
            crs.setPageSize(3);    //���]�w�C��������
            crs.populate(rs,1);    //���`�N���j�j�\��  
            System.out.println("���C�@����3��");
            
            rs.close();
            stmt.close();
            con.close(); //�i�`�N: ��Ʈw�s�u�w�b�������j

            System.out.println("�����X�q��1���}�l�����@��");
            while (crs.next()) {   //�����X�n�����@���Ӥw ����b���u�q�F...
                String str1 = crs.getString(1);
                String str2 = crs.getString(2);

                System.out.print(" �����s��=" + str1);
                System.out.print(" �����W��=" + str2);
                System.out.print("\n");
            }
    }
}