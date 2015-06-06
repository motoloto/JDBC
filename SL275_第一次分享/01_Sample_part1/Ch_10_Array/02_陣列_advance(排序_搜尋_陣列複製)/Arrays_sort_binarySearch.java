import java.util.Scanner;  // Scanner類別是 JDK5.0 新增的類別 
import java.util.Arrays;   // Arrays.sort() ; Arrays.binarySearch()
 
public class Arrays_sort_binarySearch {
    public static void main(String[] args) {
 
        int[] data = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
 
        System.out.print("排序前: "); 
        for(int i = 0; i < data.length; i++) 
            System.out.print(data[i] + " "); 
        System.out.println(); 
        
        //排序(升序,小到大排序)
        Arrays.sort(data); 
 
        System.out.print("排序後: "); 
        for(int i = 0; i < data.length; i++) 
            System.out.print(data[i] + " ");
 
        
        System.out.println("請輸入欲搜尋的值: ");
        Scanner scanner = new Scanner(System.in); // JDK5.0
        int key = scanner.nextInt(); // JDK5.0
        int index = -1;
        /**
          使用二分搜索法,搜索陣列內某個值的位置
          -回傳欲搜尋之值於陣列內的索引位置(回傳int)
          -在執行搜尋前,必須先將該陣列排序
          -如果欲搜尋之值不在該陣列內，則回傳負值
        */
        if((index = Arrays.binarySearch(data, key)) > -1) {
            System.out.println("該值的索引位置為: [" + index + "]"); 
        }else 
            System.out.println("找不到指定值,索引位置為: [" + index + "]"); 
    }
}