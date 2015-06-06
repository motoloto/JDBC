/**
 *  Vector 為一可置入"任意物件"的"動態陣列"(可隨內含物多寡增減其長度)
 */
import java.util.*;
public class TestVector_2 {
       public static void main(String args[]) {
            List list = new Vector();
            list.add(new Integer(12));
            list.add(new Long(34L));
            list.add(new Float(5.6f));
            list.add(new Double(7.8));
            list.add(new String("Hello"));
            
            for (int i = 0 ; i < list.size() ; i++){
                 Object obj = list.get(i);
                 System.out.println(obj);
            }
            
            System.out.println();
            
            //JDK1.2後,Vector也可以用Iterator取值.
            //因為List家族可以用Iterator或for迴圈取值
            Iterator it = list.iterator();
	          while (it.hasNext())
	          System.out.println (it.next());
            
      
      }
}
