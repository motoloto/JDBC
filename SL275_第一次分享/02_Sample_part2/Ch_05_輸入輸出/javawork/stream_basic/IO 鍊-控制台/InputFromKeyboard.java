/**
  ��L��J
  InputStream �ഫ�� Reader
 */ 

import java.io.*;
 
public class InputFromKeyboard {
	public static void main(String args[]){
		 
		System.out.println("�п�J���....");
		
		InputStreamReader isr = new InputStreamReader(System.in);
				
		BufferedReader br = new BufferedReader(isr);
		
    try{
			
			String data = br.readLine();
			
			System.out.println(data);
			
		}catch(IOException e){
			e.printStackTrace();   
		}
	}
}
