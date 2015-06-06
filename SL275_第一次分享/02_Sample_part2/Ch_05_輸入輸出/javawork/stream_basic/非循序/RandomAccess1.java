import java.io.*;

public class RandomAccess1 {
     public static void main(String args[]) {
     	  String s;
          File file = new File("c:\\javawork\\HelloWorld.java");
          if (!file.isFile()) {
                  System.out.println("Not a file");
                  System.exit(0);
          }
          try {
              RandomAccessFile raf = new RandomAccessFile(file, "r"); //¶}±Ò°ßÅªÀÉ
              while ((s = raf.readLine()) != null)
                  System.out.println(s);
              raf.close();
          } catch(IOException e){
          	  System.out.println(e);
          }
     }
}