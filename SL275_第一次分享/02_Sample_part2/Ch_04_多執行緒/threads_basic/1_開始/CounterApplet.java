import java.awt.*;
import java.applet.*;
import java.io.*;

public class CounterApplet extends Applet implements Runnable { 

    Thread myThread;
    int counter;

    public void init() {
        setFont(new Font("TimesRoman" , Font.BOLD ,30));
    }

    public void run() {
        while (myThread != null) {              //��������檺�a��A�bapplet���Ҹ̡A�g�`�O�L�a�j��
            repaint();
             try {
                 Thread.sleep(1000);            //�Ȱ��@��
             } catch (Exception e) {
             }
        }
    }

    public void start() {
    	counter=10;
        if (myThread == null){
          myThread = new Thread(this); //���Ͱ��������, �ñNapplet��������e�U��
          myThread.start();            //����Thread����start��k�ɡA�|����applet��run��k
        }  
    }

    public void stop() {
        myThread = null;
    }

    public void paint(Graphics g) {
        g.drawString(""+counter, 80, 100);
        counter--;
        if (counter == 0)                  //�p�ƾ��k�s��, ���s�p��
            counter = 10;
    }
}