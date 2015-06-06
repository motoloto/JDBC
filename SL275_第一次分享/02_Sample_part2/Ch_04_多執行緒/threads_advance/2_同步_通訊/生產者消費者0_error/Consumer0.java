public class Consumer0 extends Thread {
    private CubbyHole0 cubbyhole;
    private int number;

    public Consumer0(CubbyHole0 c, int number) {
        cubbyhole = c;
        this.number = number;
    }

    public void run() {
        int value = 0;
        for (int i = 0; i < 10; i++) {
            value = cubbyhole.get();
            System.out.println("\tConsumer #" + this.number
                               + " got: " + value);
            try {
                sleep((int)(Math.random() * 1000));
            } catch (InterruptedException e) { }
        }
    }
}

