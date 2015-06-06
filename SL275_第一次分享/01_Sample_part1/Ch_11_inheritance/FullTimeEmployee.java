
public class FullTimeEmployee extends Employee {
    private double monthlySalary;  //§Î¡~
    
    public void display() {
       super.display();
       System.out.println("§Î¡~=" +  monthlySalary);
    }

    public FullTimeEmployee (int empno , String ename , double monthlySalary ) {
          super(empno, ename);
          this.monthlySalary = monthlySalary ;
    }
}
