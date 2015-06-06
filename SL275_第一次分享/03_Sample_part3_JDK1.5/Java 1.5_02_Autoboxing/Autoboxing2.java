
/*
    ※2.底下是一個和泛型List一起使用的例子： 
*/

import java.util.*;

public class Autoboxing2 {
  
  public static void main(String[] args) {
    List<Integer> list = new Vector<Integer>(); 
       for (int i = 0; i < 6; i++)
        list.add(i);
       
       for (int i = 0; i < 6; i++) 
         System.out.print(list.get(i) * 100 + " ");
  }
}     //輸出結果：0 100 200 300 400 500 


