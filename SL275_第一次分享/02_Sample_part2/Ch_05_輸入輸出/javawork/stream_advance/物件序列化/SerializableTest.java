
import java.io.*;
import java.util.*;

class SerializableTest {
	public static void main(String[] args) 
			throws IOException, ClassNotFoundException {
		// �N����g�J�ɮפ�
		FileOutputStream out = new FileOutputStream("theTime");
		ObjectOutputStream so = new ObjectOutputStream(out);
		so.writeObject("Today");
		so.writeObject(new Date());
		so.flush();
		so.close();
		
		// �N������ɮפ�Ū�J
		FileInputStream in = new FileInputStream("theTime");
		ObjectInputStream si = new ObjectInputStream(in);
		String today = (String)si.readObject();
		Date date = (Date)si.readObject();
		si.close();
		
		// �N���G��ܦb�ù�
		System.out.println(today);
		System.out.println(date);
	}
}
