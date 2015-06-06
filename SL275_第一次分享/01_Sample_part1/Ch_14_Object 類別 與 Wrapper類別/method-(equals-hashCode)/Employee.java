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
    	 this(0,"-");   //或  empno = 0; ename = "-";
    }
    
    
    public void display() {
         System.out.println("empno=" + empno);
         System.out.println("ename=" + ename); 
    }
    
    
    public boolean equals(Object obj) {
    	if (this == obj) return true;                     //●1. 仍要使用==來判斷,因為(也許)要比較的"物件參考變數",其實指的是同一個實體(指向同一個記憶體空間)
    	if(obj != null && getClass() == obj.getClass()) { //●2. 用(Object類別的)getClass()來確定是否隸屬於同一個class的物件
    		if(obj instanceof Employee) {
                Employee e = (Employee)obj;
                if (empno == e.empno && ename.equals(e.ename)) {  //●3. 選擇該類別的必要成員變數(實體變數)來加以判斷是否有相等(相同)
                    return true;
                }
        }
    	}	    	

    	return false;
    }
    
    public int hashCode(){
        return this.ename.hashCode();               //●借用一下 String 類別現有的hashCode運算法則
   	  //return new Integer(this.empno).hashCode();  //●或借用一下 Integer 類別現有的hashCode運算法則
    	
    }
}
