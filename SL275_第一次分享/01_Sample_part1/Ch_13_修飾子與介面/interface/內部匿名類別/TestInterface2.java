//�ŧi����
interface Display2 {
	//�ŧi�ܼ�(�`��) , �׹��l�p�P public static final 
	int num1 = 100;   
	int num2 = 10;
	//�ŧi��k(��H��k) , �׹��l�p�P public abstract
	void disp2();
}

/*
  1. �ϥΤ����ΦW���O(Inner anonymous class)�i��ֵ{���X,
     �]���i�H�����A�t�~�ŧi�@�����O
  2. Inner class ���[���N��part2�ɦA������  
*/
class TestInterface2 {
	public static void main(String args[]) {
		Display2 p2 = new Display2(){
			public void disp2() {
		  System.out.print(num1 + " + " + num2 + " = ");
		  System.out.println(num1 + num2);
	    }
		};
		p2.disp2();
	}
}
