import java.util.*;
class GregorianCalendar_Time_Week {
  
  static String[] week =
          {"��","�@","�G","�T","�|","��","��"};
  
  public static void main(String args[]) {
    //Calendar cal = new GregorianCalendar(2010, Calendar.JANUARY, 1, 0, 0, 0);  //��� second
    //Calendar cal = new GregorianCalendar(2010, Calendar.JANUARY, 1, 0, 0);     //��� minute
    //Calendar cal = new GregorianCalendar(2010, Calendar.JANUARY, 1);           //��� Month 
      Calendar cal = new GregorianCalendar();                                    //�{�b 
    int y = cal.get(Calendar.YEAR); 
    int m = cal.get(Calendar.MONTH) + 1;
    int d = cal.get(Calendar.DATE);
    int h = cal.get(Calendar.HOUR_OF_DAY);
    int min = cal.get(Calendar.MINUTE);
    int sec = cal.get(Calendar.SECOND);
    System.out.print("���: ");
    System.out.println(y + "�~" + m + "��" + d + "��");
    System.out.print("�ɶ�: ");
    System.out.println(h + "�I" + min + "��" + sec + "��");
    
    int w = cal.get(Calendar.DAY_OF_WEEK)-1;
    System.out.println("�P��" + week[w]);
  }
}