public class Shirt {

  public int shirtID = 0; // 預設的襯衫 ID
  public String description = "-description required-"; //預設的說明
  
  // 顏色碼 R=紅色, B=藍色, G=綠色, U=未定
  public char colorCode = 'U';
  
  public double price = 0.0;      //預設的價格
  
  public int quantityInStock = 0; //預設庫存量
  
  // 用此method來顯示其中一個項目的值       
  public void displayShirtInformation() {

    System.out.println("Shirt ID: " + shirtID);
    System.out.println("Shirt description:" + description);
    System.out.println("Color Code: " + colorCode);
    System.out.println("Shirt price: " + price);
    System.out.println("Quantity in stock: " + quantityInStock);

  } //方法(method) 結束
} // 類別(class) 結束
