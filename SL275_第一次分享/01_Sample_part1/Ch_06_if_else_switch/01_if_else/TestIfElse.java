class TestIfElse {
	public static void main(String args[]) {

		int a = 10;

		if (a == 10) {
			//因為條件成立，故會執行
			System.out.println("a 的值是 10");
		}

		if (a == 20) {
			System.out.println("a 的值是 20");
		} else {
			//因為條件成立，故會執行
			System.out.println("a 的值不是 20");
		}

		if (a == 20) {
			System.out.println("a 的值是 20");
		} else if (a == 30) {
			System.out.println("a 的值是 30");
		} else {
			//因為條件成立，故會執行
			System.out.println("a 的值不是 20 也不是 30");
		}

	}
}
