
public class Manager extends FullTimeEmployee {
    private double bonus;  //����; �B�~�z�K; �S�O�ɧU
    
    public void display() {
       super.display();
       System.out.println("�B�~�z�K=" +  bonus);
    }

    public Manager (int empno , String ename , double monthlySalary, double bonus) {
          super(empno, ename, monthlySalary);
          this.bonus = bonus ;
    }
}
