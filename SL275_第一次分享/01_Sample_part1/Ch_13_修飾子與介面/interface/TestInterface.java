//�ŧi����
interface Display {
	//�ŧi�ܼ�(�`��) , �׹��l�p�P public static final 
	int num1 = 100;   
	int num2 = 10;
	//�ŧi��k(��H��k) , �׹��l�p�P public abstract
	void disp();
}
//��@����
class Plus implements Display {
	public void disp() {
		System.out.print(num1 + " + " + num2 + " = ");
		System.out.println(num1 + num2);
	}
}
//��@����
class Minus implements Display {
	public void disp() {
		System.out.print(num1 + " - " + num2 + " = ");
		System.out.println(num1 - num2);
	}
}

class TestInterface {
	public static void main(String args[]) {
		Plus p1 = new Plus();
		p1.disp();
		Minus m1 = new Minus();
		m1.disp();
	}
}
