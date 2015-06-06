/**
  ¤¤¤å¶Ã½X
*/

import java.io.*;
public class FileInputStream_Read_From_File {
     public static void main(String args[]) {
          int i;
          try {
            /*	
              FileInputStream fis = new FileInputStream("c:\\javawork\\hello.txt");
              while ((i = fis.read()) != -1)
                  System.out.print((char)i);
              fis.close();
            */  
              
              FileInputStream fis = new FileInputStream("c:\\javawork\\hello.txt");
              BufferedInputStream  bis  =   new  BufferedInputStream(fis) ;
              while ((i = bis.read()) != -1)
                  System.out.print((char)i);
              
              bis.close();   
              fis.close();
              
          } catch(IOException e){}
     }
}