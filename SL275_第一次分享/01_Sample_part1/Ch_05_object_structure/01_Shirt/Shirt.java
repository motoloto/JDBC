public class Shirt {

  public int shirtID = 0; // �w�]��Ũ�m ID
  public String description = "-description required-"; //�w�]������
  
  // �C��X R=����, B=�Ŧ�, G=���, U=���w
  public char colorCode = 'U';
  
  public double price = 0.0;      //�w�]������
  
  public int quantityInStock = 0; //�w�]�w�s�q
  
  // �Φ�method����ܨ䤤�@�Ӷ��ت���       
  public void displayShirtInformation() {

    System.out.println("Shirt ID: " + shirtID);
    System.out.println("Shirt description:" + description);
    System.out.println("Color Code: " + colorCode);
    System.out.println("Shirt price: " + price);
    System.out.println("Quantity in stock: " + quantityInStock);

  } //��k(method) ����
} // ���O(class) ����
