public class Count {
  //���~�Ǹ�
  private int serialNumber;        
  public  int getSerialNumber() {
      return serialNumber; 
  }
  //���~�ƶq
  private static int counter;
  static {
    counter = 0;
    System.out.println(
    "�_�l�ƶq:" + counter + "\n");
  }
  public static int getTotalCount() {
    return counter;
  }
  //�غc��
  public Count() {
    counter++;
    serialNumber = 1000+ counter;
  }
}