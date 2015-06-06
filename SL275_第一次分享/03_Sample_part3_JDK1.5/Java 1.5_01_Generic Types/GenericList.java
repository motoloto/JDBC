/**
   JDK1.5 的作法:
*/
import java.util.*;

public class GenericList {
	public static void main(String[] args) {
		List<String> data = new ArrayList<String>();
		data.add("Hello");
		data.add("World");
		
		Iterator<String> it = data.iterator();
		while (it.hasNext()){
			String str = it.next();    //強制轉形,不再需要
			System.out.println(str);
		}
	}
}