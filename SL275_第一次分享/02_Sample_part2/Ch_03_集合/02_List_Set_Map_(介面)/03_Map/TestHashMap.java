import java.util.*; 
    public class TestHashMap {
     public static void main(String args[]) {
          Map map = new HashMap();
          map.put("one", new Integer(1));
          map.put("two", "2");
          map.put("three", new Float(3.0));
          
          //���X�Ҧ���key,�]�ˬ�Set�����A
          Set set = map.keySet();
          
          Iterator it = set.iterator();
          while(it.hasNext()){
            Object myKey = it.next();
            System.out.println(myKey +"="+ map.get(myKey));
          }
           
          /**
             keySet() ��k�Ӧ�Map����,
             �ҥH�Ҧ�Map�a�ڦ������A�Φ��覡���� ,
             �]��Hashtable���O�]��M�A��
          */   
 
     }
}
