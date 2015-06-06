
import java.util.*;

public class ForeachExample4_payAttation {
	public static void main(String[] args){
		List<String> data = new ArrayList<String>();
		data.add("吳永志1");
		data.add("吳永志2");
		data.add("吳永志3");
		
		for(int i=data.size()-1; i>=0; i--)
		System.out.println(i+": "+data.get(i));
		System.out.println();

		for(String str : data)    //※以上我做不到
		System.out.println(str);  //※傳統for迴圈, 薑老的辣
	}
}
