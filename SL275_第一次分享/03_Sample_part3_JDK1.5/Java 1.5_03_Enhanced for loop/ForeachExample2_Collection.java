
import java.util.*;

public class ForeachExample2_Collection  {
	
	public static void main(String[] args) {
	
	  List<String> data = new ArrayList<String>();
 // Set<String> data = new HashSet<String>();
	  data.add("Hello");data.add("World");
		
	
    System.out.println("�ǲΪ�for �j��");
	  for (int i = 0 ; i < data.size() ; i++)  
       System.out.println(data.get(i));  //(�`�N:Set����ζǲΪ�for�j��)
    System.out.println();   
         
                
    System.out.println("�ϥ�iterator�j��");                   
	  for(Iterator it = data.iterator(); it.hasNext(); )
	     System.out.println(it.next()+" ");
    System.out.println();
                
    System.out.println("�W�j�\�઺ for �j��(Using Enhanced foreach)");
	  for(String str : data)                  
		   System.out.println(str);              
	  System.out.println();
	
	}
}
