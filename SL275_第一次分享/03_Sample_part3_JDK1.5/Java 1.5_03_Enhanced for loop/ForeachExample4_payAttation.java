
import java.util.*;

public class ForeachExample4_payAttation {
	public static void main(String[] args){
		List<String> data = new ArrayList<String>();
		data.add("�d�ç�1");
		data.add("�d�ç�2");
		data.add("�d�ç�3");
		
		for(int i=data.size()-1; i>=0; i--)
		System.out.println(i+": "+data.get(i));
		System.out.println();

		for(String str : data)    //���H�W�ڰ�����
		System.out.println(str);  //���ǲ�for�j��, ���Ѫ���
	}
}
