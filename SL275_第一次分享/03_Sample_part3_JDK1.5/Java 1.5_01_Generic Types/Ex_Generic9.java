/**
  應從範例, 來回比較 
  Ex_Generic8.java 
  Ex_Generic9.java
  Ex_Generic10.java
  哪裡不同
*/

import java.util.*;
public class Ex_Generic9 {
    public static void main(String[] args) {
        
        Vector<Integer> v1 = new Vector<Integer>();
        v1.add(100);
        v1.add(200);
        v1.add(300);
        printOnlyNumber(v1);
        
        Vector<Float> v2 = new Vector<Float>();
        v2.add(1.1f);
        v2.add(2.2f);
        v2.add(3.3f);
        printOnlyNumber(v2);
     
        Vector v3 = new Vector();
        v3.add(new Integer(10));
        v3.add(new Integer(20));
        //v3.add("Java");   //ClassCastException
        printOnlyNumber(v3);

        

    }
    static void printOnlyNumber(Vector<? extends Number> v) {
        Iterator<? extends Number> it = v.iterator();
        while(it.hasNext()) {
            Number data = it.next();
            System.out.print(data.floatValue() + ", ");
        }
        System.out.println();
    }
}