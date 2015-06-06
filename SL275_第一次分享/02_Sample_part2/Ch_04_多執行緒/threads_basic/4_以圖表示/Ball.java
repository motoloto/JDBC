
import java.awt.*;
import java.applet.*;

public class Ball extends Applet implements Runnable{

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
  Thread thisThread = Thread.currentThread();	
  while (myThread==thisThread) {
//  	repaint();
        paint(g);	
  }
 }

	
 public void  paint(Graphics g) 
 {
   g.setColor(Color.black);
   g.fillOval(x,y,ballSize,ballSize);

   if (x > 250-ballSize)
    basex = -1;
   if (x < 1)
    basex =  1;
   x+=basex; 

   if (y > 200-ballSize)
    basey = -1;
   if (y < 1)
    basey =  1;
   y+=basey;  

   g.setColor(Color.white);
   g.fillOval(x,y,ballSize,ballSize);
   try{
    Thread.sleep(sleepTime);
   }catch(Exception e){} 
 } 
 
 public void stop(){
  if (myThread!=null){		
   myThread=null;
  } 
 }	
 public void update(Graphics g){
   paint(g);
 }
}