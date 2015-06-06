public class CubbyHole {
    private int contents;
    private boolean available = false;

    public synchronized int get() {
        while (available == false) {
            try {
                //单Producer盢计
                wait();
            } catch (InterruptedException e) { }
        }
        available = false;
        //硄Producer计竒ǐ
        notifyAll();
        return contents;
    }

    public synchronized void put(int value) {
        while (available == true) {
            try {
                //单Consumer计
                wait();
            } catch (InterruptedException e) { }
        }
        contents = value;
        available = true;
        //硄Consumer计竒
        notifyAll();
    }
}
