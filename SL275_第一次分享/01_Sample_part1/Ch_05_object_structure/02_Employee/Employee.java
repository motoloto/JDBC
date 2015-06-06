public class Employee {
    public int empno;     //員工編號
    public String ename;  //員工姓名　　
    
    public void display() {
         System.out.println("empno=" + empno);
         System.out.println("ename =" + ename); 
    }
    
    public static void main(String[] args) {
          Employee e1 = new Employee();
          e1.empno = 7001;
          e1.ename = "king";
          e1.display();
    }
}
