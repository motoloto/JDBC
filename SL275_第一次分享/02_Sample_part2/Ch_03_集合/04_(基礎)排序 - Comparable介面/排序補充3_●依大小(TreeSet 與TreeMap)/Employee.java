public class Employee implements Comparable<Employee> {
    private int empno;
    private String ename;
    
    public void setEmpno(int empno) {
    	this.empno = empno;
    }
    public int getEmpno() {
    	return empno; 
    } 
    
    public void setEname(String ename) {
    	this.ename = ename;
    }
    public String getEname() {
    	return ename; 
    }
    
    
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
    	 this(0,"-");   //��  empno = 0; ename = "-";
    }
    
    
    public void display() {
         System.out.println("empno=" + empno);
         System.out.println("ename=" + ename); 
    }
    
    
    public int compareTo(Employee aEmployee){
        //���󥻨��P aEmployee �ۤ���A�p�G retrun ���ȡA�N��ܤ� aEmployee �j
        if(this.empno>aEmployee.empno){
            return 1;
        }else{
            return -1;
        }
    }

}
