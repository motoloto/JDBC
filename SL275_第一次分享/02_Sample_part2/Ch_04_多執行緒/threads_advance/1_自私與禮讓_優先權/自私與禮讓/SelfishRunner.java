
/**�ۨp�������
   -�ۨp�������(selfish thread): ���F "socially-impaired" �S��
   
   -�Y  : 1.�ۨp��������֦�"�K��j��(tight loop)" . �p�U���ҥܤ� while loop.
          2.�Ӱj��|����CPU����, (�ר�, �p�G�t�Τ��䴩Time-Slice�h�������W�� )���D:
             a. �Ӱj����槹��
             b. �γQ��Priority���䥦������m��cpu�����v
                (������Priority���䥦������i�Jready���A,���Y�Opreemptive���S��)
*/

public class SelfishRunner extends Thread {

    private int tick = 1;
    private int num;

    public SelfishRunner(int num) {
        this.num = num;
    }

    public void run() {
        while (tick < 400000) {
            tick++;
            if ((tick % 50000) == 0)
                System.out.println("Thread #" + num + ", tick = " + tick);
        }
    }
}
