import java.io.*;

public class RandomAccess5_ByteBuffer {
     public static void main(String args[]) {
          int i;

          try {
              RandomAccessFile raf = new RandomAccessFile("c:\\javawork\\HelloWorld.java", "r");
              
              byte buffer[] = new byte[(int)raf.length()];
              int b=0;
              while ((i = raf.read()) != -1)
                 buffer[b++]=(byte)i;
              System.out.println(new String(buffer));

              raf.close();
          } catch(IOException e){
          	System.out.println(e);
          }
     }
}

 