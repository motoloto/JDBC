import java.io.*;

public class SlowCopy {
	public static void main(String[] args) throws IOException {
		
		long startTime = System.currentTimeMillis();
		
		File inputFile = new File("farrago.txt");
    File outputFile = new File("outagain.txt");

		FileInputStream in = new FileInputStream(inputFile);
		FileOutputStream out = new FileOutputStream(outputFile);

		int b;
		while ((b = in.read()) != -1) {
		   out.write(b);
		}

		in.close();
		out.close();
		System.out.println("Time: " + 
				(System.currentTimeMillis()-startTime) + "/1000 ¬í");
	}
}
