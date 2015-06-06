
public class Test_FullTimeEmployee { 
    public static void main(String[] args) {
          
          FullTimeEmployee f1 = new FullTimeEmployee(7002 ,"peter", 40000.0 );          
          f1.display();
          
          System.out.println("總共領得薪水(全職員工):" + f1.getSalary());
   }
}
