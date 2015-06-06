/**
 *  ArrayList �]�O�@�i�m�J"���N����"��"�ʺA�}�C"(�i�H���t���h��W������)
 *  �p�G�A�ݭn�g�`�N�����[�b�C������ , ���� ArrayList �i�H���ܤ������Ĳv
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
	      System.out.println("�����Ӽ�="+ list.size());
	
	   Iterator objs = list.iterator();
	   while(objs.hasNext())
	    System.out.println(objs.next());
	 
	 
	   // List�a�ڥi�H��Iterator��for�j�����
	   System.out.println();
     for (int i = 0 ; i < list.size() ; i++){
        Object obj = list.get(i);
        System.out.println(obj);
     } 
   
   
     //�䥦��k����1 -> toArray()
	   System.out.println();
	   Object a[] = list.toArray();
     for (int i = 0 ; i < a.length ; i++)
       System.out.println(a[i]);
   
   }
}
