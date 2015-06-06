import java.io.*;

public class QuickCopy {
	
	private static int bufSize = 20*1024;	// Buffer size 20KB
	
	public static void main(String[] args) throws IOException {
		
		long startTime = System.currentTimeMillis();
		
		File inputFile = new File("farrago.txt");
                File outputFile = new File("outagain.txt");
/*
		BufferedInputStream in = new BufferedInputStream(
				new FileInputStream(inputFile), bufSize);
		BufferedOutputStream out = new BufferedOutputStream(
				new FileOutputStream(outputFile), bufSize);
*/
		FileInputStream in = new FileInputStream(inputFile);
		FileOutputStream out = new FileOutputStream(outputFile);

		byte b[] = new byte[bufSize];
		int readCount;
		while ((readCount = in.read(b,0,bufSize)) != -1) {
		   out.write(b,0,readCount);
		}

		in.close();
		out.close();
		System.out.println("Time: " + 
				(System.currentTimeMillis()-startTime) + "/1000 ¬í");
	}
}
