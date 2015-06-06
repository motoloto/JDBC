//�ѦҤ����
import java.io.*;
import java.util.*;
import static java.lang.System.*;

public class DataInputExample {
	public static void main(String[] args) throws IOException {
		//Variables declare
		int totalAge = 0;
		double totalHeight = 0.0;
		double totalWeight = 0.0;
		int totalPerson = 0;
		Map<String, Integer> cities = new HashMap<String, Integer>();

		//Read data from file
		BufferedReader br = new BufferedReader(
												new FileReader("data.txt"));		
		
		//Parsing data
		String data;
		while((data = br.readLine()) != null) {
			totalPerson++;
			StringTokenizer st = new StringTokenizer(data, ",");
			if(st.hasMoreTokens() )	{
				int no = Integer.parseInt(st.nextToken());
				String name = st.nextToken();
				totalAge += Integer.parseInt(st.nextToken());
				totalHeight += Double.parseDouble(st.nextToken());
				totalWeight += Double.parseDouble(st.nextToken());
				String tel = st.nextToken();
				
				String city = st.nextToken();
				if (cities.containsKey(city)){
					int count = cities.get(city)+1;
					cities.put(city, count);
				}
				else
					cities.put(city, 1);
			}
		}
		
		//Output result
		out.printf("���� �~��: %d��%n", totalAge/totalPerson);
		out.printf("���� ����: %.2f����%n", totalHeight/totalPerson);
		out.printf("���� �魫: %.2f����%n", totalWeight/totalPerson);
		
		Set<String> keys = cities.keySet();
		for(String city : keys)
			out.printf("��} %S: %d�H%n", city, cities.get(city));
		
		
		System.out.println("\n---------����toString()-----------");		
		System.out.println("toString()="+cities);	//����toString()
	}
}
