public class Employee {
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
    
    
    public boolean equals(Object obj) {
    	if (this == obj) return true;                     //��1. ���n�ϥ�==�ӧP�_,�]��(�]�\)�n�����"����Ѧ��ܼ�",�������O�P�@�ӹ���(���V�P�@�ӰO����Ŷ�)
    	if(obj != null && getClass() == obj.getClass()) { //��2. ��(Object���O��)getClass()�ӽT�w�O�_���ݩ�P�@��class������
    		if(obj instanceof Employee) {
                Employee e = (Employee)obj;
                if (empno == e.empno && ename.equals(e.ename)) {  //��3. ��ܸ����O�����n�����ܼ�(�����ܼ�)�ӥ[�H�P�_�O�_���۵�(�ۦP)
                    return true;
                }
        }
    	}	    	

    	return false;
    }
    
    public int hashCode(){
        return this.ename.hashCode();               //���ɥΤ@�U String ���O�{����hashCode�B��k�h
   	  //return new Integer(this.empno).hashCode();  //���έɥΤ@�U Integer ���O�{����hashCode�B��k�h
    	
    }
}
