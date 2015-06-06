public class OrderTest {
   
  public static void main (String args[]) {
    Order myOrder = new Order();
    Shirt shirtOne = new Shirt();
    Shirt shirtTwo = new Shirt();
    Shirt shirtThree = new Shirt();
    double totalPrice = 0.0;
    
    shirtOne.price = 10.00;
    shirtTwo.price = 20.00;
    shirtThree.price = 30.00;

    totalPrice = myOrder.addShirt(shirtOne);

    System.out.println("Total amount for this order is: " + totalPrice);

    totalPrice = myOrder.addShirt(shirtTwo);

    System.out.println("Total amount for this order is: " + totalPrice);

    totalPrice = myOrder.addShirt(shirtThree);

    System.out.println("Total amount for this order is: " + totalPrice);


  } 
}
