/**
 *  Vector ���@�i�m�J"���N����"��"�ʺA�}�C"(�i�H���t���h��W������)
 */
import java.util.*;
public class TestVector_1 {
       public static void main(String args[]) {
            Vector v = new Vector();
            v.addElement(new Integer(12));
            v.addElement(new Long(34L));
            v.addElement(new Float(5.6f));
            v.addElement(new Double(7.8));
            v.addElement(new String("Hello"));
            
            for (int i = 0 ; i < v.size() ; i++){
                 Object obj = v.elementAt(i);
                 System.out.println(obj);
            }
      }
}
