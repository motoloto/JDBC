public class CloneableShirt implements Cloneable {

  private char colorCode = 'U';
  
  public char getColorCode() {
    return colorCode;
  }
  
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
  
  public static void main(String[] args) {
       CloneableShirt myShirt   = new CloneableShirt();
       CloneableShirt yourShirt = new CloneableShirt();
       myShirt.setColorCode('R');
       yourShirt.setColorCode('G');
       
       System.out.println(myShirt.getColorCode()); //R      
       try {
           myShirt = (CloneableShirt)yourShirt.clone();
       }catch (CloneNotSupportedException e) {
           System.out.println("�����\�ƻs������!");
           e.printStackTrace();
       } 
       System.out.println(myShirt.getColorCode()); //G  
  }
}