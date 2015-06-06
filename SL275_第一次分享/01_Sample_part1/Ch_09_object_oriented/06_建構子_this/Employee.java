public class Employee {
    public int empno;
    public String ename;
    
    public Employee (int empno, String ename) {
           this.empno = empno;
           this.ename = ename;
    }
     
     
     public static void main(String[] args) {
          Employee e1 = new Employee(7001, "king");
          System.out.println(e1.empno);          //7001
          System.out.println(e1.ename);          //king
     } 
} 
