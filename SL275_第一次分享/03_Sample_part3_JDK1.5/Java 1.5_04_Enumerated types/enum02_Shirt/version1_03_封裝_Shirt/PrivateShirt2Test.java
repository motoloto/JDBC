public class PrivateShirt2Test {
   
  public static void main (String args[]) {

  PrivateShirt2 privShirt = new PrivateShirt2();
  char colorCode;
  
    //1.�]�w�X�k���C��X'R'
  privShirt.setColorCode('R');
  colorCode = privShirt.getColorCode();
 
    //2.�]�i�h�F
  System.out.println("Color Code: " + colorCode);
  
    //3.�]�w���X�k���C��X'W'
  privShirt.setColorCode('W');
  colorCode = privShirt.getColorCode();
 
    //4.�]���i�h, ���O R
  System.out.println("Color Code: " + colorCode);
  } 
}
