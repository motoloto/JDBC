/*
   在 Java 中，因為完全以類別來處理，
   所以我們在設定時必須要加上類別名稱，
   就像是在存取類別中靜態常數值一樣，
   從而避免了上述命名衝突的情況： 
*/
public class EnumeratedTypes3 {
  enum eColor { RED,    REEN,   BLUE,  ORANGE };
  enum Fruit  { BANANA, ORANGE, PEACH, APPLE };
    
    public static void main(String[] args) {
    eColor color = eColor.RED;    //必須指定類別才能通過編譯
    System.out.println(color);
    
    Fruit fruit = Fruit.BANANA;   //必須指定類別才能通過編譯
    System.out.println(fruit);
  }
}