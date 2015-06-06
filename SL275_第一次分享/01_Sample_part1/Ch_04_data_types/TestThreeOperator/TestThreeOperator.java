public class TestThreeOperator {
   public static void main(String args[]) {
      int  area = 350, coverage = 200, count;
      count = area / coverage;
      count += (area % coverage == 0) ? 0 : 1;
      System.out.println("Need " + count +((count == 1) ? " can" : " cans"));

   }
}