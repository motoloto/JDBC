public class ArrayCopy { 
    public static void main(String[] args) { 
        
        /**
          *�H�U�@�k�}�C�ƻs, �Ҥ��|�v�T��l�}�Cdata������
          *������PAssignArray.java,��̤����b�O��������P���[��
        */  
        
        //�ӷ��}�C(���ƻs���}�C) data
        int[] data = {1, 2, 3, 4, 5}; 
        
        
        //���N�ӷ��}�Cdata�����@�Ӥ@�Ӥ���, copy�ܥت��}�Cdata1��
        //�ت��}�Cdata1�n�w���ŧi,�ê�l��
        int[] data1 = new int[5]; 
        for(int i = 0; i < data.length; i++) 
            data1[i] = data[i];
        for(int i = 0; i < data1.length; i++) 
            System.out.print(data1[i] + " "); 
        System.out.println();
        
        //���ϥ�System���O
        //System.arraycopy(�ӷ��}�C, (�ӷ��}�C)�_�l����, �ت��}�C, (�ت��}�C)�_�l����, �ƻs������);
        //�ت��}�Cdata2�n�w���ŧi,�ê�l��
        int[] data2 = new int[5];
        System.arraycopy(data, 0, data2, 0, 5);
        for(int i = 0; i < data2.length; i++) 
            System.out.print(data2[i] + " "); 
        System.out.println();
        
        
        //���ϥ�java.util.Arrays���O
        //copyOf(�ӷ��}�C, �ƻs������) --> JDK6�s�W��static��k: 
        //�ت��}�C(�ƻs�X���}�C)data3�i�H���ιw����l��(����new), �����^��(�ƻs�X)�@�ӷs���}�C
        int[] data3 = null;
        data3 = java.util.Arrays.copyOf(data, 10);
        for(int i = 0; i < data3.length; i++) 
            System.out.print(data3[i] + " "); 
        System.out.println();
        
        
        //�H�W�@�k, �Ҥ��|�v�T��Ӱ}�Cdata������
        
    } 
}