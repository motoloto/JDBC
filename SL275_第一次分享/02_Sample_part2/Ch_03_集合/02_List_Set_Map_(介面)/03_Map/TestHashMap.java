import java.util.*; 
    public class TestHashMap {
     public static void main(String args[]) {
          Map map = new HashMap();
          map.put("one", new Integer(1));
          map.put("two", "2");
          map.put("three", new Float(3.0));
          
          //取出所有的key,包裝為Set的型態
          Set set = map.keySet();
          
          Iterator it = set.iterator();
          while(it.hasNext()){
            Object myKey = it.next();
            System.out.println(myKey +"="+ map.get(myKey));
          }
           
          /**
             keySet() 方法來自Map介面,
             所以所有Map家族成員都適用此方式取值 ,
             因此Hashtable類別也當然適用
          */   
 
     }
}
