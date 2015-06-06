/*
    �sĶ: javac TcpClient.java
    ����: java TcpClient serverIP serverPort
    �Ҧp: java TcpClient 140.115.236.192 1024 
    
    ����: �i�H�s�u����server
          ��Jquit���} 
*/

import java.io.*;
import java.net.*;

public class TcpClient{

public static void main(String args[]){
	String data;
	Socket socket;
	int port;
	InetAddress addr=null;
	BufferedReader key_in=new BufferedReader(new InputStreamReader(System.in));
	BufferedReader s_in;
	PrintWriter s_out;
	if(args.length!=2){
	System.out.println("java TcpClient serverIP serverPort");
	System.exit(0);
	}

	try{
		addr=InetAddress.getByName(args[0]);
	}
	catch(UnknownHostException uhe)
	{System.out.println("Server��}���~�Υ���...");}
	try{
		port=Integer.parseInt(args[1]);
		socket=new Socket(addr,port);
		s_in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		s_out=new PrintWriter(socket.getOutputStream());
		while(true){
			System.out.println("Client>");
			data=key_in.readLine();
			s_out.println(data);
			s_out.flush();
			if(data.equals("quit")) break;
			System.out.println(s_in.readLine());
		}

	socket.close();
	}
	catch(IOException ioe){System.out.println("�L�k�s���D��...");}
 }
}
