public class CounterRunnable implements Runnable {

    int counter = 10;

    public CounterRunnable() {
    } //�غc�̨��

    public void run() { //��������檺�a��
        while (counter >0) {
            System.out.println(counter);
            counter--;

            try {
                Thread.sleep(1000); //�Ȱ��@��
            } catch (Exception e) {
            }
        }
    }

    public static void main(String arg[]) {
    	CounterRunnable r1 = new CounterRunnable();//����Runnable����
    	Thread t1 = new Thread(r1);                //�A��Runnable����, ���Ͱ����Thread����
    	CounterRunnable r2 = new CounterRunnable();
    	Thread t2 = new Thread(r2);
        t1.start();                              //�I�s���������start()��k(�Y�Ұʰ����) , �H�Y���檫�󤤪�run��k
        t2.start();
    }

}