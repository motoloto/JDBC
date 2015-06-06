import java.util.*;
class GregorianCalendar_Time_Week {
  
  static String[] week =
          {"日","一","二","三","四","五","六"};
  
  public static void main(String args[]) {
    //Calendar cal = new GregorianCalendar(2010, Calendar.JANUARY, 1, 0, 0, 0);  //到秒 second
    //Calendar cal = new GregorianCalendar(2010, Calendar.JANUARY, 1, 0, 0);     //到分 minute
    //Calendar cal = new GregorianCalendar(2010, Calendar.JANUARY, 1);           //到日 Month 
      Calendar cal = new GregorianCalendar();                                    //現在 
    int y = cal.get(Calendar.YEAR); 
    int m = cal.get(Calendar.MONTH) + 1;
    int d = cal.get(Calendar.DATE);
    int h = cal.get(Calendar.HOUR_OF_DAY);
    int min = cal.get(Calendar.MINUTE);
    int sec = cal.get(Calendar.SECOND);
    System.out.print("日期: ");
    System.out.println(y + "年" + m + "月" + d + "日");
    System.out.print("時間: ");
    System.out.println(h + "點" + min + "分" + sec + "秒");
    
    int w = cal.get(Calendar.DAY_OF_WEEK)-1;
    System.out.println("星期" + week[w]);
  }
}