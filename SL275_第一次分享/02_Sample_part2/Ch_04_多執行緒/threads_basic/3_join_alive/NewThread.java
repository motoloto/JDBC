/**
  Using join() to wait for threads to finish.
*/

class NewThread implements Runnable {
  String name; // ������W�r
  Thread t;

  NewThread(String threadname) {      
    name = threadname;
    t = new Thread(this, name);   //�غc�����Y�P�ɫغc�����
    System.out.println("New thread: " + t);   //�æL�X�Ӱ�����������
    t.start();                                //�Ұʤ�
  }

  public void run() {
    try {
      for(int i = 2; i > 0; i--) {
        System.out.println(name + ": " + i);  //�L�X�ثe���b run()��run ����������W�r �Mi��
        Thread.sleep(1000);
      }
    } catch (InterruptedException e) {
      System.out.println(name + " interrupted.");
    }
    System.out.println(name + " ����exiting !");
  }
}