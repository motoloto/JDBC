class TestIfElse {
	public static void main(String args[]) {

		int a = 10;

		if (a == 10) {
			//�]�����󦨥ߡA�G�|����
			System.out.println("a ���ȬO 10");
		}

		if (a == 20) {
			System.out.println("a ���ȬO 20");
		} else {
			//�]�����󦨥ߡA�G�|����
			System.out.println("a ���Ȥ��O 20");
		}

		if (a == 20) {
			System.out.println("a ���ȬO 20");
		} else if (a == 30) {
			System.out.println("a ���ȬO 30");
		} else {
			//�]�����󦨥ߡA�G�|����
			System.out.println("a ���Ȥ��O 20 �]���O 30");
		}

	}
}
