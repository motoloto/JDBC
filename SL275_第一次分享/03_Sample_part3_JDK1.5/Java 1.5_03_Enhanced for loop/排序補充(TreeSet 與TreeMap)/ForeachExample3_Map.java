/*
  TreeMap的Key值要同一種資料型別
*/


import java.util.*;

public class ForeachExample3_Map {
  
  public static void main(String[] args) {
    
    Map<Integer , String> map = new HashMap<Integer , String>();
    //Map<Integer , String> map = new TreeMap<Integer , String>(); //TreeMap的Key值要同一種資料型別
    
    for (int i = 0; i < 66; i++) {
      map.put( i , "吳永志" + i );
    }
    for (String val : map.values()) {
      System.out.println(val);
    }
  }
}

/*HashMap
可能輸出結果：
   吳永志2
   吳永志4
   吳永志1
   吳永志3
   吳永志5
   吳永志0
*/
/*HTreeMap
輸出結果：
  吳永志0
  吳永志1
  吳永志2
  吳永志3
  吳永志4
  吳永志5
*/