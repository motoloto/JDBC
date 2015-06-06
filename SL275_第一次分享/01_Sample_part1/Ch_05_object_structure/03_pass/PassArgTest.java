public class PassArgTest {
     
     static void passValue (double value) {
     	   value = 20.0; 
     }
     
     static void passReference (Shirt reference) {
     	   reference.price = 20.0; 
     }
     
     public static void main(String[] args) {
         
         double price = 10.0;
         passValue(price);
         System.out.println(price);          // 10.0
         
         Shirt myShirt = new Shirt();
         myShirt.price = 10;
         passReference(myShirt);
         System.out.println(myShirt.price);  // 20.0
    }
} 
