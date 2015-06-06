// Unlock 
// Unlock + join()

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

  /*synchronized*/ void lastA() {
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

  /*synchronized*/ void lastB() {
    String name = Thread.currentThread().getName();	
    System.out.println(name+" 已經成功進入 B.lastB()...");             //成功進入時才能被印出
  }
}


class Deadlock_Unlock_Join implements Runnable {
  A a = new A();
  B b = new B();

  Thread racingThread;
  Thread racingThread2;

  Deadlock_Unlock_Join() {
    Thread.currentThread().setName("MainThread");
    racingThread  = new Thread(this, "RacingThread_哥哥");
    racingThread2 = new Thread(this, "RacingThread_妹妹");
    racingThread.start();
    racingThread2.start();

    a.aoo(b);                                                //MainThread 出門  (取得"a"的鎖出門). 記得回家.
    System.out.println("MainThread 回家了!");                //MainThread 回家了(回的來才能被印出)
  }

  public void run() {
    b.bar(a);                                               //RacingThread 出門  (取得"b"的鎖出門). 記得回家.
    
    if(Thread.currentThread().getName().equals("RacingThread_哥哥")){   //控制執行緒回來先後
    try{racingThread2.join();} catch (InterruptedException e) {}
    }
                                                            //RacingThread 回家了(回的來才能被印出)(並指明回來的是那一個執行緒) 
    System.out.println("\t\t\t\t"+"RacingThread(s) 回家了!"+" [我是 "+Thread.currentThread().getName()+"]");
  }

  public static void main(String args[]) {
    new Deadlock_Unlock_Join();
  }
}
 
 
 
 	   