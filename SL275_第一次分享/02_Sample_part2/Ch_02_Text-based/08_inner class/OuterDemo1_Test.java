class OuterDemo1 {
	private int outerNumber = 0;
	
	public void printOuterNumber() {
		System.out.println("3-�A��OuterClass�ۦ�C�L�X�~�h���O���ƭ�");
		System.out.println("outerNumber=" + outerNumber);
	}

	public class InnerClass {
		public void changeOuterNumber() {
			System.out.println("2-��InnerClass�X���ܧ�~�hOuterClass���ƭ�");
			outerNumber++;
		}
	}
	
	public void event() {
		System.out.println("1-OuterClass�o�ͨƥ�");
		InnerClass ic = new InnerClass();
		ic.changeOuterNumber();
	}
}

public class OuterDemo1_Test {
	public static void main(String[] args) {
		OuterDemo1 oc = new OuterDemo1();
		oc.event();
		oc.printOuterNumber();
	}
}