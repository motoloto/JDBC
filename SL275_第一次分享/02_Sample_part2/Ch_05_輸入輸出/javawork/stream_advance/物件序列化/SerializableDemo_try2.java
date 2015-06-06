
import java.io.*;
public class SerializableDemo_try2 implements Serializable {

    String s;
    int n;
    static String s_static = "sssss"; //	未存 印出sssss
    transient String s_transient;     //    未存 印出null

    public SerializableDemo_try2(String s, int n, String st) {
        this.s = s;
        this.n = n;
        this.s_transient = st;
    }
    public static void main(String args[]) {
        try {
            SerializableDemo_try2 object_Original =
                new SerializableDemo_try2("Hello", 3, "ttttt");

            FileOutputStream fos = new FileOutputStream("object.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(object_Original);

            oos.flush();
            oos.close();
            fos.close();

            FileInputStream fis = new FileInputStream("object.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            SerializableDemo_try2 object_getAgain =
                (SerializableDemo_try2) ois.readObject();

            ois.close();
            fis.close();

            System.out.println(
                "object_Original: s="
                    + object_Original.s
                    + " ; n="
                    + object_Original.n
                    + "  object_Original.s_static="
                    + object_Original.s_static
                    + "  object_Original.s_transient="
                    + object_Original.s_transient);
            System.out.println(
                "object_getAgain: s="
                    + object_getAgain.s
                    + " ; n="
                    + object_getAgain.n
                    + "  object_getAgain.s_static="
                    + object_getAgain.s_static
                    + "  object_getAgain.s_transient="
                    + object_getAgain.s_transient);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}