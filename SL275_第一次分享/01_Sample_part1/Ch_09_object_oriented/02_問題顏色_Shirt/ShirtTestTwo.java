public class ShirtTestTwo {
   
  public static void main (String args[]) {
 
    Shirt myShirt = new Shirt();
    Shirt yourShirt = new Shirt();
  
    myShirt.displayShirtInformation();
    yourShirt.displayShirtInformation();

    //myShirt.colorCode='R';
    myShirt.colorCode='W';    // <-- ���p�ϥΪ̱N�C��~�Ȭ��զ�
    yourShirt.colorCode='G';

    myShirt.displayShirtInformation();
    yourShirt.displayShirtInformation();

  } 
}

