import java.io.*;

/**
  �ϥΤ�class:
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

			pw.println("Hello World �@�ɧA�n2 !");
			//	pw.write("Hello World �@�ɧA�n2 !");   //�]�i�ϥ�
			pw.close();
			bw.close();
			fw.close();
		}catch( IOException e){
			System.err.println(e);
		}
	}
}
