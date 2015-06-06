/**
   JDK1.5 之前的作法
*/
import java.util.*;

public class BeforeGenericsList {
	public static void main(String[] args) {
		List data = new ArrayList();
		data.add("Hello");
		data.add("World");
		
		Iterator it = data.iterator();
		while (it.hasNext()) {
			String str = (String)it.next();  //強制轉形
			System.out.println(str);
		}
	}
}