package aaa;
import bbb.*;

/*
  �sĶ(javac.exe)  �M   ����(java.exe) �� 
  ���Ъ`�N�{���Ҧb���۹��m
  
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
