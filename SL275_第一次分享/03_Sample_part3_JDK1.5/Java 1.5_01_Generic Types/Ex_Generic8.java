/**
  應從範例, 來回比較 
  Ex_Generic8.java 
  Ex_Generic9.java
  Ex_Generic10.java
  哪裡不同
*/

import java.util.*;
public class Ex_Generic8 {
    public static void main(String[] args) {
        
        Vector<String> v1 = new Vector<String>();
        v1.add("Java");
        v1.add("Tiger");
        v1.add("SCJP 5.0");
        printALL(v1);
        
        Vector<Integer> v2 = new Vector<Integer>();
        v2.add(100);
        v2.add(200);
        v2.add(300);
        printALL(v2);
            
        Vector v3 = new Vector();
        v3.add(new Integer(10));
        v3.add(new Integer(20));
        v3.add("Java");
        printALL(v3);

    }
    
    static void printALL(Vector<?> v) {
        Iterator<?> it = v.iterator();
        while(it.hasNext()) {
            System.out.print(it.next() + ", ");
        }
        System.out.println();
    }
}