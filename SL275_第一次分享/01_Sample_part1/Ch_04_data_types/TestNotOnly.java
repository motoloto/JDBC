public class TestNotOnly{

  public static void main(String args[]) {
     	
     	String str1 = new String("hello");
     	String str2 = new String("hello");
     	String str3 = "hello";
     	String str4 = "hello";
     	
     	System.out.println(str1==str2);          //false
     	System.out.println(str3==str4);          //true   ¡° String pool
     	System.out.println(str1==str3);          //false
     	System.out.println(str2==str4);          //false
      
      System.out.println("--------");     	
     	
     	System.out.println(str1.equals(str2));   //true
     	System.out.println(str3.equals(str4));   //true
     	System.out.println(str1.equals(str3));   //true
     	System.out.println(str2.equals(str4));   //true
     	
     	
     	
  }	

}