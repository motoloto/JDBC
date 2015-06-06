/*
  一個癡癡等待接收資料元(datagram)的UDPReceive程式  (port=1024)
  javac UDPReceive.java
  java  UDPReceive
*/
import java.io.*;
import java.net.*;

public class UDPReceive {
  
  public static void main(String args[]) throws Exception {
    int port=1024;
    
    DatagramSocket dsocket=new DatagramSocket(port); //建立一個DatagramSocket(資料元插座)物件,並指定連接埠
    
    byte buf[]=new byte[1024];                       //準備一個1024個位元組的buf緩衝器
    
    System.out.println("UDPReceive Listening Port ("+port+")......");
    
    while (true) {  //無限迴圈
      DatagramPacket packet = new DatagramPacket(buf, buf.length); //建立一個擁用buf緩衝器的DatagramPacket(資料封包)物件 
      dsocket.receive(packet);//DatagramSocket(資料元插座)等待接收抵達在指定連接埠上的資料元
                              //接收到資料元後,會將該資料元送至DatagramPacket(資料元封包)所指定的buf緩衝器         
      //轉為字串 , 印出
      String msg=new String(buf, 0, packet.getLength()); 
      System.out.println("Receive>"+msg);               
    }
  }
}