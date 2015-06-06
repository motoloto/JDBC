public class Consumer extends Thread {
    private CubbyHole cubbyhole;
    private int number;

    public Consumer(CubbyHole c, int number) {
        cubbyhole = c;
        this.number = number;
    }

    public void run() {
        int value = 0;
        for (int i = 0; i < 10; i++) {
        	synchronized (cubbyhole) {
	            value = cubbyhole.get();
	            System.out.println("\tConsumer #" + this.number
	                               + " got: " + value);
	        }
            try {
                sleep((int)(Math.random() * 1000));
            } catch (InterruptedException e) { }
        }
    }
}

