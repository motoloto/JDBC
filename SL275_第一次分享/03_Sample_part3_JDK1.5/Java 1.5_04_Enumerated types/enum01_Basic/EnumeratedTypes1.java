/*
  �N�ƭӰѦҭȩΦW�ٶ��X�b�@�_�C
  �o�ض��X����k�A�ä��O�}�C�A�]���ݩ�e���C�q�`�ڭ̤������C�|�G
  enum Month �O�@�����O�A�h�B�i�٤����C�|���O�C
 -�C�|�����N�O�@�ث��O
 -�q getClass() ���Y�i�ݥX�ӬO�����O�A�C 

*/



enum Month { JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC }

public class EnumeratedTypes1 {
 
  public static void main(String[] args) {
    
    for (Month xx : Month.values()) {  //�W�j���� for �j�� 
      System.out.print(xx + " ");
    }
    System.out.println();
    
    Month yy = Month.JAN;
    System.out.println(yy); //JAN , �C�|�l���Ȩ��O���������W��
    
    System.out.println(yy.getClass());  //class Month
  }
}
