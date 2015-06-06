import java.io.*;

public class RandomAccess4_StringBuffer {
     public static void main(String args[]) {
          int i;
          
          
          try {
              RandomAccessFile raf = new RandomAccessFile("c:\\javawork\\HelloWorld.java", "rw");
              
              StringBuffer sbf = new StringBuffer(20);
              while ((i = raf.read()) != -1) 
                sbf.append((char)i);
              System.out.print("***¨Ó¦ÛStringBuffer*** \n\n"+sbf);
              
              raf.close();
          } catch(IOException e){
          	System.out.println(e);
          }
     }
}