
public class TestPolymorphism1 { 
    public static void main(String[] args) {
          
          Employee e1 = new FullTimeEmployee(7002 ,"peter", 50000.0 );
          Employee e2 = new Manager(7003 ,"merry", 50000.0 , 10000.0);
          Employee e3 = new PartTimeEmployee(7004 , "John" , 1000.0, 8);
          
//        FullTimeEmployee  f  =  (FullTimeEmployee)e1;   //Type casting
//        Manager  m  =  (Manager)e1;                     //執行時期:java.lang.ClassCastException
//        PartTimeEmployee  m  =  (PartTimeEmployee)e1;   //執行時期:java.lang.ClassCastException
          
          System.out.println(e1 instanceof FullTimeEmployee);  //true
          System.out.println(e1 instanceof Manager);           //false   
          System.out.println(e1 instanceof PartTimeEmployee);  //false
           
    }
}
