/*
  raf.write("¦r¦ê".getBytes());
  raf.writeInt(1234567890);
  raf.writeUTF("¦r¦ê");
  raf.getFilePointer();
*/ 

import java.io.*;
public class RandomAccess7_write_writeXXX {
     public static void main(String args[]) {

          try {
              RandomAccessFile raf = new RandomAccessFile("c:\\javawork\\HelloWorld2.java", "rw");

              raf.write("12§d¥Ã§Ó90".getBytes());               //raf.writeBytes("12§d¥Ã§Ó90");   //¤¤¤åerror
                  System.out.println(raf.getFilePointer());  
              raf.writeInt(1234567890);
                  System.out.println(raf.getFilePointer());     
              raf.writeUTF("22§d¥Ã§Ó90");
                  System.out.println(raf.getFilePointer());  
          } catch(IOException e){
          	System.out.println(e);
          }
     }
}
