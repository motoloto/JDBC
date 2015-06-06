public class Shirt {

  public int shirtID = 0;
  public String description = "-description required-";
  
  public char colorCode = 'U';
  
  public double price = 0.0; 
  
  public int quantityInStock = 0;
  
  public void displayShirtInformation() {
    p("Shirt ID: " + shirtID);
    p("Shirt description:" + description);
    p("Color Code: " + colorCode);
    p("Shirt price: " + price);
    p("Quantity in stock: " + quantityInStock);
  }

  public void p(String str) {
  	System.out.println(str);
  } 	

}
