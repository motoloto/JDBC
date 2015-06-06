import java.util.*; 
public class TestTreeSet{
 public static void main(String args[]) {
	
	Set set = new TreeSet();
	set.add(new Integer(56));
	set.add(new Integer(34));
	set.add(new Integer(12));
	System.out.println(set);
	System.out.println(set.size());
	Iterator objs = set.iterator();
	while(objs.hasNext())
	    System.out.println(objs.next());
  
  } 
}
