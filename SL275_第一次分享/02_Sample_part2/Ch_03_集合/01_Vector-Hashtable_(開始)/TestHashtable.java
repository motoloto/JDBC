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
          Hashtable hash = new Hashtable();
          hash.put("one", new Integer(1));
          hash.put("two", "2");
          hash.put("three", new Float(3.0));
          
          Integer oneValue = (Integer)hash.get("one");
          String twoValue = (String)hash.get("two");
          Float threeValue = (Float)hash.get("three"); 
          
          System.out.println(oneValue);
          System.out.println(twoValue);
          System.out.println(threeValue);
    }
}
