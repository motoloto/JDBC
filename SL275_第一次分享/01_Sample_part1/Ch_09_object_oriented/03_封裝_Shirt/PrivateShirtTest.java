public class PrivateShirtTest {
   
  public static void main (String args[]) {

    PrivateShirt privShirt = new PrivateShirt();
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
