import java.io.*;

public class RandomAccess3 {
     public static void main(String args[]) {
          int i;
          try {
              RandomAccessFile raf = new RandomAccessFile("c:\\javawork\\HelloWorld.java", "r");
              while ((i = raf.read()) != -1)
                  System.out.print((char)i);
              raf.close();
          } catch(IOException e){
          	System.out.println(e);
          }
     }
}