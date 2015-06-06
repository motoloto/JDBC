/*
  自定泛型類別
*/

import java.util.*;

public class MyGeneric {
  
  public static void main(String[] args) {
    MyGenericType<String> myGeneric = new MyGenericType<String>(); 
       for (int i = 0; i < 3; i++) {
         myGeneric.add("number" + i);
         System.out.println(myGeneric.get(i));
       }
  }
}

class MyGenericType<Type> {

  private List<Type> list;
  
  public MyGenericType() {
    list = new Vector<Type>();
  }
  public void add(Type t) {
    list.add(t);
  }
  public Type get(int i) {
    return list.get(i);
  }
}