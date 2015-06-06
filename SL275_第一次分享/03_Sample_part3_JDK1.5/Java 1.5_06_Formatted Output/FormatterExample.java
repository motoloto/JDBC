import  java.text.*;
import java.util.*;
import static java.lang.System.*;

public class FormatterExample {
	
	public static void main(String[] args){
		
out.println("------------------�Ʀr�榡��-------------------");		
		
	  double num1 = 12345.678;
	  out.println(num1+"�i�榡�Ƥ��e�j\n");
	  
	  //�ϥ�DecimalFormat���O
	  Format dfm1 = new DecimalFormat("#,###.00");
		out.println(dfm1.format(num1)+"�i�ϥ�DecimalFormat���O�榡�ơj");
    
    //�ϥ�printf
		out.printf("%,.2f�i�ϥ�printf�榡�ơj%n", num1);


out.println("\n------------------����榡��-------------------");

    Date d1 = new Date();
    out.println(d1+"�i�榡�Ƥ��e��java.util.Date�j\n");
    
    Format sfm1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		out.println(sfm1.format(d1)+"�i�ϥ�SimpleDateFormat���O�榡�ơj");
		Format sfm2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		out.println(sfm2.format(d1)+"�i�ϥ�SimpleDateFormat���O�榡�ơj\n");

		out.printf("%tY/%<tm/%<td %<tT�i�ϥ�printf�榡�ơj%n",d1);
		out.printf("%tF %<tT�i�ϥ�printf�榡�ơj%n",d1);
		
out.println("\n-----------------------------------------------");
    
    out.printf("�ڥs%s, ���~%d��%n", "Peter", 18);  //%s�r�� , %d��� , %n����
    out.printf("PI���ͪ��%f ,�Ӧ۵M���E�ͪ��%f%n", Math.PI, Math.E);  //%f�B�I��
    out.printf("PI�Ȥ��Onull: %b", Math.E);  //%b�Dnull��true , null��false
  
  }
}
