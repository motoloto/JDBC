
class MyException extends Exception {

	MyException() {
  }
	
	MyException(String message) {
		super(message);
	}
}

class TestMyException {
	public static void main(String args[]) {

		try {

			  throw new MyException("�o�ۭͦq���ҥ~�F!");

		} catch (MyException e) {
			  System.out.println(e.getMessage());
			  //e.printStackTrace();
		}
	}
}
