public class Employee {
    public int empno;
    public String ename;
    
    public Employee (int empno, String ename) {
           this.empno = empno;
           this.ename = ename;
    }
     
    public Employee (int empno) {
       this(empno, "-");
    }
    
    public Employee (String ename) {
       this(0, ename);
    }
 
    public Employee () {
    	 this(0,"-");   //©Î  empno = 0; ename = "-";
    }
     
     
     public static void main(String[] args) {
          Employee e1 = new Employee(7001, "king");
          System.out.println(e1.empno);          //7001
          System.out.println(e1.ename);          //king
          
          Employee e2 = new Employee(7001);
          System.out.println(e2.empno);          //7001
          System.out.println(e2.ename);          // -
          
          Employee e3 = new Employee("king");
          System.out.println(e3.empno);          // 0
          System.out.println(e3.ename);          //king
          
          Employee e4 = new Employee();
          System.out.println(e4.empno);          // 0
          System.out.println(e4.ename);          // -
     } 
}