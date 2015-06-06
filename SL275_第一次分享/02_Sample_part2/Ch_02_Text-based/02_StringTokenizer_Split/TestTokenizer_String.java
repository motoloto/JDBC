//額外參考 StringTokenizer 類別

import java.util.*;

public class TestTokenizer_String{

    public static void main(String args[]) {
        StringTokenizer st = new StringTokenizer("This is a book");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        
        StringTokenizer st1;
        st1 =  new StringTokenizer("That-is-a-pen","-");
        while (st1.hasMoreTokens()) {
           System.out.println(st1.nextToken());
        }
    }
}

