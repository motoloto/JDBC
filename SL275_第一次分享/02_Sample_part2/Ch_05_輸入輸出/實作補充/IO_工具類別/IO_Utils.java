
import java.io.*;

public class IO_Utils {
  
  public static void returnFile(InputStream in, OutputStream out) 
                                                   throws IOException {
      byte[] buf = new byte[4 * 1024];  // 4K buffer
      int bytesRead;
      while ((bytesRead = in.read(buf)) != -1) {
        out.write(buf, 0, bytesRead);
        System.out.println(bytesRead); //代刚ノonly
      }
  }
  
  
  
  public static void returnFile(Reader in, Writer out) 
                                                   throws IOException {
      char[] buf = new char[4 * 1024];  // 4K buffer
      int charsRead;
      while ((charsRead = in.read(buf)) != -1) {
        out.write(buf, 0, charsRead);
        System.out.println(charsRead); //代刚ノonly
      }
  }
  
  
  
  public static void returnFile(String filename, OutputStream out)
                                                    throws FileNotFoundException, IOException {
    FileInputStream in = null;
    try {
      in = new FileInputStream(filename);
      byte[] buf = new byte[4 * 1024];  // 4K buffer
      int bytesRead;
      while ((bytesRead = in.read(buf)) != -1) {
        out.write(buf, 0, bytesRead);
        System.out.println(bytesRead); //代刚ノonly
      }
    }
    finally {
      if (in != null) in.close();
    }
  }
  
  
  
  public static void returnFile(String filename, Writer out)
                                                    throws FileNotFoundException, IOException {
    FileReader in = null;
    try {
      in = new FileReader(filename);
      char[] buf = new char[4 * 1024];  // 4K buffer
      int charsRead;
      while ((charsRead = in.read(buf)) != -1) {
        out.write(buf, 0, charsRead);
        System.out.println(charsRead); //代刚ノonly
      }
    }
    finally {
      if (in != null) in.close();
    }
  }
  
  
  
  public static void returnFile(RandomAccessFile in, RandomAccessFile out) 
                                                   throws IOException {
      byte[] buf = new byte[4 * 1024];  // 4K buffer
      int bytesRead;
      while ((bytesRead = in.read(buf)) != -1) {
        out.write(buf, 0, bytesRead);
        System.out.println(bytesRead); //代刚ノonly
      }
  }

}
