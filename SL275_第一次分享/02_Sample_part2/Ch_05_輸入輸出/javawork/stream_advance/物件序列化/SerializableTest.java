
import java.io.*;
import java.util.*;

class SerializableTest {
	public static void main(String[] args) 
			throws IOException, ClassNotFoundException {
		// 將物件寫入檔案中
		FileOutputStream out = new FileOutputStream("theTime");
		ObjectOutputStream so = new ObjectOutputStream(out);
		so.writeObject("Today");
		so.writeObject(new Date());
		so.flush();
		so.close();
		
		// 將物件由檔案中讀入
		FileInputStream in = new FileInputStream("theTime");
		ObjectInputStream si = new ObjectInputStream(in);
		String today = (String)si.readObject();
		Date date = (Date)si.readObject();
		si.close();
		
		// 將結果顯示在螢幕
		System.out.println(today);
		System.out.println(date);
	}
}
