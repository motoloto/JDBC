/**
  鍵盤輸入
  InputStream 轉換成 Reader
 */ 

import java.io.*;
 
public class InputFromKeyboard {
	public static void main(String args[]){
		 
		System.out.println("請輸入資料....");
		
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
