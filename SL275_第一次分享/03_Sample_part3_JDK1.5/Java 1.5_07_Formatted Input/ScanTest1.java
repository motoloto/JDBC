import java.io.*;
import java.util.Scanner;
public class ScanTest1{
  public static void main(String [] args){
  	
  	
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("�п�J�r��: ");
    String param = s.next();
    System.out.println("the param 1: " + param);
    
    System.out.println();
    
    System.out.println("�п�J���: ");
    int value = s.nextInt();
    System.out.println("the param 2: " + value);
    s.close();
  }
}
