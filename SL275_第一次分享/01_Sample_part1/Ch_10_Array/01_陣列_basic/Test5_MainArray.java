
/**
  java Test5_MainArray  101大樓  101
  java Test5_MainArray  "101 大樓"  101
*/

public class Test5_MainArray {
    public static void main(String[] args) {
        
        System.out.println("大樓名稱: " + args[0]);
        int floor = Integer.parseInt(args[1]);
        System.out.println(args[0]+"的第"+floor+"層");
    
    }
}
