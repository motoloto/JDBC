public class TestIfElseAnd {
   public static void main(String args[]) {
      
      int  age = 15;
      String sex = "女";  //"男"
      
      if (age <= 15)
          if (sex.equals("女"))
            	System.out.println("15歲(含)以下女生免費看電影!");
          else 
              System.out.println("需付費看電影!");
      else
          System.out.println("需付費看電影!");
   
    
    
      if (age <= 15 && sex.equals("女"))
          System.out.println("15歲(含)以下女生免費看電影!");
      else
          System.out.println("需付費看電影!");
   
  }
}