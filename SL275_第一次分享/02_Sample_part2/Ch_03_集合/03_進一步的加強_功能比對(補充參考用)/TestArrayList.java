/**
 *  ArrayList 也是一可置入"任意物件"的"動態陣列"(可隨內含物多寡增減其長度)
 *  如果你需要經常將元素加在列表的末端 , 那麼 ArrayList 可以有很不錯的效率
 */
import java.util.*; 

public class TestArrayList {
	 public static void main(String args[]) {
	
	   List list = new ArrayList();
	   list.add(new Integer(12));
	   list.add(new Long(34L));
	   list.add(new Double(5.6));
	   list.add("Hello");
	   list.add("Hello");      // duplicate, is added
	
	      System.out.println("toString()="+ list);
	      System.out.println("元素個數="+ list.size());
	
	   Iterator objs = list.iterator();
	   while(objs.hasNext())
	    System.out.println(objs.next());
	 
	 
	   // List家族可以用Iterator或for迴圈取值
	   System.out.println();
     for (int i = 0 ; i < list.size() ; i++){
        Object obj = list.get(i);
        System.out.println(obj);
     } 
   
   
     //其它方法取值1 -> toArray()
	   System.out.println();
	   Object a[] = list.toArray();
     for (int i = 0 ; i < a.length ; i++)
       System.out.println(a[i]);
   
   }
}
