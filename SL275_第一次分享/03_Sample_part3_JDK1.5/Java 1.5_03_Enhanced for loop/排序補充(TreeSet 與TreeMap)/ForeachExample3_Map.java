/*
  TreeMap��Key�ȭn�P�@�ظ�ƫ��O
*/


import java.util.*;

public class ForeachExample3_Map {
  
  public static void main(String[] args) {
    
    Map<Integer , String> map = new HashMap<Integer , String>();
    //Map<Integer , String> map = new TreeMap<Integer , String>(); //TreeMap��Key�ȭn�P�@�ظ�ƫ��O
    
    for (int i = 0; i < 66; i++) {
      map.put( i , "�d�ç�" + i );
    }
    for (String val : map.values()) {
      System.out.println(val);
    }
  }
}

/*HashMap
�i���X���G�G
   �d�ç�2
   �d�ç�4
   �d�ç�1
   �d�ç�3
   �d�ç�5
   �d�ç�0
*/
/*HTreeMap
��X���G�G
  �d�ç�0
  �d�ç�1
  �d�ç�2
  �d�ç�3
  �d�ç�4
  �d�ç�5
*/