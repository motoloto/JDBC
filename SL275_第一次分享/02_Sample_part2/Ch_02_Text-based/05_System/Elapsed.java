public class Elapsed {
  public static void main(java.lang.String[] args) {
	
	  System.out.println("�p�ɱq1��10000���j��");

    //���o�j��}�l�ɶ�(�@���1970�~1��1��ȩ]�ܲ{�b�ɶ�)
	  long start = System.currentTimeMillis(); 
	
	  for(int i=1; i <= 10000; i++)
	  System.out.println(i);
	
	  //���o�j�鵲���ɶ�(�@���1970�~1��1��ȩ]�ܲ{�b�ɶ�)
	  long end = System.currentTimeMillis();

	  System.out.println("�j����{�ϥΪ��ɶ�(Elapsed time): " + (end-start)/1000.0 +"��");
  }
}