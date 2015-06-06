import java.io.*;

/**
  使用之class:
  java.io.PrintStream;
  java.io.BufferedOutputStream;
  java.io.FileOutputStream;
*/

public class PrintStream_Write_To_File {
	public static void main(String args[]){
		try{
			FileOutputStream fos = new FileOutputStream("c:\\javawork\\hello.txt");
					
			BufferedOutputStream bos = new BufferedOutputStream(fos);
					
			PrintStream ps = new PrintStream(bos);

		 	ps.println("Hello World 世界你好 !");
			
			ps.close();
			bos.close();
			fos.close();
		}catch(IOException e){
			System.err.println(e);
		}
	}
}
