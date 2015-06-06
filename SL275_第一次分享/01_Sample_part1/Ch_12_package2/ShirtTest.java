package aaa;
import bbb.*;

/*
  編譯(javac.exe)  和   執行(java.exe) 時 
  都請注意程式所在的相對位置
  
  javac -d . ShirtTest.java 
  java aaa.ShirtTest    

*/



public class ShirtTest {
   
  public static void main (String args[]) {
 
    Shirt myShirt;
    myShirt = new Shirt();
  
    myShirt.displayShirtInformation();

  } 
}
