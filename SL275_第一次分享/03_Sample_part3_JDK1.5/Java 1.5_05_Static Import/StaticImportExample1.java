/*
  1. Java 在 1.5 新版中的靜態載入，允許我們直接使用靜態方法和欄位：
*/


import static java.lang.System.out;
import static java.lang.Math.*;

public class StaticImportExample1 {
	
	public static void main(String[] args)	{
		  //不需要使用System.
	    out.println("9's sqrt root is "+sqrt(9));   //不需要使用Math.sqrt(d);
	    out.println("log 2 is "+log(2.0));          //不需要使用Math.log(d);
	}
}
