import java.io.*;

/**
  使用之class:
  java.io.PrintWriter;
  java.io.BufferedWriter;
  java.io.FileWriter;
*/

public class PrintWriter_Write_To_File {
	public static void main(String args[]){
		try{
			FileWriter fw = new FileWriter("c:\\javawork\\hello2.txt");
					
			BufferedWriter bw = new BufferedWriter(fw);
					
			PrintWriter pw = new PrintWriter(bw);

			pw.println("Hello World 世界你好2 !");
			//	pw.write("Hello World 世界你好2 !");   //也可使用
			pw.close();
			bw.close();
			fw.close();
		}catch( IOException e){
			System.err.println(e);
		}
	}
}
