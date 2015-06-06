public class Test2_TwoDimArray {
	public static void main(String[] args) {

		int[][] intArray = {
				                { 1, 2, 3, 4, 5},
				                { 6, 7, 8, 9, 10 }
				               };
		int sum = 0;
        for(int i = 0; i < intArray.length; i++) {
            for(int j = 0; j < intArray[i].length; j++)
                 sum += intArray[i][j];
        }   
		System.out.println("Á`¦X="+sum);
	}
}