
/*
    ��2.���U�O�@�өM�x��List�@�_�ϥΪ��Ҥl�G 
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
}     //��X���G�G0 100 200 300 400 500 


