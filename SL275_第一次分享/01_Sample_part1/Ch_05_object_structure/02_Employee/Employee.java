public class Employee {
    public int empno;     //���u�s��
    public String ename;  //���u�m�W�@�@
    
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
