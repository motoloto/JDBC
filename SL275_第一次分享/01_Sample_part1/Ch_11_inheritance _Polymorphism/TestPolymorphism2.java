
public class TestPolymorphism2 { 
  public static void main(String[] args) {  
    
     Employee[] e = new Employee[3];  //�ŧi���u�}�C,�ǳƸm�J���u3�H
     e[0] = new FullTimeEmployee(7002 ,"peter", 40000.0 );
     e[1] = new Manager(7003 ,"merry", 50000.0 , 10000.0);
     e[2] = new PartTimeEmployee(7004 , "John" , 1000.0, 8);
     for (int i = 0; i < e.length; i++)
           System.out.println(e[i].getSalary());
 
     
//    instanceof���� 
//    for (int i = 0; i < e.length; i++)
//    if(e[i] instanceof FullTimeEmployee)         //Employee , FullTimeEmployee , Manager , PartTimeEmployee
//		   System.out.println("yes");
//	  else 
//		   System.out.println("no");

  

//     �t�~�ĤG�ؼg�k
//     Employee[] e = new Employee[3];
//     Employee e0 = new FullTimeEmployee(7002 ,"peter", 40000.0 );
//     Employee e1 = new Manager(7003 ,"merry", 50000.0 , 10000.0);
//     Employee e2 = new PartTimeEmployee(7004 , "John" , 1000.0, 8);
//     e[0] = e0;
//     e[1] = e1;
//     e[2] = e2;
//     for (int i = 0; i < e.length; i++)
//           System.out.println(e[i].getSalary());
         


//     �A�t�ĤT�ؼg�k
//     Employee[] e = new Employee[3];
//     FullTimeEmployee e0 = new FullTimeEmployee(7002 ,"peter", 40000.0 );
//     Manager e1 = new Manager(7003 ,"merry", 50000.0 , 10000.0);
//     PartTimeEmployee e2 = new PartTimeEmployee(7004 , "John" , 1000.0, 8);
//     e[0] = e0;
//     e[1] = e1;
//     e[2] = e2;
//     for (int i = 0; i < e.length; i++)
//           System.out.println(e[i].getSalary());

  
  }
}
