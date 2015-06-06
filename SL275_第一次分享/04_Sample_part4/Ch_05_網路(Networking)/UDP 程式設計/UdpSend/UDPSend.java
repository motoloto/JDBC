/*
  一個任意發送資料元(datagram)的UDPSend程式  (port=1024)
  javac UDPSend.java
  java  UDPSend
*/
import java.io.*;
import java.net.*;

public class UDPSend {
  
  public static void main(String args[]) throws Exception{
  
    int port =1024;
    
    System.out.print("請輸入欲連線的IP：");
    
    BufferedReader key_in= new BufferedReader(new InputStreamReader(System.in)); 
    String addr=key_in.readLine();                    //從鍵盤讀取"目的IP"
    InetAddress address=InetAddress.getByName(addr);  //建立目的主機之InetAddress物件
    
    while(true){
      System.out.print("Send>");
    
      String message=key_in.readLine();              //從鍵盤讀取"信息字串"
      byte msg[]= message.getBytes();                //"信息字串"轉為位元組陣列
    
      //用 ["信息字串"之位元組陣列msg + msg.length + 目的主機之InetAddress物件address + port] 初始化 DatagramPacket(資料元封包)
      DatagramPacket packet= new DatagramPacket(msg, msg.length, address, port); 
    
      DatagramSocket dsocket=new DatagramSocket();   //建立DatagramSocket(資料元插座) //沒有引數
      dsocket.send(packet);                          //經由DatagramSocket(資料元插座)送出DatagramPacket(資料元封包)
      dsocket.close();                               //關閉DatagramSocket(資料元插座)
   }
  }
}
