import java.io.*;
import java.net.*;

class ConnThread extends Thread {  
    private Socket socket = null;
    int threadID;

    public ConnThread(Socket socket, int count) { //�غc�lsocket���Ȥ��
        this.socket = socket;  
        threadID = count;
    }

    public void run() {
        System.out.println("��" + threadID + "��ϥΪ̳s�u");
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream());
            
            while (true) {
                String msg = in.readLine(); //��socketŪ�J���r��msg
                if (msg.equals("quit"))
                    break;
                System.out.println("��" + threadID + "��ϥΪ̰T��:" + msg);
                String remsg = new String("\t"+"Server������T��:" + msg);
                out.println(remsg);
                out.flush();
            }
            out.close();    
            in.close();     
            socket.close(); 
            System.out.println("��" + threadID + "��ϥΪ����u");
        } catch (IOException e) {
            System.out.println(e);
        } 
    }
}