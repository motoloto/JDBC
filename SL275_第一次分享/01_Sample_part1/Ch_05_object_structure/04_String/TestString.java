public class TestString {
	
	public static void main(String args[]) {

      String str1 = new String("hello");
     	String str2 = new String("hello");
     	String str3 = "hello";
     	String str4 = "hello";
     	
     	System.out.println(str1==str2);          //false
     	System.out.println(str3==str4);          //true   �� String pool
     	System.out.println(str1==str3);          //false
     	System.out.println(str2==str4);          //false
      
      System.out.println("--------");     	
     	
     	System.out.println(str1.equals(str2));   //true
     	System.out.println(str3.equals(str4));   //true
     	System.out.println(str1.equals(str3));   //true
     	System.out.println(str2.equals(str4));   //true






/* 
        //���� char charAt(int index)
        String s = "0123456789";
        System.out.println(s.charAt(5));
*/





 /* 
        //����length();
	      String s = "0123456789�굦�|";
	      int len = s.length();
	      System.out.print(s + " �����׬O ");
	      System.out.println(len + " �Ӧr");
*/




/*
        //���ժŦr�� String str = "";
	      String str = "";
	      //KDK6 �H�e
	      System.out.println(str.length()==0);
	      //KDK6 �}�l
	      System.out.println(str.isEmpty());
*/



/*	
        //����substring
        String s1 = "0123456789�굦�|";
		
	      String s2 = s1.substring(6);
	      System.out.println(s2);          //6789�굦�|
		
	      String s3 = s1.substring(6,9);
	      System.out.println(s3);          //678
	 
	      String s4 = s1.substring(9,10);
	      System.out.println(s4);          //9
		
	      String s5 = s1.substring(9,11);  //9��
	      System.out.println(s5);
*/





/* 		
	      //���� int compareTo(String anotherString)	
	      System.out.println("123".compareTo("456"));
		
	      //������j�p�g
	      System.out.println("abc".toUpperCase());
	      System.out.println("ABC".toLowerCase());
*/




    
/*   
        //����String replace(char oldChar, char newChar)
        String s = "0123456789�굦�|";
        s = s.replace('��','X');
        System.out.println(s); 
*/



		

/*	
        //���� trim();	
	      String s = " 0123456789�굦�| ";
	      System.out.println(s + " : ���׬� " + s.length() );
	      //�R���e�᪺�ť�
	      s = s.trim();
	      System.out.println(s + " : ���׬� " + s.length() );
*/		





/*	  
        //����indexOf(int ch) indexOf(int ch, int fromIndex)
        //indexOf(String str) indexOf(String str, int fromIndex)
	  
	      String s = "0123456789�굦�|0123456789";

	      //�D�o�r��'9'�Ĥ@���X�{����m
	      System.out.println(s.indexOf('9'));              //9
		
	      //�q��10�Ӧr���}�l�A�j�M'9'�Ĥ@���X�{����m
	      System.out.println(s.indexOf('9',9));            //9
		
	      //�q��11�Ӧr���}�l�A�j�M'9'�Ĥ@���X�{����m
	      System.out.println(s.indexOf('9',10));           //22
		
	      //�q��1�Ӧr���}�l�A�j�M"�굦�|"�Ĥ@���X�{����m
	      System.out.println(s.indexOf("�굦�|",0));       //10
		
	      //�p�G���w����r���s�b�A�h�Ǧ^-1
	      System.out.println(s.indexOf('z'));              //-1
*/
   


	}
}
