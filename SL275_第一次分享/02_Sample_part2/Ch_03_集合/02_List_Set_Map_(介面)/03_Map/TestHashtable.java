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

public class TestHashtable {
     public static void main(String args[]) {
          Map map = new Hashtable();
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
          //�����է��values()���@�k�ݬ�
    }
}
