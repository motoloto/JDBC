public class TestIfElseAnd {
   public static void main(String args[]) {
      
      int  age = 15;
      String sex = "�k";  //"�k"
      
      if (age <= 15)
          if (sex.equals("�k"))
            	System.out.println("15��(�t)�H�U�k�ͧK�O�ݹq�v!");
          else 
              System.out.println("�ݥI�O�ݹq�v!");
      else
          System.out.println("�ݥI�O�ݹq�v!");
   
    
    
      if (age <= 15 && sex.equals("�k"))
          System.out.println("15��(�t)�H�U�k�ͧK�O�ݹq�v!");
      else
          System.out.println("�ݥI�O�ݹq�v!");
   
  }
}