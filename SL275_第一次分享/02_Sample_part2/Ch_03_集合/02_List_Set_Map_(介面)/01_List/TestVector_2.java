/**
 *  Vector ���@�i�m�J"���N����"��"�ʺA�}�C"(�i�H���t���h��W������)
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
            
            //JDK1.2��,Vector�]�i�H��Iterator����.
            //�]��List�a�ڥi�H��Iterator��for�j�����
            Iterator it = list.iterator();
	          while (it.hasNext())
	          System.out.println (it.next());
            
      
      }
}
