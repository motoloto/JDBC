import java.util.*;
class ListSystemProperties {
   public static void main(String[] args) {
	
	  //���X�Ҧ��t���ݩ�
	  Properties p = System.getProperties();
	  //�C�X�Ҧ��ݩʤ��e(Key/Value)
	  p.list(System.out);


    // java ListSystemProperties > list.txt
    // java -DMyProperty=�d ListSystemProperties		
  }
}