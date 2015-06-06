public class TestWrapper
{
	public static void main(String argv[])	{
		
		
		Integer wInt = new Integer(1);
    //JDK 1.4 一定要像這樣先做轉型的動作, 轉型回int才能運算
    int x = wInt.intValue();
    int y = Integer.parseInt("1");
		System.out.println(x+y);
		
		
		//JDK 1.5 才能這樣做 - 直接運算 -(Autoboxing/Unboxing)
		System.out.println(x+y+wInt);
		
		
		//注意 除到0
		System.out.println(0.0/0);      //NaN
		System.out.println(2.0/0);      //Infinity
		System.out.println(-2.0/0);     //-Infinity
	}
}