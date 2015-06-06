/** 
    死結(Deadlock)
  
    檔案: Deadlock.java + A.java + B.java
    執行: java Deadlock
    註  : 1.以CTRL + C 終止程式
          2.以CTRL + BREAK 追蹤"執行緒"與 "monitor" 的 cache 記錄
          3.提醒 Main-Thread 的存在
 
    打開死結:
          1.重點不在打開死結, 重點是不要讓程式內存有死結的可能
          2.以此程式而言,解除4個synchronized之一即可
*/

class A {
  synchronized void aoo(B b) {
    String name = Thread.currentThread().getName();
    System.out.println(name + " entered A.aoo()");

    try {
      Thread.sleep(1000);
    } catch(Exception e) {
      System.out.println("A Interrupted");
    }

    System.out.println(name + " trying to call B.lastB()...");
    b.lastB();
  }

  synchronized void lastA() {
    String name = Thread.currentThread().getName();
    System.out.println("\t\t\t\t"+name+" 已經成功進入 A.lastA()...");  //成功進入時才能被印出
  }
}


class B {
  synchronized void bar(A a) {
    String name = Thread.currentThread().getName();
    System.out.println("\t\t\t\t" +name+ " entered B.bar()");

    try {
      Thread.sleep(1000);
    } catch(Exception e) {
      System.out.println("B Interrupted");
    }

    System.out.println("\t\t\t\t" +name+ " trying to call A.lastA()...");
    a.lastA();
  }

  synchronized void lastB() {
    String name = Thread.currentThread().getName();	
    System.out.println(name+" 已經成功進入 B.lastB()...");             //成功進入時才能被印出
  }
}


class Deadlock implements Runnable {
  A a = new A();
  B b = new B();

  Deadlock() {
    Thread.currentThread().setName("MainThread");
    Thread racingThread  = new Thread(this, "RacingThread");
    racingThread.start();

    a.aoo(b);                                                 //MainThread 出門  (取得"a"的鎖出門). 記得回家.
    System.out.println("MainThread 回家了!");                 //MainThread 回家了(回的來才能被印出)
  }

  public void run() {
    b.bar(a);                                                 //RacingThread 出門  (取得"b"的鎖出門). 記得回家.
    System.out.println("\t\t\t\t"+"RacingThread 回家了!");    //RacingThread 回家了(回的來才能被印出)
  }                                                           

  public static void main(String args[]) {
    new Deadlock();
  }
}
 
 
 
 	   