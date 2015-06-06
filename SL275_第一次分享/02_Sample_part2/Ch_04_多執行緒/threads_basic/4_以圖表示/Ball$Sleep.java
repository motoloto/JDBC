
import java.awt.*;
import java.applet.*;

public class Ball$Sleep extends Applet implements Runnable{
 int      tick = 800;
 int      limitX;
 int      limitY;
 int      x=5,y=7;
 int      basex=1,basey=1;
 int      ballSize  = 8;
 int      sleepTime = 5;
 Thread   myThread; 
 Graphics g;

 public void init(){
  setBackground(Color.black);
  g = getGraphics();
 }
 
 public void start(){
   if (myThread==null){	
    myThread = new Thread(this);
    myThread.start();
   }  
 }

 public void run(){
   while (myThread!=null) {
       tick--;
     if (tick > 200) {
  	 limitX=tick;
   	 limitY=tick;
     }
     if (tick == 200) {
      try {Thread.sleep(3000);} catch (InterruptedException e) {}
     }
     if (tick < 200 && tick >-200) {
      limitX=100;
      limitY=100;
     }
     if (tick <=-200) {
      limitX=400;
      limitY=100;
     }
        paint(g); 	
   }
 }

	
 public void  paint(Graphics g){
   g.setColor(Color.black);
   g.fillOval(x,y,ballSize,ballSize);

   if (x > limitX-ballSize)
    basex = -1;
   if (x < 1)
    basex =  1;
   x+=basex; 

   if (y > limitY-ballSize)
    basey = -1;
   if (y < 1)
    basey =  1;
   y+=basey;
     
   if (tick < 100){
    g.setColor(Color.green);
    g.drawString("¸êµ¦·|  MultiThread  ´ú¸Õ" ,110 , 50);
   }else
    g.setColor(Color.white);
    g.fillOval(x,y,ballSize,ballSize);
   try{
    Thread.sleep(sleepTime);
   }catch(Exception e){} 
 } 
 
 public void stop(){
   myThread=null;
 }
 	
 public void update(Graphics g){
   paint(g);
 }
 
}