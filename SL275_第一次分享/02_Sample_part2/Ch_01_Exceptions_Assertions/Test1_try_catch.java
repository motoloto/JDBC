public class Test1_try_catch { 
  
  public static void main(String[] args) {
      int i = 0;
      String[] strs = {"Hello1", "Hello2", "Hello3"};
      while(i < 4) {
        try {
              System.out.println(strs[i]);
        } catch (ArrayIndexOutOfBoundsException e) {
              System.out.println("1-�w�W�X�}�C������");
        } catch (Exception e) {
              System.out.println("2-�o��Exception");
        } 
        i++;
     }
  }
}
