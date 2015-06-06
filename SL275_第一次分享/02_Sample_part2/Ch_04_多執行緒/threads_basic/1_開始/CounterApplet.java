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
        while (myThread != null) {              //執行緒執行的地方，在applet環境裡，經常是無窮迴圈
            repaint();
             try {
                 Thread.sleep(1000);            //暫停一秒
             } catch (Exception e) {
             }
        }
    }

    public void start() {
    	counter=10;
        if (myThread == null){
          myThread = new Thread(this); //產生執行緒物件, 並將applet的執行緒委託之
          myThread.start();            //執行Thread物件的start方法時，會執行applet的run方法
        }  
    }

    public void stop() {
        myThread = null;
    }

    public void paint(Graphics g) {
        g.drawString(""+counter, 80, 100);
        counter--;
        if (counter == 0)                  //計數器歸零時, 重新計數
            counter = 10;
    }
}