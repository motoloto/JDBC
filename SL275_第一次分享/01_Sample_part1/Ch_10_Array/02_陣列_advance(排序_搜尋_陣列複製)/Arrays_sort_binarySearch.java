import java.util.Scanner;  // Scanner���O�O JDK5.0 �s�W�����O 
import java.util.Arrays;   // Arrays.sort() ; Arrays.binarySearch()
 
public class Arrays_sort_binarySearch {
    public static void main(String[] args) {
 
        int[] data = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
 
        System.out.print("�Ƨǫe: "); 
        for(int i = 0; i < data.length; i++) 
            System.out.print(data[i] + " "); 
        System.out.println(); 
        
        //�Ƨ�(�ɧ�,�p��j�Ƨ�)
        Arrays.sort(data); 
 
        System.out.print("�Ƨǫ�: "); 
        for(int i = 0; i < data.length; i++) 
            System.out.print(data[i] + " ");
 
        
        System.out.println("�п�J���j�M����: ");
        Scanner scanner = new Scanner(System.in); // JDK5.0
        int key = scanner.nextInt(); // JDK5.0
        int index = -1;
        /**
          �ϥΤG���j���k,�j���}�C���Y�ӭȪ���m
          -�^�Ǳ��j�M���ȩ�}�C�������ަ�m(�^��int)
          -�b����j�M�e,�������N�Ӱ}�C�Ƨ�
          -�p�G���j�M���Ȥ��b�Ӱ}�C���A�h�^�ǭt��
        */
        if((index = Arrays.binarySearch(data, key)) > -1) {
            System.out.println("�ӭȪ����ަ�m��: [" + index + "]"); 
        }else 
            System.out.println("�䤣����w��,���ަ�m��: [" + index + "]"); 
    }
}