import java.util.*; 
    public class TestHashSet {
        public static void main(String args[]) {
	Set set = new HashSet();
	set.add(new Integer(56));
	set.add(new Integer(34));
	set.add(new Integer(12));
	set.add("Hello");
	set.add("Hello");      // duplicate, not added
	System.out.println(set);
	System.out.println(set.size());
	Iterator objs = set.iterator();
	while(objs.hasNext())
	    System.out.println(objs.next());
}}
