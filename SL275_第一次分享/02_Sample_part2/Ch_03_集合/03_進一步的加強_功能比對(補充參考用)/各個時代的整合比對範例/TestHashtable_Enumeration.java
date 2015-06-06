/**
 1.Hashtable �����O�@��"�������"����Ƶ��c���x�s���, �C�@����Ƴ���
   ������������(key) , �o������O���󪺫��A , ���O�q�`����K�_��, �j
   ���������p���O�Q��"�r��"�ȷ�������(key). �Ϥ�������X�o����Ʈ�,
   �]�O�Q�έ��ҳ]�w��������ȨӨ��X���
 
 2.���x�s���P����Ʈɥ��ݥΤ��P��������, �_�h�������ҹ�����ƭȬ���
   ���x�s���������
 
 3.Hashtable ����Ƥ]�O���󪺫��A, �ҥH�i�H�x�s����Φ������, �ϥΪ�
   ���X��ƪ��P��, �����`�N�Ӹ�ƪ����A�Ӧۦ�@�������ഫ(casting)���ʧ@. 
 
*/

import java.util.*;

public class TestHashtable_Enumeration {
     public static void main(String args[]) {
          Hashtable map = new Hashtable();
          map.put("one", new Integer(1));
          map.put("two", "2");
          map.put("three", new Float(3.0));
          
          Integer oneValue = (Integer)map.get("one");
          String twoValue = (String)map.get("two");
          Float threeValue = (Float)map.get("three"); 
          
          System.out.println(oneValue);
          System.out.println(twoValue);
          System.out.println(threeValue);
          
          
          //�����է��keySet()���@�k�ݬ�
          //���X�Ҧ���key(keyset),�]�ˬ�Set�����A
          /**
             keySet() ��k�Ӧ�Map����,
             �ҥH�Ҧ�Map�a�ڦ������A�Φ��覡���� ,
             �]��Hashtable���O�]��M�A��
          */   
          System.out.println();
          Set keyset = map.keySet();//���X�Ҧ���key(keyset),�]�ˬ�Set�����A
          
          Iterator keys = keyset.iterator();
          while(keys.hasNext())
           System.out.println(map.get(keys.next()));
           
           
           
          //�����է��values()���@�k�ݬ�
          //���X�Ҧ���value,�]�ˬ�Collection�����A
          /**
             values() ��k�Ӧ�Map����,
             �ҥH�Ҧ�Map�a�ڦ������A�Φ��覡���� ,
             �]��Hashtable���O�]��M�A��
          */  
          System.out.println();
          Collection c = map.values();//���X�Ҧ���value,�]�ˬ�Collection�����A
          
          Iterator values = c.iterator(); //���A�Q��Iterator��������
	        while(values.hasNext())
	          System.out.println(values.next());
	          
	        System.out.println();           //���ΦA�Q��JDK 1.5 ��for-each����
	        for(Object value : c)  
            System.out.println(value);
 
 
 
 
           
          
          //JDK 1.0�䥦��k���� -> elements()
          //�u�� Hashtable �~����method, �G�I�s��method�ɤ���Φh�����g�k
          System.out.println(); 
          Enumeration vals = map.elements();
          while(vals.hasMoreElements())
              System.out.println(vals.nextElement()); 

          //���X�Ҧ���key -> keys()
          //�u�� Hashtable �~����method, �G�I�s��method�ɤ���Φh�����g�k
          System.out.println();
          System.out.println("�Ҧ���keys�p�U:"); 
          Enumeration ekeys = map.keys();
             while(ekeys.hasMoreElements()) {
               System.out.println(ekeys.nextElement());
          }
      
           
          
    }
}
