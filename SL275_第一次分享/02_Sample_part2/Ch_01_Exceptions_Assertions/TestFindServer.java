public class TestFindServer { 

   String defaultServer="tw.yahoo.com";
   String alternateServer="www.pchome.com";
   
   public int open(String serverName , int portToConnect) {
      return -1;
      
     /* 
      if (serverName.equals("tw.yahoo.com"))
	       return  1;
	    else 
	       return  -1;
     */ 
      
      /*
	    if (serverName.equals("www.pchome.com"))
	        return  1;
	    else 
	        return  -1;
      */
	
   }

   public void connect(String serverName) throws TimeOutException {
    int success=0;
    int portToConnect = 80;
    success = open(serverName, portToConnect);
    if (success == -1) {
         throw new TimeOutException("Could not connect", portToConnect);
    }
   }


   public void findServer() {
    try {
        connect(defaultServer);
        System.out.println("connect to defaultServer=" + defaultServer + " 成功!");
    } catch (TimeOutException e) {
        System.out.println("Server timed out, try alternate");
        try {
            connect(alternateServer);
            System.out.println("connect to alternateServer=" + alternateServer + " 成功!");
        } catch (TimeOutException te) {
            System.out.println("No server available, reason: "
            + te.getReason() + " and port no : " + te.getPort());
        } 
    }
   }
   
   
   public static void main(String[] args) {
      TestFindServer tf1 = new TestFindServer();
      tf1.findServer();
   }
}