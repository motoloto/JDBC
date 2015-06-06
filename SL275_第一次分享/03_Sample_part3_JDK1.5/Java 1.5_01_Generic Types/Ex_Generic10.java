/**
  ���q�d��, �Ӧ^��� 
  Ex_Generic8.java 
  Ex_Generic9.java
  Ex_Generic10.java
  ���̤��P
*/

import java.util.*;
public class Ex_Generic10 {
    public static void main(String[] args) {
        
        Vector<Integer> v1 = new Vector<Integer>();
        v1.add(100);
        v1.add(200);
        v1.add(300);
        System.out.println("�`�X = " + sumA(v1));
        System.out.println("�`�X = " + sumB(v1));
        
        Vector<Float> v2 = new Vector<Float>();
        v2.add(100.1f);
        v2.add(200.1f);
        v2.add(300.1f);
        System.out.println("�`�X = " + sumA(v2));
        System.out.println("�`�X = " + sumB(v2));
        
        Vector<Double> v3 = new Vector<Double>(); 
        v3.add(100.1d);
        v3.add(200.1d);
        v3.add(300.1d);
        System.out.println("�`�X = " + sumA(v3));
        System.out.println("�`�X = " + sumB(v3));
        
    }
    
    /*
      1.�ѩ�sumA()��k�ϥΤF<A extends Number>�ӥ[�H�׹�,�]���b�sĶ���ɭ�,
        �N�|�ۦ�P�_�ҶǶi�Ӫ������ܼ�v�O�_�ŦXA�o�Ӹ�ƫ��A,
        ���ɦbsumA()��k�~�i�H�����ϥ�<A>�o�өw���Ѽƨӫŧi
      2.�o�˪��w�q�k�u�O���F�����U�Φr��?�X�{�b�{����
      3.A�u�O�@�ӼХܲŸ�,��AA BB���i�H	  
    */
    static <A extends Number> float sumA(Vector<A> v) {
        float sum = 0;
        Iterator<A> it = v.iterator();
        while(it.hasNext()) {
        	  Number data = it.next();
            sum += data.floatValue();
        }
        return sum;
    }

    /*
      4.�H�W�g�k�p�P�H�U�g�k
    
    */
    static float sumB(Vector<? extends Number> v) {
        float sum = 0;
        Iterator<? extends Number> it = v.iterator();
        while(it.hasNext()) {
        	  Number data = it.next();
            sum += data.floatValue();
        }
        return sum;
    }

}