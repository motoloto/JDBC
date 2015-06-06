public class CubbyHole {
    private int contents;
    private boolean available = false;

    public synchronized int get() {
        while (available == false) {
            try {
                //����Producer�N�ƭȩ�J
                wait();
            } catch (InterruptedException e) { }
        }
        available = false;
        //�q��Producer�ƭȤw�g����
        notifyAll();
        return contents;
    }

    public synchronized void put(int value) {
        while (available == true) {
            try {
                //����Consumer���X�ƭ�
                wait();
            } catch (InterruptedException e) { }
        }
        contents = value;
        available = true;
        //�q��Consumer�ƭȤw�g��J
        notifyAll();
    }
}
