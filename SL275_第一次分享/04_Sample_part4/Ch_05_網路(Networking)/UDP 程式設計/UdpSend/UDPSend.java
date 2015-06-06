/*
  �@�ӥ��N�o�e��Ƥ�(datagram)��UDPSend�{��  (port=1024)
  javac UDPSend.java
  java  UDPSend
*/
import java.io.*;
import java.net.*;

public class UDPSend {
  
  public static void main(String args[]) throws Exception{
  
    int port =1024;
    
    System.out.print("�п�J���s�u��IP�G");
    
    BufferedReader key_in= new BufferedReader(new InputStreamReader(System.in)); 
    String addr=key_in.readLine();                    //�q��LŪ��"�ت�IP"
    InetAddress address=InetAddress.getByName(addr);  //�إߥت��D����InetAddress����
    
    while(true){
      System.out.print("Send>");
    
      String message=key_in.readLine();              //�q��LŪ��"�H���r��"
      byte msg[]= message.getBytes();                //"�H���r��"�ର�줸�հ}�C
    
      //�� ["�H���r��"���줸�հ}�Cmsg + msg.length + �ت��D����InetAddress����address + port] ��l�� DatagramPacket(��Ƥ��ʥ])
      DatagramPacket packet= new DatagramPacket(msg, msg.length, address, port); 
    
      DatagramSocket dsocket=new DatagramSocket();   //�إ�DatagramSocket(��Ƥ����y) //�S���޼�
      dsocket.send(packet);                          //�g��DatagramSocket(��Ƥ����y)�e�XDatagramPacket(��Ƥ��ʥ])
      dsocket.close();                               //����DatagramSocket(��Ƥ����y)
   }
  }
}
