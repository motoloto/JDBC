
import java.awt.*;
import java.applet.*;

public class Ball$syn$Join extends Applet implements Runnable{

 private final static int NUMRUNNERS = 6;
 Thread   myThread[] = new Thread[NUMRUNNERS];
 Graphics g;
 Image gifBird;
 
 int tick[]= new int[]{500,500,500,500,500,500};
 int limitX[] = new int[NUMRUNNERS];
 int limitY[] = new int[NUMRUNNERS];
 int x[] = new int[NUMRUNNERS];
 int y[] = new int[NUMRUNNERS];
 int basex[] = new int[NUMRUNNERS];
 int basey[] = new int[NUMRUNNERS];

 int      lastTick  = -200;
 int      ballSize  = 8;
 int      sleepTime = 15;
 int      lastGoHome= 0;   // 0 到 < NUMRUNNERS-1 //(特別注意lastGoHome=NUMRUNNERS-1的情況,沒有一個球可結束迴圈)
                                                  //(lastGoHome=NUMRUNNERS-1 示範 join 一個無窮迴圈時 造成當機的情況)


 public void init(){
  setBackground(Color.black);
  g = getGraphics();
  gifBird = getImage(getCodeBase(), "bird.gif");
 }
 
 public void start(){
   for (int i = 0; i < NUMRUNNERS; i++) {
     if (myThread[i]==null){
     	try{Thread.sleep(500);}catch(Exception e){} 
        myThread[i] = new Thread(this,"t"+i);
        myThread[i].start();
     }
   }    
 }

 public void run(){
  String name = Thread.currentThread().getName();
  while (tick[NUMRUNNERS-1] >=lastTick) {
     for (int i = 0; i < NUMRUNNERS; i++) {	
 	if(("t"+i).equals(name)){
  	  
  	  System.out.print(name);
          System.out.println(" tick="+tick[i]);
          
          tick[i]--;
          if (tick[i] >200) {
  	    limitX[i]=tick[i];
   	    limitY[i]=tick[i];
          }
          if (tick[i] <=200 && tick[i] >100) {
            limitX[i]=125;
            limitY[i]=125;
          }
          if (tick[i] <=100 && tick[i] >-100) {
            limitX[i]=400;
            limitY[i]=100;
          }
          if (tick[i] <=-100) {
            limitX[i]=0;
            limitY[i]=0;
          }
          if((tick[lastGoHome] <= 200) && ("t"+lastGoHome).equals(name)){        
            for (int k = 0; k < NUMRUNNERS; k++) {
              if (k==lastGoHome)
                 continue;
              if(myThread[k]!=null){	
                try {myThread[k].join();} catch (InterruptedException e) {}
              }  
            }
          }
          
          paint(g);
        }
     }	
  }
    System.out.println(name+" say I have finished already");
 }

	
 synchronized public void  paint(Graphics g){
  String name = Thread.currentThread().getName();
  for (int i = 0; i < NUMRUNNERS; i++) {	
    g.setColor(Color.black);
    g.fillOval(x[i],y[i],ballSize,ballSize);
 
    if (x[i] > limitX[i]-ballSize)
     basex[i] = -1;
    if (x[i] < 1)
     basex[i] =  1;
    x[i]+=basex[i]; 

    if (y[i] > limitY[i]-ballSize)
     basey[i] = -1;
    if (y[i] < 1)
     basey[i] =  1;
    y[i]+=basey[i];
   

    if (tick[NUMRUNNERS-1] < 200 && ("t"+(NUMRUNNERS-1)).equals(name)){
     g.setColor(Color.red);
     g.drawString("e-BUSINESS 班" ,170 , 35);
     g.setColor(Color.green);
     g.drawString("MultiThread-Sychronized-Join 測試" ,110 , 50);
       g.setColor(Color.cyan);
       try {Thread.sleep(10);} catch (InterruptedException e) {}
       g.fillOval(110,y[NUMRUNNERS-1]+90,180,180);
       g.drawImage(gifBird,110,y[NUMRUNNERS-1]+95,this);
    }
     
   if(tick[NUMRUNNERS-1] >=lastTick) {
    g.setColor(Color.white);
    g.fillOval(x[0],y[0],ballSize,ballSize);
 
    g.setColor(Color.red);
    g.fillOval(x[1],y[1],ballSize,ballSize);
    
    g.setColor(Color.yellow);
    g.fillOval(x[2],y[2],ballSize,ballSize);
    
    g.setColor(Color.green);
    g.fillOval(x[3],y[3],ballSize,ballSize);
    
    g.setColor(Color.blue);
    g.fillOval(x[4],y[4],ballSize,ballSize);
    
    g.setColor(Color.magenta);
    g.fillOval(x[5],y[5],ballSize,ballSize);
   }    
  } 
    try{
     Thread.sleep(sleepTime);
    }catch(Exception e){}
 }
 
 
 public void stop(){
    for (int i = 0; i < NUMRUNNERS; i++) {
    	myThread[i]=null;
    	}
 }
 	
  public void update(Graphics g){
    paint(g);
  }
 
}