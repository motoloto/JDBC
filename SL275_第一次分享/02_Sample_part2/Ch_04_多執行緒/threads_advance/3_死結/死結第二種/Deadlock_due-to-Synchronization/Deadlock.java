/** 
    ����(Deadlock)
  
    �ɮ�: Deadlock.java + A.java + B.java
    ����: java Deadlock
    ��  : 1.�HCTRL + C �פ�{��
          2.�HCTRL + BREAK �l��"�����"�P "monitor" �� cache �O��
          3.���� Main-Thread ���s�b
 
    ���}����:
          1.���I���b���}����, ���I�O���n���{�����s���������i��
          2.�H���{���Ө�,�Ѱ�4��synchronized���@�Y�i
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

  synchronized void lastB() {
    String name = Thread.currentThread().getName();	
    System.out.println(name+" �w�g���\�i�J B.lastB()...");             //���\�i�J�ɤ~��Q�L�X
  }
}


class Deadlock implements Runnable {
  A a = new A();
  B b = new B();

  Deadlock() {
    Thread.currentThread().setName("MainThread");
    Thread racingThread  = new Thread(this, "RacingThread");
    racingThread.start();

    a.aoo(b);                                                 //MainThread �X��  (���o"a"����X��). �O�o�^�a.
    System.out.println("MainThread �^�a�F!");                 //MainThread �^�a�F(�^���Ӥ~��Q�L�X)
  }

  public void run() {
    b.bar(a);                                                 //RacingThread �X��  (���o"b"����X��). �O�o�^�a.
    System.out.println("\t\t\t\t"+"RacingThread �^�a�F!");    //RacingThread �^�a�F(�^���Ӥ~��Q�L�X)
  }                                                           

  public static void main(String args[]) {
    new Deadlock();
  }
}
 
 
 
 	   