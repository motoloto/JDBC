import java.util.*; 

public class TestHashSet {
   public static void main(String args[]) {
	   
	   Set set = new HashSet();
	   set.add(new Integer(12));
	   set.add(new Long(34L));
	   set.add(new Double(5.6));
	   set.add("Hello");
	   set.add("Hello");      // duplicate, not added
	     
	   System.out.println("toString()="+ set);
	   System.out.println("元素個數="+ set.size());
	 
	   // Set家族只能用Iterator 取值
	   Iterator objs = set.iterator();
	   while(objs.hasNext())
	    System.out.println(objs.next());
   }
}
