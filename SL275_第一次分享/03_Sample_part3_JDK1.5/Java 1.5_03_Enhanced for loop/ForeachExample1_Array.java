
public class ForeachExample1_Array{
	public static void main(String[] args)	{
		
		float farray[] = {1.0f , 2.0f , 3.0f ,  4.0f , 5.0f };
		
		System.out.println("�ǲΪ�for �j��");
		for (int i=0; i<farray.length; i++)
			System.out.print(farray[i] + ", ");
		System.out.println('\n');
		 
    System.out.println("�W�j�\�઺ for �j��(Using Enhanced foreach)");
		for(float xx : farray)
			System.out.print( xx + ", ");
		System.out.println();
	}
}
