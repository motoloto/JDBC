public class Test3_throws {
    String[] strs = {"Hello1", "Hello2", "Hello3"};
    
    public void printStrs(int i) throws Exception {
          System.out.println(strs[i]);
    } 
    
    public static void main(String[] args) {
        int i = 0;
        Test3_throws t3 = new Test3_throws();
        while(i < 4) {
            try {
                t3.printStrs(i);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("1-已超出陣列的長度");
            } catch (Exception e) {
                System.out.println("2-發生Exception");
            }
         i++;
        }
    }
}