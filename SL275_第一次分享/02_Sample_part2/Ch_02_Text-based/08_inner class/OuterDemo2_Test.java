class OuterDemo2 {
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
}

public class OuterDemo2_Test {
	public static void main(String[] args) {
		OuterDemo2 oc = new OuterDemo2();
		OuterDemo2.InnerClass ic = oc.new InnerClass();
		ic.changeOuterNumber();
		oc.printOuterNumber();
	}
}