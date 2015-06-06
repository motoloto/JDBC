import java.util.*;

public class Schedule{    
            
    
    public static void main(String[] args){
        
        Timer timer = new Timer();
                
        TimerTask task = new TimerTask(){
            int count = 0; 
            public void run(){
                System.out.println("This is Task"+ count);
                System.out.println("�u�@�Ʃw���ɶ� = " + new Date(scheduledExecutionTime()));
                System.out.println("�u�@���檺�ɶ� = " + new Date() + "\n");                
                count++;
            }
        };
        Calendar cal = new GregorianCalendar(2012, Calendar.MAY, 1, 0, 0, 0);
        timer.scheduleAtFixedRate(task, cal.getTime(), 1*60*60*1000); 
    }
}
