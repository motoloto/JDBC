class OuterDemo2 {
	private int outerNumber = 0;

	public void printOuterNumber() {
		System.out.println("3-再由OuterClass自行列印出外層類別的數值");
		System.out.println("outerNumber=" + outerNumber);
	}

	public class InnerClass {
		public void changeOuterNumber() {
			System.out.println("2-由InnerClass驅動變更外層OuterClass的數值");
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