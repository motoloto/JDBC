/**
   更複雜的泛型
   除了在 List 部份外，Set 和 Map 系列當然也有泛型，下面測試 Map 部份： 
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