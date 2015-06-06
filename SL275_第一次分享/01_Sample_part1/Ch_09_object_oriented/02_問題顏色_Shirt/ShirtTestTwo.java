public class ShirtTestTwo {
   
  public static void main (String args[]) {
 
    Shirt myShirt = new Shirt();
    Shirt yourShirt = new Shirt();
  
    myShirt.displayShirtInformation();
    yourShirt.displayShirtInformation();

    //myShirt.colorCode='R';
    myShirt.colorCode='W';    // <-- 假如使用者將顏色誤值為白色
    yourShirt.colorCode='G';

    myShirt.displayShirtInformation();
    yourShirt.displayShirtInformation();

  } 
}

