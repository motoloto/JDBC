/*��������C�|�w�q
  ���U�ܽd�F�@�Ӥ���������Ҥl�A�ѳo�ӨҤl���i�H�ݥX�A
  �C�|���u�O�@�ؤ���S�����O�A
  �ҥH�ڭ̤]�~�@���٩I enum ���C�|�u���O�v�C
  ���i�H�֦��ۭq�غc���B���H�Τ�k�A
*/ 

enum SuitB { 
    spade("�®�"), heart("����"), diamond("���j"), club("����"), ; 
    
    private String type;      // ���
    
    SuitB(String type) {       // �]���]�w club("����"), ..�A�ҥH�����n���g���@�غc��
      this.type = type;
    }
    
    public String getType() { // ��k
      return type;
    }
    
    public void setType(String type) {
      this.type = type;
    }
} 
public class EnumeratedTypes2_2 {
  
  public static void main(String[] args) {
    for (SuitB suit : SuitB.values()) {
        System.out.println(suit + "=" + suit.getType());
    } //spade=�®� heart=���� diamond=���j club=����
    
    SuitB suit = SuitB.spade;
    System.out.println(suit.getType());  //�®�
    suit.setType("���ڬO�®�");
    System.out.println(suit.getType());  //���ڬO�®�
  }
}