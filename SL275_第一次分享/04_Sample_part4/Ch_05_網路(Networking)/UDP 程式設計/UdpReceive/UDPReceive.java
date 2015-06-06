/*
  �@��èè���ݱ�����Ƥ�(datagram)��UDPReceive�{��  (port=1024)
  javac UDPReceive.java
  java  UDPReceive
*/
import java.io.*;
import java.net.*;

public class UDPReceive {
  
  public static void main(String args[]) throws Exception {
    int port=1024;
    
    DatagramSocket dsocket=new DatagramSocket(port); //�إߤ@��DatagramSocket(��Ƥ����y)����,�ë��w�s����
    
    byte buf[]=new byte[1024];                       //�ǳƤ@��1024�Ӧ줸�ժ�buf�w�ľ�
    
    System.out.println("UDPReceive Listening Port ("+port+")......");
    
    while (true) {  //�L���j��
      DatagramPacket packet = new DatagramPacket(buf, buf.length); //�إߤ@�Ӿ֥�buf�w�ľ���DatagramPacket(��ƫʥ])���� 
      dsocket.receive(packet);//DatagramSocket(��Ƥ����y)���ݱ�����F�b���w�s����W����Ƥ�
                              //�������Ƥ���,�|�N�Ӹ�Ƥ��e��DatagramPacket(��Ƥ��ʥ])�ҫ��w��buf�w�ľ�         
      //�ର�r�� , �L�X
      String msg=new String(buf, 0, packet.getLength()); 
      System.out.println("Receive>"+msg);               
    }
  }
}