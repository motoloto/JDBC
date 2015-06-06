
public class Test_PartTimeEmployee { 
    public static void main(String[] args) {
                            
          PartTimeEmployee p1 = new PartTimeEmployee(7004 , "John" , 1000.0, 8);          
          p1.display();
          
          System.out.println("總共領得薪水(兼職員工):" + p1.getSalary());
   }
}
