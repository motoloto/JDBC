/*
    編譯: javac TcpServer1.java
    執行: java  TcpServer1
    說明: 聆聽  1024 port
          只能  接受1個 client
*/


import java.io.*;
import java.net.*;
public class TcpServer1{

  public static void main(String args[]){
	ServerSocket sc;
	Socket socket;
	BufferedReader in;
	PrintWriter out;
        String data;
	
	System.out.println("TcpServer1 listening port 1024.......");
	try{
	      //在埠1024建立ServerSocket, 並等待客戶端的連結
	     sc=new ServerSocket(1024);
	      //accept() method 於接到客戶端的連結後, 回傳一個 Socket 物件.
	     socket=sc.accept();
	}catch(IOException ioe){
	     System.err.println("Exception"+ioe);
	     return;
	}
	
	try{
	      //取得和客戶端之間的輸出入資料流
	     in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
	     out=new PrintWriter(socket.getOutputStream());
	 
	     while(true){
		     data=in.readLine();
         if(data.equals("quit")) break;
 		     else {
		        out.println("\t"+"TcpServer1 get it:"+data);
		        out.flush();
 		     }
		     System.out.println("Recieve :"+data);
		     System.out.println("Connection accepted: port=" + socket.getPort());
	     }
	
	     out.close();    //關閉輸出資料流
       in.close();     //關閉輸入資料流
       socket.close(); //關閉與用戶交談的Socket
       sc.close();     //關閉聆聽的ServerSocket
	}catch(IOException e){
	     System.err.println("Exception"+e);
	 }
  }
}