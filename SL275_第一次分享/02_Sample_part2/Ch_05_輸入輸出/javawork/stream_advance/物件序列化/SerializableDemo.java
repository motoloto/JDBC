
import java.io.*;
public class SerializableDemo implements Serializable {

    String s;
    int n;

    public SerializableDemo(String s, int n) {
        this.s = s;
        this.n = n;
    }
    public static void main(String args[]) {
        try {
            SerializableDemo object_Original = new SerializableDemo("Hello", 3);

            FileOutputStream fos = new FileOutputStream("object.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(object_Original);

            oos.flush();
            oos.close();
            fos.close();

            FileInputStream fis = new FileInputStream("object.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            SerializableDemo object_getAgain = (SerializableDemo) ois.readObject();

            ois.close();
            fis.close();

            System.out.println(
                "object_Original: s=" + object_Original.s + " ; n=" + object_Original.n);
            System.out.println(
                "object_getAgain: s=" + object_getAgain.s + " ; n=" + object_getAgain.n);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}