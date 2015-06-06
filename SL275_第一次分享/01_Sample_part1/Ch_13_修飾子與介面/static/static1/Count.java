public class Count {
  //產品序號
  private int serialNumber;        
  public  int getSerialNumber() {
      return serialNumber; 
  }
  //產品數量
  private static int counter;
  public static int getTotalCount() {
    return counter;
  }
  //建構元
  public Count() {
    counter++;
    serialNumber = 1000+ counter;
  }
}