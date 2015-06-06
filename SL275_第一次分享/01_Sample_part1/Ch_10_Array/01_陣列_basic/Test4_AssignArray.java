public class Test4_AssignArray {

	static void passReference(int[] intArray) {
		for (int i = 0; i < intArray.length; i++)
			intArray[i] = 0;
	}

	public static void main(String[] args) {
		int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		passReference(intArray);
		for (int i = 0; i < intArray.length; i++)
			System.out.println(intArray[i]);
	}
}