public class TestOperator {
   public static void main(String args[]) {
      int  x = 3, y = 5, z = 4;
      x = y++ * z; // x = 20, y = 6, z = 4
      x = ++y * z;// x = 28, y = 7, z = 4
      x = y +++ z;// x = 11, y = 8, z = 4
      x = y +(++ z);// x = 13, y = 8, z = 5
      System.out.println("x = " + x);
      System.out.println("y = " + y);
      System.out.println("z = " + z);
   }
}