/**
   JDK1.5 ���@�k:
*/
import java.util.*;

public class GenericList {
	public static void main(String[] args) {
		List<String> data = new ArrayList<String>();
		data.add("Hello");
		data.add("World");
		
		Iterator<String> it = data.iterator();
		while (it.hasNext()){
			String str = it.next();    //�j�����,���A�ݭn
			System.out.println(str);
		}
	}
}