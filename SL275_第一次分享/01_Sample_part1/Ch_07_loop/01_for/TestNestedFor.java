public class TestNestedFor{
    public static void main(String args[]){
        int row = 5;
        int col = 5;
        for(int i = 0; i < row; i++) {
            for(char ch =(char)('A' + i); ch < ('A' + col); ch++)
		          System.out.print(ch + " ");
	          System.out.print("\n");
        }
    
            
            
        /*  ´ú´ú¬Ý
		      for (char i=65;i>=65&i<=90;i++) {
	           System.out.println(i);
		      }
        */
    }
}


