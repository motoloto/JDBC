
public class Test_Manager { 
    public static void main(String[] args) {
          
          Manager m1 = new Manager(7003 ,"merry", 50000.0 , 10000.0);          
          m1.display();
          
          String ename = m1.getEname();  //���ۤv�S��getName()��k, ���Ӧۤ�-�������O
          System.out.println("�n�Ӧۤ����O��getName()="+ename);
 
   }
}
