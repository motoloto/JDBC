/*

說明:
  int 包裝成 Integer 稱之為 Autoboxing，反之則是 Auto-unboxing。
  
  在 Java 中的八種基本型別，分別是 byte, short, int, long, 
  float, double, char 和 boolean。
  理論上來說，真正的物件導向中的型別應該都必須是類別定義，
  像是 Short, Integer 等等類別。
  不過為了我們使用上的方便，Java 提供了基本型別。
  同時存在這兩種型別常常會造成我們在設計上要加上許多額外的程式碼，
  例如在做數字運算時，使用 int 或 double 型別來處理，
  但是要將數字存入容器時，必須要將其轉換成 Integer 或 Double 型別，
  才能使用 add(new Integer(i))，
  在使用容器或多型處理時常常要多一道轉型手續。 
  Java 1.5 中，已經增加了這方面的處理，
  稱之為 Autoboxing 和 Auto-unboxing，
  編譯器會自動幫我們在 int 和 Integer 之中轉換。
 

注意:  
  ※switch除了byte,short,int和char之外，亦可接受Wrapper物件
  ※若傳一int時，尋找所需Overloading方法時先找int，其次Wrapper類別，再找varargs(後述)
  ※但是應該小心
      Integer xx = null;
      int yy = xx;
    這種程式碼  

/*
   ※1.底下是一個簡單例子： 
*/

public class Autoboxing1 {
  
  public static void main(String[] args) {
	  Integer i1 = 1; //boxing
	  int i2 = i1;    //unboxing
		
	  int sum1 = i1 + i2;
	  Integer sum2 = i1 + i2;
	  System.out.println(sum1);
	  System.out.println(sum2);
 }
}