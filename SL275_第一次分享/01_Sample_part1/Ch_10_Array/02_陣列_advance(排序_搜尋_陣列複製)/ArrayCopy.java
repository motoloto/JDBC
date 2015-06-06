public class ArrayCopy { 
    public static void main(String[] args) { 
        
        /**
          *以下作法陣列複製, 皆不會影響原始陣列data內的值
          *應比較與AssignArray.java,兩者之間在記憶體當中不同的觀念
        */  
        
        //來源陣列(欲複製的陣列) data
        int[] data = {1, 2, 3, 4, 5}; 
        
        
        //●將來源陣列data中的一個一個元素, copy至目的陣列data1中
        //目的陣列data1要預先宣告,並初始化
        int[] data1 = new int[5]; 
        for(int i = 0; i < data.length; i++) 
            data1[i] = data[i];
        for(int i = 0; i < data1.length; i++) 
            System.out.print(data1[i] + " "); 
        System.out.println();
        
        //●使用System類別
        //System.arraycopy(來源陣列, (來源陣列)起始索引, 目的陣列, (目的陣列)起始索引, 複製的長度);
        //目的陣列data2要預先宣告,並初始化
        int[] data2 = new int[5];
        System.arraycopy(data, 0, data2, 0, 5);
        for(int i = 0; i < data2.length; i++) 
            System.out.print(data2[i] + " "); 
        System.out.println();
        
        
        //●使用java.util.Arrays類別
        //copyOf(來源陣列, 複製的長度) --> JDK6新增的static方法: 
        //目的陣列(複製出的陣列)data3可以不用預先初始化(不用new), 直接回傳(複製出)一個新的陣列
        int[] data3 = null;
        data3 = java.util.Arrays.copyOf(data, 10);
        for(int i = 0; i < data3.length; i++) 
            System.out.print(data3[i] + " "); 
        System.out.println();
        
        
        //以上作法, 皆不會影響原來陣列data內的值
        
    } 
}