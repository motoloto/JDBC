public class ShirtTest {
   
/*
   方式1: 
    javac -classpath "C:\SL275_第一次分享\01_Sample_part1\Ch_03" ShirtTest.java
    java -classpath ".;C:\SL275_第一次分享\01_Sample_part1\Ch_03" ShirtTest
    
   方式2: 
    或者設定環境變數也可
*/
  public static void main (String args[]) {
 
    Shirt myShirt;
    myShirt = new Shirt();
  
    myShirt.displayShirtInformation();

  } 
}

