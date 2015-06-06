/*
  raf.seek(int pos);
  raf.readInt();
  raf.readUTF();
*/

import java.io.*;
public class RandomAccess8_read_readXXX {
     public static void main(String args[]) {
int i;
          try {
              RandomAccessFile raf = new RandomAccessFile("c:\\javawork\\HelloWorld2.java", "rw");
                    
               raf.seek(0);                   
                 byte buffer[] = new byte[10];
                 int b=0;
                 while ((i = raf.read()) != -1 && raf.getFilePointer()<=10)
                 buffer[b++]=(byte)i;
                 System.out.println("***來自new String(buffer)*** \n"+new String(buffer));
                 
               raf.seek(10);
                 System.out.println("***來自raf.readInt()*** \n" + raf.readInt());
                 System.out.println("***來自raf.readUTF()*** \n" + raf.readUTF());   
                
               raf.seek(29);                   
                 byte buffer2[] = new byte[(int)raf.length()];
                 while (raf.read(buffer2)!= -1)
                 System.out.println("***來自new String(buffer2)*** \n\n"+new String(buffer2));
          
          } catch(IOException e){
          	System.out.println(e);
          }
     }
}