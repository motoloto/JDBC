import java.util.*;
class Calendar_Time_Week {
  
  static String[] week =
          {"��","�@","�G","�T","�|","��","��"};
  
  public static void main(String args[]) {
    Calendar cal = Calendar.getInstance();
    int y = cal.get(Calendar.YEAR);
    int m = cal.get(Calendar.MONTH) + 1;
    int d = cal.get(Calendar.DATE);
    int h = cal.get(Calendar.HOUR_OF_DAY);
    int min = cal.get(Calendar.MINUTE);
    int sec = cal.get(Calendar.SECOND);
    System.out.print("���ѬO: ");
    System.out.println(y + "�~" + m + "��" + d + "��");
    System.out.print("�{�b�O: ");
    System.out.println(h + "�I" + min + "��" + sec + "��");
    
    int w = cal.get(Calendar.DAY_OF_WEEK)-1;
    System.out.println("�P��" + week[w]);
  }
}