public class Test_Static_Method {
     
     public static void main(String args[]) {
         System.out.println("�еe�T����!");
         int count = 9;
         drawTriangle(count);
         System.out.println("�e���٤���!");
     }
     
     public static void drawTriangle(int count){
         int i, j;
         for ( i = 1; i <= count; i++){
            for ( j = 1; j <= i; j++ )
               System.out.print("*");
            System.out.println();
         }
     }
}