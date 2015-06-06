import java.sql.*;
import javax.sql.*;
import javax.naming.*;
import javax.ejb.*;

public class CoffeesBean implements SessionBean {

  public CoffeesBean () {}

  public void ejbCreate() throws CreateException {
    try {
      ctx = new InitialContext();
      ds = (DataSource)ctx.lookup("jdbc/CoffeesDB");
    }
    catch (Exception e) {
      throw new CreateException();
    }
  }

  public RowSet getCoffees() throws SQLException {

    Connection con = null;

    try {
      con = ds.getConnection("webCustomer", "webPassword");
      Statement stmt = con.createStatement();
      ResultSet rs =  stmt.executeQuery("select * from coffees");

      CachedRowSet rset = new CachedRowSet();
      rset.populate(rs);
      
      rs.close();
      stmt.close();

      return rset;
    } finally {
      if (con != null) con.close();
    }
  }

  public void placeOrder(String cofName, int quantity, String MgrId) 
	throws SQLException {

    Connection con = null;

    try {
      con = ds.getConnection("webCustomer", "webPassword");
      PreparedStatement pstmt = con.prepareStatement(
		"insert into orders values (?, ?, ?)");
      pstmt.setString(1, cofName);
      pstmt.setInt(2, quantity);
      pstmt.setString(3, MgrId);
      pstmt.executeUpdate();

      pstmt.close();
    } finally {
      if (con != null) con.close();
    }
  }

  //
  // Methods inherited from SessionBean
  //

  public void setSessionContext(SessionContext sc) {
    this.sc = sc;
  }

  public void ejbRemove() {}

  public void ejbPassivate() {}

  public void ejbActivate() {}

  private SessionContext sc = null;
  private Context ctx = null;
  private DataSource ds = null;
}
