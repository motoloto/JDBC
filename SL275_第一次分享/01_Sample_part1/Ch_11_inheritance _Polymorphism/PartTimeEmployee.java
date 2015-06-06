public class PartTimeEmployee extends Employee {
     private double hourPay; //���~
     private int workHour;   //�u�@�ɼ� 

     public void display() {
       super.display();
       System.out.println("hour pay=" + hourPay);
       System.out.println("work hour=" + workHour);
     }


     public PartTimeEmployee(int empno , String ename , double hourPay, int workHour) {
          super(empno, ename);
          this.hourPay = hourPay;
          this.workHour = workHour;
     }

     //add
     public double getSalary() {
          return hourPay * workHour;
     }
 }