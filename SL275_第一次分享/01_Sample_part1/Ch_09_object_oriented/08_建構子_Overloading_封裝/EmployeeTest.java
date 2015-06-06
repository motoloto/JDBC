
public class EmployeeTest { 
    public static void main(String[] args) {
          
          Employee e1 = new Employee(7001, "king");
          e1.display(); //empno=7001
                        //ename=king
                  
          System.out.println(e1.getEmpno());    //7001
          System.out.println(e1.getEname());    //king
    }
}
