public class Count {
  //���~�Ǹ�
  private int serialNumber;        
  public  int getSerialNumber() {
      return serialNumber; 
  }
  //���~�ƶq
  private static int counter;
  public static int getTotalCount() {
    return counter;
  }
  //�غc��
  public Count() {
    counter++;
    serialNumber = 1000+ counter;
  }
}