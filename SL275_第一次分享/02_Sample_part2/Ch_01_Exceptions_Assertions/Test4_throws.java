public class Test4_throws {
    String[] strs = {"Hello1", "Hello2", "Hello3"};
    
    public void printStrs(int i) throws Exception {
          System.out.println(strs[i]);
    } 
    
    public static void main(String[] args) throws Exception {
        int i = 0;
        Test4_throws t4 = new Test4_throws();
        while(i < 4) {
                t4.printStrs(i);
         i++;
        }
    }
}
