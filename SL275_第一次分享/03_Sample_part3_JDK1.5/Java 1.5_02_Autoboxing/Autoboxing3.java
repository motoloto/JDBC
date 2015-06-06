
/*
     ※3.一個和泛型Map一起使用的例子： 
*/
 
import java.util.*;

public class Autoboxing3 {
  public static void main(String[] args) {
    
    Map<Integer, String> map = new HashMap<Integer, String>(); 
    for (int i = 0; i < 4; i++)
      map.put(i, "number" + i);
    
    System.out.println(map.get(1));
  }
}
