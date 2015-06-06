import java.util.*;

public class GenericVector {
  
  public static void main(String[] args) {
    int size = 6;
    List<Integer> list =  new Vector<Integer>(); 
    for (int i = 0; i < size; i++) {
      list.add(new Integer(size - i));
    }
    for (int i = 0; i < size; i++) {
      System.out.print(list.get(i) + " ");
    }
  }
}



