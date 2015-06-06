/** 
    �ϥ� join() �� isAlive() 
  
    �ɮ�: JA_Test.java + NewThread.java
    ����: java JA_Test
    ����: join()�s�b�P�_�����P���G
*/


class Join_Test {
  public static void main(String args[]) {
    String name = Thread.currentThread().getName();	
    NewThread nt1 = new NewThread("NT1");
    NewThread nt2 = new NewThread("NT2");
    NewThread nt3 = new NewThread("NT3");
    System.out.println();

    System.out.println("�}�l Thread NT1 is alive: "
                        + nt1.t.isAlive());
    System.out.println("�}�l Thread NT2 is alive: "
                        + nt2.t.isAlive());
    System.out.println("�}�l Thread NT3 is alive: "
                        + nt3.t.isAlive());
                        
    // ���H�W���������
    
    try {
       System.out.println(" [�D�����: "+name+"]�}�l���ԥH�W���������.....");
       nt1.t.join();
       nt2.t.join();
       nt3.t.join();
    } catch (InterruptedException e) {
      System.out.println("Main thread Interrupted");
    }
 
    System.out.println("��� Thread NT1 is alive: "
                        + nt1.t.isAlive());
    System.out.println("��� Thread NT2 is alive: "
                        + nt2.t.isAlive());
    System.out.println("��� Thread NT3 is alive: "
                        + nt3.t.isAlive());
                        
    // ���H�W�����������,�̫�~���榹�q�{���X
    System.out.println(" �̫�"+" [�D�����: "+name+"]����exiting !");
  }
}
