//�������O(�����O)
//��H���O
abstract class Airplane {
	protected double fuel;
	protected String iro;

	//��H��k
	public abstract void display();

	public void setdata(double num,String str) {
		fuel = num;
		iro = str;
	}
}
//���L�Q�Q�g�����O(�l���O)
class Jumbojet extends Airplane {
	//�w�q��H���O���ʧ@
	public void display() {
		System.out.print("�������U�Ʀ�" + fuel);
		System.out.println(" �C��O" + iro + "�⪺");
	}
}

class TestAbstract {
	public static void main(String args[]) {
		Jumbojet jumbo = new Jumbojet();
		jumbo.setdata(100,"��");
		jumbo.display();
	}
}
