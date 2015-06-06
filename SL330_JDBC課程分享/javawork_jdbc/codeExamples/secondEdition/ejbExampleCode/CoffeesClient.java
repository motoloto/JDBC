import java.sql.*;
import javax.sql.*;
import javax.naming.*;
import javax.ejb.*;
import javax.rmi.*;

class CoffeesClient {

  public static void main(String[] args) {

    try {
      Context ctx = new InitialContext();
	  Object obj = ctx.lookup("ejb/Coffees");
      CoffeesHome chome = (CoffeesHome)
			PortableRemoteObject.narrow(obj, CoffeesHome.class);
      Coffees coffees = chome.create();
	  
      RowSet rset = coffees.getCoffees();


      // display the coffees for sale
      // get user input from GUI

      
      coffees.placeOrder("Colombian", 3, "12345");
      
      // repeat until user quits
    }
    catch (Exception e) {
      System.out.print(e.getClass().getName() + ":");
      System.out.println(e.getMessage());
    }
  }
}
