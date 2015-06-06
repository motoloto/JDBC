/**
 ÀÉ®× : Mother_Son_Test.java + Mother.java + Son.java
 °õ¦æ : java Mother_Son_Test
*/

public class Mother_Son_Test{
 
  public static void main(String arg[]){
 
   Mother mother = new Mother();	
   Son son1 = new Son("son1" , 1 , mother);
   Son son2 = new Son("son2" , 2 , mother);
  
   son1.start();
   son2.start();
  }
}


class Mother{

   /*synchronized*/ public void show(int empNO) {
       
       System.out.print("[");
          	                 try {Thread.sleep(1000);} catch (InterruptedException e) {}
       System.out.print(empNO);
       System.out.print("]");
   }	
} 


class Son extends Thread{
 
 Mother mother;
 int empNO;  

 public Son(String name , int empNO, Mother mother ){
  super(name);
  this.empNO = empNO;
  this.mother = mother;	
 } 

 public void run(){
      while (true){
    	mother.show(empNO);
     	yield();
      }
 }
}