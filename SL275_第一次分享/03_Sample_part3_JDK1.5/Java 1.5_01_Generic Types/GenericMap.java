/**
   ��������x��
   ���F�b List �����~�ASet �M Map �t�C��M�]���x���A�U������ Map �����G 
*/
import java.util.*;

public class GenericMap {
  
  public static void main(String[] args) {
    Map<Integer , String> map = new HashMap<Integer , String>();
    for (int i = 0; i < 3; i++) {
        map.put(new Integer(i) , "number" + i);
    }
    System.out.println(map.get(new Integer(0)));
    System.out.println(map.get(new Integer(1)));
    System.out.println(map.get(new Integer(2)));
  }
}