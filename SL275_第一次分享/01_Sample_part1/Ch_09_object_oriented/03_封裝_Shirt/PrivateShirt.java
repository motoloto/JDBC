public class PrivateShirt {

  private int shirtID = 0;
  private String description = "-description required-";
  //�� �C��X R=����, B=�Ŧ�, G=���, U=���w
  private char colorCode = 'U';
  private double price = 0.0;
  private int quantityInStock = 0;
  
  //�� getXxx
  public char getColorCode() {
      return colorCode;
  }
  
  //�� setXxx
  public void setColorCode(char newCode) {
    switch (newCode) {
      case 'R': 
      case 'G': 
      case 'B':
        colorCode = newCode;
        break;
      default:
        System.out.println("�����T���C��X. �Шϥ� R, G, or B");
    }
  }
  //�� �䥦�� shirtID, description,
  //�� price, and quantityInStock �� get set��k, �Х�ӤW�z���@�k
}
