public class CounterMain {

    int counter = 10;

    public CounterMain() {
    } //�غc�̨��

    public void runMethod() { //�@�몺������k
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
    	CounterMain m1 = new CounterMain();
    	CounterMain m2 = new CounterMain();
        m1.runMethod();
        m2.runMethod();
    }

}