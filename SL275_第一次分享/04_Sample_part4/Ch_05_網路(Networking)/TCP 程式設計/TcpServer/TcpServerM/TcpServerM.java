/*
    �sĶ: javac TcpServerM.java
    ����: java  TcpServerM
    ����: ��ť  1024 port
          �h��client��server
*/

import java.io.*;
import java.net.*;

public class TcpServerM {    
   
    public static void main(String args[]) throws IOException{
    	ServerSocket sc=null;          
        int count = 0;
    	
    	System.out.println("TcpServerM listening port 1024.......");
        try{
	     sc=new ServerSocket(1024);  //�b��1024�إ�ServerSocket, �õ��ݫȤ�ݪ��s��
	}catch(IOException ioe){
	     System.err.println("Could not listen on port: 1024.");
	     return;
	}
        
        
        try{
             while (true) {
                new ConnThread(sc.accept(), ++count).start(); //�s�u
             }
        } catch (IOException ioe) {
             System.err.println("Exception"+ioe);
        }                                   
        sc.close();
    }
}

