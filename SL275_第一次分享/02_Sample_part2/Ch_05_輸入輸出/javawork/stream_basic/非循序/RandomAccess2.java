import java.io.*;

public class RandomAccess2 {
     public static void main(String args[]) {
          String s;
          try {
              RandomAccessFile raf = new RandomAccessFile("c:\\javawork\\HelloWorld.java", "r");
              while ((s = raf.readLine()) != null)
                  System.out.println(s);
              raf.close();
          } catch(IOException e){
          	  System.out.println(e);
          }
     }
}