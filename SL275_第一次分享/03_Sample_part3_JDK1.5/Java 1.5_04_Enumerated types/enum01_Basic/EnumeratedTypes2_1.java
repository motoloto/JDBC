/*��������C�|�w�q
  ���U�ܽd�F�@�Ӥ���������Ҥl�A�ѳo�ӨҤl���i�H�ݥX�A
  �C�|���u�O�@�ؤ���S�����O�A
  �ҥH�ڭ̤]�~�@���٩I enum ���C�|�u���O�v�C
  ���i�H�֦��ۭq�غc���B���H�Τ�k�A
*/

enum SuitA { 
    club(1), diamond(2), heart(3), spade(4);
    
    private int value;      // ���
    
    SuitA(int value) {       // �]���]�w club(1), ..�A�ҥH�����n���g���@�غc��
      this.value = value;
    }
    
    public int getValue() { // ��k
      return value;
    }
    
    public void setValue(int value) {
      this.value = value;
    }
} 
public class EnumeratedTypes2_1 {
  
  public static void main(String[] args) {
    for (SuitA suit : SuitA.values()) {
        System.out.println(suit + "=" + suit.getValue());
    }
    SuitA suit = SuitA.diamond;
    System.out.println(suit.getValue());
    suit.setValue(10);
    System.out.println(suit.getValue());
  }
}