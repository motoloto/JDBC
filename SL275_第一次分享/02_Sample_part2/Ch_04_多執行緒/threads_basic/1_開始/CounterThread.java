public class CounterThread extends Thread {

    int counter = 10;

    public CounterThread() {
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
    	CounterThread t1 = new CounterThread(); //���Ͱ��������
    	CounterThread t2 = new CounterThread();
        t1.start();                           //�I�s���������start()��k(�Y�Ұʰ����) , �H�Y���檫�󤤪�run��k
        t2.start();
    }

}