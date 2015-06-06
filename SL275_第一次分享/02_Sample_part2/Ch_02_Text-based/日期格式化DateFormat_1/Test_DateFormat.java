import java.util.*;
import java.text.*;

class Test_DateFormat {

    public static void main(String argv[]) {
                
    //�P�a�ϵL��(�w�]���a�榡)
    //DateFormat df = DateFormat.getInstance();
    //DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
    //DateFormat df = DateFormat.getTimeInstance(DateFormat.FULL);
    //DateFormat df = DateFormat.getDateTimeInstance(DateFormat.FULL , DateFormat.FULL);   
    
    //�H�a�ϻy������, �p
      Locale locale = Locale.TAIWAN ;    //new Locale("zh","TW");
    //Locale locale = Locale.US ;        //new Locale("en","US");
    //Locale locale = Locale.JAPAN ;     //new Locale("ja","JP");
    //Locale locale = Locale.KOREA ;     //new Locale("ko","KR");
    //Locale locale = Locale.GERMANY;    //new Locale("de","DE")�����P�a�ϻy��
    
      DateFormat df = DateFormat.getDateTimeInstance(DateFormat.FULL , DateFormat.FULL , locale);
    //DateFormat df = DateFormat.getDateTimeInstance(DateFormat.LONG , DateFormat.LONG , locale);
    //DateFormat df = DateFormat.getDateTimeInstance(DateFormat.MEDIUM , DateFormat.MEDIUM , locale);
    //DateFormat df = DateFormat.getDateTimeInstance(DateFormat.SHORT , DateFormat.SHORT , locale);
    
    
    //�]�w�ɰ�, �p Japan ; America/Los_Angeles ; Australia/Queensland �����P���ɰ�
    TimeZone tz = TimeZone.getTimeZone("Japan"); 
	  df.setTimeZone(tz); 
    System.out.println(tz.getDisplayName());//�Ǧ^�A�X��i�ܵ��w�]�ϰ쪺�Τ᪺�ɰϦW��
    
    //�z�Lformat��k, �Njava.util.Date�榡�Ƭ�, �ҭn��ܪ���T
    String dfu = df.format(new java.util.Date());
    System.out.println(dfu);
    
    
    
   
/*    
    //�����Ǯɰ�
    String[] ids = TimeZone.getAvailableIDs();
    for (int i=0 ; i<ids.length ; i++)
    System.out.println(ids[i]);
*/    
    
    
/*    
    //�Ǧ^�Ҧ��y�����Ҫ��}�C
    Locale[] locales = DateFormat.getAvailableLocales(); //Locale[] locales = Locale.getAvailableLocales();
    for (int i = 0; i < locales.length; i++)
			System.out.println(locales[i]+ "=" + locales[i].getDisplayName()); 
			//locales[i]: �ϥΥѤU���u���j���y���B��a/�a�ϩM�ܼƨ������ӻy�����Ҫ��s�{�W�١C 
			//locales[i].getDisplayName(): �Ǧ^�A�X�V�Τ���ܪ��y�����ҦW
*/			
		

/*		
		//Locale�`�ƴ���
		System.out.println("Locale.TAIWAN="+Locale.TAIWAN);
    System.out.println("Locale.TAIWAN="+Locale.US);
    System.out.println("Locale.JAPAN="+Locale.JAPAN);
    System.out.println("Locale.KOREA="+Locale.KOREA);
    System.out.println("Locale.GERMANY="+Locale.GERMANY);
*/    
    }

}