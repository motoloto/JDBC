public class TestWrapper
{
	public static void main(String argv[])	{
		
		
		Integer wInt = new Integer(1);
    //JDK 1.4 �@�w�n���o�˥����૬���ʧ@, �૬�^int�~��B��
    int x = wInt.intValue();
    int y = Integer.parseInt("1");
		System.out.println(x+y);
		
		
		//JDK 1.5 �~��o�˰� - �����B�� -(Autoboxing/Unboxing)
		System.out.println(x+y+wInt);
		
		
		//�`�N ����0
		System.out.println(0.0/0);      //NaN
		System.out.println(2.0/0);      //Infinity
		System.out.println(-2.0/0);     //-Infinity
	}
}