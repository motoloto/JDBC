public class TestOverloading{
     
     //��έ��n
     public static double areaMeasure(double radius){	
       return radius* radius*3.14;
     }
     //����έ��n
     public static double areaMeasure(double height, double width){	 	
       return height*width;
     }
     //��έ��n
     public static double areaMeasure(double upper, double bottom, double height){	
       return (upper+bottom)*height/2;
     } 
     
     public static void main(String args[]) {
        double i =  areaMeasure(3.0); 
        double j =  areaMeasure(3.0,4.0); 
        double k =  areaMeasure(3.0,4.0,5.0);
        System.out.println("��έ��n=" +i);
        System.out.println("����έ��n=" +j);
        System.out.println("��έ��n=" +k);
     } 
}      
 
 

                      