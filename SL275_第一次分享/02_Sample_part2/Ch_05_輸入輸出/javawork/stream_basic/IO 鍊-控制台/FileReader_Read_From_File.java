/**
  ����OK
*/

import java.io.*;
public class FileReader_Read_From_File {          
     public static void main(String args[]) {
          int i;
          try {
            /*	
              FileReader fr = new FileReader("c:\\javawork\\hello.txt");
              while ((i = fr.read()) != -1)
                  System.out.print((char)i);
              fr.close();
            */ 
             
             
             
            /*  
              FileReader fr = new FileReader("c:\\javawork\\hello.txt");
              BufferedReader  br  =   new  BufferedReader(fr) ;
              while ((i = br.read()) != -1)
                  System.out.print((char)i);
              
              br.close();   
              fr.close();
            */
            
            
              String str;
              FileReader fr = new FileReader("c:\\javawork\\hello.txt");
              BufferedReader  br  =   new  BufferedReader(fr) ;
              while ((str = br.readLine()) != null)
                  System.out.println(str);
              
              br.close();   
              fr.close();
              
          } catch(IOException e){}
     }
}