/*
   �b Java ���A�]�������H���O�ӳB�z�A
   �ҥH�ڭ̦b�]�w�ɥ����n�[�W���O�W�١A
   �N���O�b�s�����O���R�A�`�ƭȤ@�ˡA
   �q���קK�F�W�z�R�W�Ĭ𪺱��p�G 
*/
public class EnumeratedTypes3 {
  enum eColor { RED,    REEN,   BLUE,  ORANGE };
  enum Fruit  { BANANA, ORANGE, PEACH, APPLE };
    
    public static void main(String[] args) {
    eColor color = eColor.RED;    //�������w���O�~��q�L�sĶ
    System.out.println(color);
    
    Fruit fruit = Fruit.BANANA;   //�������w���O�~��q�L�sĶ
    System.out.println(fruit);
  }
}