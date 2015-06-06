/**
  應從範例, 來回比較 
  Ex_Generic8.java 
  Ex_Generic9.java
  Ex_Generic10.java
  哪裡不同
*/

import java.util.*;
public class Ex_Generic10 {
    public static void main(String[] args) {
        
        Vector<Integer> v1 = new Vector<Integer>();
        v1.add(100);
        v1.add(200);
        v1.add(300);
        System.out.println("總合 = " + sumA(v1));
        System.out.println("總合 = " + sumB(v1));
        
        Vector<Float> v2 = new Vector<Float>();
        v2.add(100.1f);
        v2.add(200.1f);
        v2.add(300.1f);
        System.out.println("總合 = " + sumA(v2));
        System.out.println("總合 = " + sumB(v2));
        
        Vector<Double> v3 = new Vector<Double>(); 
        v3.add(100.1d);
        v3.add(200.1d);
        v3.add(300.1d);
        System.out.println("總合 = " + sumA(v3));
        System.out.println("總合 = " + sumB(v3));
        
    }
    
    /*
      1.由於sumA()方法使用了<A extends Number>來加以修飾,因此在編譯的時候,
        將會自行判斷所傳進來的物件變數v是否符合A這個資料型態,
        此時在sumA()方法才可以直接使用<A>這個定型參數來宣告
      2.這樣的定義法只是為了不讓萬用字元?出現在程式當中
      3.A只是一個標示符號,用AA BB都可以	  
    */
    static <A extends Number> float sumA(Vector<A> v) {
        float sum = 0;
        Iterator<A> it = v.iterator();
        while(it.hasNext()) {
        	  Number data = it.next();
            sum += data.floatValue();
        }
        return sum;
    }

    /*
      4.以上寫法如同以下寫法
    
    */
    static float sumB(Vector<? extends Number> v) {
        float sum = 0;
        Iterator<? extends Number> it = v.iterator();
        while(it.hasNext()) {
        	  Number data = it.next();
            sum += data.floatValue();
        }
        return sum;
    }

}