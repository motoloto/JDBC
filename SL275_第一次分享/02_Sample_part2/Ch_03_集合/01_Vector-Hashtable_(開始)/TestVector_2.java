/**
 *  Vector ���@�i�m�J"���N����"��"�ʺA�}�C"(�i�H���t���h��W������)
 */
import java.util.*;
public class TestVector_2 {
       public static void main(String args[]) {
            Vector v = new Vector();
            v.add(new Integer(12));
            v.add(new Long(34L));
            v.add(new Float(5.6f));
            v.add(new Double(7.8));
            v.add(new String("Hello"));
            
            for (int i = 0 ; i < v.size() ; i++){
                 Object obj = v.get(i);
                 System.out.println(obj);
            }
      }
}
