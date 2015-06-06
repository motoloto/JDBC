import java.io.*;

public class RandomAccess6_ByteBuffer {
     public static void main(String args[]) {
          int i;

          try {
              RandomAccessFile raf = new RandomAccessFile("c:\\javawork\\HelloWorld.java", "r");

              byte buffer[] = new byte[(int)raf.length()];
              while (raf.read(buffer)!= -1)
              System.out.println(new String(buffer));

              raf.close();
          } catch(IOException e){
          	System.out.println(e);
          }
     }
}

 