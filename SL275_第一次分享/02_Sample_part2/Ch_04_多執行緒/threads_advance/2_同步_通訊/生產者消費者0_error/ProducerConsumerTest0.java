public class ProducerConsumerTest0 {
    public static void main(String[] args) {
        CubbyHole0 c = new CubbyHole0();
        Producer0 p1 = new Producer0(c, 1);
        Consumer0 c1 = new Consumer0(c, 1);

        p1.start();
        c1.start();
    }
}
