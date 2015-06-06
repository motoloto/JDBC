import java.rmi.*;
import javax.ejb.*;

public interface CoffeesHome extends javax.ejb.EJBHome {
  public Coffees create() throws RemoteException, CreateException;
}
