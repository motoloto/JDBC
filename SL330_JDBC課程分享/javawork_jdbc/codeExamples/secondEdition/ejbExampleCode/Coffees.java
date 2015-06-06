import java.rmi.*;
import java.sql.*;
import javax.sql.*;
import javax.ejb.*;

public interface Coffees extends EJBObject {
  public RowSet getCoffees() throws RemoteException, SQLException;
  public void placeOrder(String cofName, int quantity, String MgrId) 
	throws RemoteException, SQLException;
}
