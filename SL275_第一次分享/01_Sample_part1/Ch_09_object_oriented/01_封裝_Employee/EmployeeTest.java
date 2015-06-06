public class EmployeeTest { 
  
  public static void main(String[] args) {
    Employee e1 = new Employee();
          
    e1.setEmpno(7001);
    e1.setEname("king");
          
    System.out.println(e1.getEmpno()); //7001
    System.out.println(e1.getEname()); //king
          
     //compile ¿ù»~: 
     //name has private access in Employee
     //System.out.println(e1.ename);
   }

}