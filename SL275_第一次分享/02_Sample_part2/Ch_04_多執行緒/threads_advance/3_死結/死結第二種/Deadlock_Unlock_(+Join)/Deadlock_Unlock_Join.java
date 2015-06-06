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
    System.out.println("\t\t\t\t"+name+" �w�g���\�i�J A.lastA()...");  //���\�i�J�ɤ~��Q�L�X
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
    System.out.println(name+" �w�g���\�i�J B.lastB()...");             //���\�i�J�ɤ~��Q�L�X
  }
}


class Deadlock_Unlock_Join implements Runnable {
  A a = new A();
  B b = new B();

  Thread racingThread;
  Thread racingThread2;

  Deadlock_Unlock_Join() {
    Thread.currentThread().setName("MainThread");
    racingThread  = new Thread(this, "RacingThread_����");
    racingThread2 = new Thread(this, "RacingThread_�f�f");
    racingThread.start();
    racingThread2.start();

    a.aoo(b);                                                //MainThread �X��  (���o"a"����X��). �O�o�^�a.
    System.out.println("MainThread �^�a�F!");                //MainThread �^�a�F(�^���Ӥ~��Q�L�X)
  }

  public void run() {
    b.bar(a);                                               //RacingThread �X��  (���o"b"����X��). �O�o�^�a.
    
    if(Thread.currentThread().getName().equals("RacingThread_����")){   //���������^�ӥ���
    try{racingThread2.join();} catch (InterruptedException e) {}
    }
                                                            //RacingThread �^�a�F(�^���Ӥ~��Q�L�X)(�ë����^�Ӫ��O���@�Ӱ����) 
    System.out.println("\t\t\t\t"+"RacingThread(s) �^�a�F!"+" [�ڬO "+Thread.currentThread().getName()+"]");
  }

  public static void main(String args[]) {
    new Deadlock_Unlock_Join();
  }
}
 
 
 
 	   