import java.io.*;

public class RandomAccess9_ByteBuffer_Copy {
     public static void main(String args[]) {

          try {
              RandomAccessFile in  = new RandomAccessFile("c:\\javawork\\HelloWorld.java", "r");
              RandomAccessFile out = new RandomAccessFile("c:\\javawork\\HelloWorld_Copy.java", "rw");   //¥²¶·¬° "rw"
        
//              byte buffer[] = new byte[4096];      //[(int)in.length()] , [1] , [50] , [4096] ...
//              int bytes_read;
//              while ((bytes_read = in.read(buffer)) != -1){
//                out.write(buffer, 0, bytes_read);
//                System.out.println(bytes_read);
//              }

//              byte buffer[] = new byte[(int)in.length()];
//              in.read(buffer);
//              out.write(buffer);

              
              IO_Utils.returnFile(in,out);


              in.close();
              out.close();
          } catch(IOException e){
          	System.out.println(e);
          }
     }
}

 