/*
    編譯: javac TcpServerM.java
    執行: java  TcpServerM
    說明: 聆聽  1024 port
          多重client的server
*/

import java.io.*;
import java.net.*;

public class TcpServerM {    
   
    public static void main(String args[]) throws IOException{
    	ServerSocket sc=null;          
        int count = 0;
    	
    	System.out.println("TcpServerM listening port 1024.......");
        try{
	     sc=new ServerSocket(1024);  //在埠1024建立ServerSocket, 並等待客戶端的連結
	}catch(IOException ioe){
	     System.err.println("Could not listen on port: 1024.");
	     return;
	}
        
        
        try{
             while (true) {
                new ConnThread(sc.accept(), ++count).start(); //連線
             }
        } catch (IOException ioe) {
             System.err.println("Exception"+ioe);
        }                                   
        sc.close();
    }
}

