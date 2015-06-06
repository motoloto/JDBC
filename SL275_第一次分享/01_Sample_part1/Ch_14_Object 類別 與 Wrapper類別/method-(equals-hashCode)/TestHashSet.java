import java.util.*; 

public class TestHashSet {
   public static void main(String args[]) {
	   
	   Employee e1 = new Employee(7001, "king");
	   Employee e2 = new Employee(7001, "king");
	  
	   Set<Object> set = new HashSet<Object>();
	   set.add("Hello");
	   set.add("Hello");      // duplicate, not added
	   set.add(e1);
	   set.add(e2);
	   
	   System.out.println("e1==e2 = "+ (e1==e2)); 
     System.out.println("e1.equals(e2)="+e1.equals(e2));  
	   System.out.println("toString()="+ set);
	   System.out.println("¤¸¯À­Ó¼Æ="+ set.size());
	 
	  
	   Iterator objs = set.iterator();
	   while(objs.hasNext())
	    System.out.println(objs.next());
   }
}
