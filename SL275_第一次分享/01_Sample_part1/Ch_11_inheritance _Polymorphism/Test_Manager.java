
public class Test_Manager { 
    public static void main(String[] args) {
          
          Manager m1 = new Manager(7003 ,"merry", 50000.0 , 10000.0);          
          m1.display();
          
          System.out.println("總共領得薪水(全職員工-經理):" + m1.getSalary());
   }
}
