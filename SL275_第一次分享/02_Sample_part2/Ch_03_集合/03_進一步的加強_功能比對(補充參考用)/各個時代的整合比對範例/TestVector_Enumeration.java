/**
 *  Vector ���@�i�m�J"���N����"��"�ʺA�}�C"(�i�H���t���h��W������)
 *  Vector ���ѦP�B�ƪ��u�I(�P�t��) , �o��h��������s���O�ܭ��n��
 */
import java.util.*;
public class TestVector_Enumeration {
       public static void main(String args[]) {
            Vector list = new Vector();
            list.add(new Integer(12));
            list.add(new Long(34L));
            list.add(new Float(5.6f));
            list.add(new Double(7.8));
            list.add(new String("Hello"));
            
            for (int i = 0 ; i < list.size() ; i++){
                 Object obj = list.get(i);
                 System.out.println(obj);
            }
            
            //JDK1.2��,Vector�]�i�H��Iterator����.
            //�]��List�a�ڥi�H��Iterator��for�j�����
            System.out.println();
            Iterator it = list.iterator();
	          while (it.hasNext())
	          System.out.println (it.next());
	          
	          
	          System.out.println();           //���ΦA�Q��JDK 1.5 ��for-each����
	          for(Object value : list)  
            System.out.println(value);
	          
	          
	          //�䥦��k����1 -> toArray()
	          System.out.println();
	          Object a[] = list.toArray();
            for (int i = 0 ; i < a.length ; i++)
                    System.out.println(a[i]);
                    
                    
            //JDK 1.0�䥦��k����2 -> elements()
            //�u�� Vector �~����method, �G�I�s��method�ɤ���Φh�����g�k
            System.out.println();
	          Enumeration en = list.elements();
	          while (en.hasMoreElements())
	            System.out.println (en.nextElement());         
            
      
      }
}
