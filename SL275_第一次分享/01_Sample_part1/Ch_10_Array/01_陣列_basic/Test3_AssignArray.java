public class Test3_AssignArray {
	public static void main(String[] args) {

		int[] intArray1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// �N intArray1���w�� intArray2
		int[] intArray2 = intArray1;

		// �NintArray2�Ҧ��������令0
		for (int i = 0; i < intArray2.length; i++)
			intArray2[i] = 0;

		// �C�L��� intArray1�Ҧ�����,�]�|��ۧ���
		for (int i = 0; i < intArray1.length; i++)
			System.out.println(intArray1[i]);
	}
}