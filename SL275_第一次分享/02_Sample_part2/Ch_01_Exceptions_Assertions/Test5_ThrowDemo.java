public class Test5_ThrowDemo {
	public static double method(double i, double j) throws ArithmeticException {
		double result;
		if (j == 0) {
			throw new ArithmeticException("��! ����0 ! ��ƿ��~!");
		}
		result = i / j;
		return result;
	}

	public static void main(String[] args) {
		try {
			System.out.println(method(1, 0));
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			//��
			e.printStackTrace();
		}
	}
}