public class TestCounter {
  public static void main(String[] args) {
    System.out.println("�_�l�ƶq:"+Count.getTotalCount()+"\n");
    
    Count count1 = new Count();
    System.out.println("�֭p�ƶq:"+Count.getTotalCount());
    System.out.println("�Ǹ�:"+count1.getSerialNumber()+"\n");
    
    Count count2 = new Count();
    System.out.println("�֭p�ƶq:"+Count.getTotalCount());
    System.out.println("�Ǹ�:"+count2.getSerialNumber()+"\n");
  }
}