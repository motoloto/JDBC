/*
  底下是一個尋訪Map的所有value 的 Enhanced foreach 迴圈。
  當然，因為用 HashMap，所以並沒有什麼順序(TreeMap，則有順序)
*/

import java.util.*;

public class ForeachExample3_Map {
  
  public static void main(String[] args) {
    
    Map<Integer , String> map = new HashMap<Integer , String>();
  //Map<Integer , String> map = new TreeMap<Integer , String>();
    
    for (int i = 0; i < 6; i++) {
      map.put( i , "吳永志" + i );
    }
    for (String val : map.values()) {
      System.out.println(val);
    }
  }
}

/*HashMap
輸出結果：
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