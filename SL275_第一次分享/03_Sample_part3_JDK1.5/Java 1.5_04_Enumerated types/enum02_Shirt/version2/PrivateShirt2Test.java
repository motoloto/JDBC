public class PrivateShirt2Test {
   
  public static void main (String args[]) {

  PrivateShirt2 privShirt = new PrivateShirt2();
  ColorCode colorCode;
  
    //1. �]�w�X�k���C��X'R'
    //2. �]�w���X�k���C��X��, �Ycompile error , �]�w�� enum �M�w�d��F
    //3. �w�F���b�sĶ���q�N�i�ˬd�ҳ]�w���C�|����ƬO�_�X�k���ت�!
  privShirt.setColorCode(ColorCode.R);
  System.out.println("Color Code: " + privShirt.getColorCode());
 
  } 
}
