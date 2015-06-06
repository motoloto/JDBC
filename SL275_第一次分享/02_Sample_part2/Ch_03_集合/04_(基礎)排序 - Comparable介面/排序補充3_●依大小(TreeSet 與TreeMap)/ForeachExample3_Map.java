/*
  TreeMap��Key�ȭn�P�@�ظ�ƫ��O
*/


import java.util.*;

public class ForeachExample3_Map {
  
  public static void main(String[] args) {
    
  //Map<Employee , String> map = new HashMap<Employee , String>();
    Map<Employee , String> map = new TreeMap<Employee , String>(); //TreeMap��Key�ȭn�P�@�ظ�ƫ��O
    
    Employee e1 = new Employee(7001, "king1");
	  Employee e2 = new Employee(7002, "king2");
	  Employee e3 = new Employee(7003, "king3");
	  Employee e4 = new Employee(7004, "king4");
	  Employee e5 = new Employee(7005, "king5");
	  
    map.put( e5 , e5.getEname() );
    map.put( e2 , e2.getEname() );
    map.put( e3 , e3.getEname() );
    map.put( e4 , e4.getEname() );
    map.put( e1 , e1.getEname() );
    
    for (String ename : map.values()) {
      System.out.println(ename);
    }
    
    System.out.println();
    
    for (Employee aEmployee : map.keySet()) {
      System.out.println(aEmployee.getEmpno());
    }
  }
}