/**
   JDK1.5 ���e���@�k
*/
import java.util.*;

public class BeforeGenericsList {
	public static void main(String[] args) {
		List data = new ArrayList();
		data.add("Hello");
		data.add("World");
		
		Iterator it = data.iterator();
		while (it.hasNext()) {
			String str = (String)it.next();  //�j�����
			System.out.println(str);
		}
	}
}