public class PrivateShirt2Test {
   
  public static void main (String args[]) {

  PrivateShirt2 privShirt = new PrivateShirt2();
  char colorCode;
  
    //1.設定合法的顏色碼'R'
  privShirt.setColorCode('R');
  colorCode = privShirt.getColorCode();
 
    //2.設進去了
  System.out.println("Color Code: " + colorCode);
  
    //3.設定不合法的顏色碼'W'
  privShirt.setColorCode('W');
  colorCode = privShirt.getColorCode();
 
    //4.設不進去, 仍是 R
  System.out.println("Color Code: " + colorCode);
  } 
}
