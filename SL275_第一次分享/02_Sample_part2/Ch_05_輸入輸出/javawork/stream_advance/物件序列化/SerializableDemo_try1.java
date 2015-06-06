
import java.io.*;
public class SerializableDemo_try1 implements Serializable {
    String s;
    int n;
    public SerializableDemo_try1(String s, int n) {
        this.s = s;
        this.n = n;
    }
    public static void main(String args[]) {
        try {
            SerializableDemo_try1 object_Original = new SerializableDemo_try1("---Hello---", 3);

            FileOutputStream fos = new FileOutputStream("object.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(object_Original);
            oos.writeInt(111111111);
            oos.writeObject("HelloWorld");
            oos.writeFloat(2.0f);
            oos.flush();
            oos.close();
            fos.close();

            FileInputStream fis = new FileInputStream("object.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            SerializableDemo_try1 object_getAgain =
                (SerializableDemo_try1) ois.readObject();
            int i = ois.readInt();
            String str = (String) ois.readObject();
            float j = ois.readFloat();
            ois.close();
            fis.close();

            System.out.println(
                "object_Original: s=" + object_Original.s + " ; n=" + object_Original.n);
            System.out.println(
                "object_getAgain: s=" + object_getAgain.s + " ; n=" + object_getAgain.n);
            System.out.println("i=" + i);
            System.out.println("str=" + str);
            System.out.println("j=" + j);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}