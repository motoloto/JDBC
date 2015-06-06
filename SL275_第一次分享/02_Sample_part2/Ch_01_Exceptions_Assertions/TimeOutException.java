public class TimeOutException extends Exception {
    private String reason;
    private int port;
    public TimeOutException(String reason, int port){ 
          this.reason = reason;
          this.port = port;
    }
    public String getReason() { 
           return reason; 
    }
    public int getPort() {
           return port;
    }
}
