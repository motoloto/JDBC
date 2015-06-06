/*
    �sĶ: javac TcpServer1.java
    ����: java  TcpServer1
    ����: ��ť  1024 port
          �u��  ����1�� client
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
	      //�b��1024�إ�ServerSocket, �õ��ݫȤ�ݪ��s��
	     sc=new ServerSocket(1024);
	      //accept() method �󱵨�Ȥ�ݪ��s����, �^�Ǥ@�� Socket ����.
	     socket=sc.accept();
	}catch(IOException ioe){
	     System.err.println("Exception"+ioe);
	     return;
	}
	
	try{
	      //���o�M�Ȥ�ݤ�������X�J��Ƭy
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
	
	     out.close();    //������X��Ƭy
       in.close();     //������J��Ƭy
       socket.close(); //�����P�Τ��ͪ�Socket
       sc.close();     //������ť��ServerSocket
	}catch(IOException e){
	     System.err.println("Exception"+e);
	 }
  }
}