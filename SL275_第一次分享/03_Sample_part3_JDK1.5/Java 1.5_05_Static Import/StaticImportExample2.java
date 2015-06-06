/* 研究
  Java 中的 import 和 C++ 的 include 是不一樣的。
  import 主要的意思是告訴編譯器，程式所需要的類別，在那一個命名空間底下。
  不像 C++ 的是，C++ 是會把相關的二進位程式碼加入我們的程式碼中，
  所以C++ include 的檔案愈多，那麼程式就可能愈肥大；
  Java 的做法是只單純的指定出命名空間 (實際上會對應到目錄)，
  編譯時會檢查其指定的類別是否存在。
  等到執行時，再依照 import 所指定的命名空間去載入所需的類別。

  Java 在 1.5 新版中的靜態載入，允許我們直接使用靜態方法和欄位：
  
  既然原本 Java 的設計是我們必須要指定類別名稱，
  使得我們可以避免數個類別中的同名方法和欄位，
  現在加上一個靜態載入，那豈不是....?
  事實上靜態載入雖然可以少寫一些程式碼，但這也造成了同名混淆引起的問題，
  所以,
  如果真的必須要用靜態載入時，又遇到同名的情況，
  必須使用底下的方法解決： 
*/
import static java.lang.System.out;
import static java.lang.Integer.*;

public class StaticImportExample2{

	public static void main(String[] args){
	
		int i1 = 100;
		long i2 = 200L;
		
		out.printf("The int max value is %,d%n", MAX_VALUE);
		out.printf("The byte  max value is %,d%n", Byte.MAX_VALUE);
		
		
		
	}
}
