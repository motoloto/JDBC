
public class FullTimeEmployee extends Employee {
    private double monthlySalary;  //���~
    
    public void display() {
       super.display();
       System.out.println("���~=" +  monthlySalary);
    }

    public FullTimeEmployee (int empno , String ename , double monthlySalary ) {
          super(empno, ename);
          this.monthlySalary = monthlySalary ;
    }
}
