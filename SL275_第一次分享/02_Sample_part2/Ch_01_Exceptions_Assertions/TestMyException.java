
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

			  throw new MyException("發生自訂的例外了!");

		} catch (MyException e) {
			  System.out.println(e.getMessage());
			  //e.printStackTrace();
		}
	}
}
