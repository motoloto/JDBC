public class TestOnly_But01{
	
  public static void main(String args[])	{
		 
/* 		 
   System.out.println(1+1);   //2   �Ʀr�ۥ[
   System.out.println("1"+1); //11  �걵�B��
*/





/* 
	 System.out.println(5.0/2);  //2.5
	 System.out.println(5/2);    //2 �`�N
*/





/* 	    
	 System.out.println(8.6%2.5);   //1.1
*/





/*
	 int x=10, y=5; float z=5.5f;
	 x=(y+4)/2*3; 
	 System.out.println(x);  //12
*/





/*
   int x=1; float y=2.0f;
	 int z = x + y;               //compile error �B��᪺�춥�P�B�⤸�춥���̬ۦP  float z = x + y;
	 System.out.println(z);
*/





/*       
   byte x=1; short y=2;
	 short z = x + y;             //compile error �Y��ӹB�⤸���򥻫��O�A�ܤַ|�ഫ��int���O  int z = x + y;
	 System.out.println(z);
*/





/*
   int a = 3;
   System.out.println(a++);  // 3
   System.out.println(a);    // 4
*/




/*
   int a = 3;
   System.out.println(++a);  // 4
   System.out.println(a);    // 4
*/





/*
	 int x=10, y=5;
	 x=x*y++;
	 System.out.println(x);  //50
   System.out.println(y);  //6
*/




	    
/*
	 int x=10, y=5;
	 x=x*++y; //60
	 System.out.println(x); //60
	 System.out.println(y); //6
*/





/*
   int x=1; double y=2.5;
	 x = y ;                                   //compile error  �k�Ȫ��춥,���i���󥪭Ȫ��춥
	 System.out.println("x ���ȬO " + x );	
	 System.out.println("y ���ȬO " + y );	
*/ 





/* 
	 float fValue = 0.0f; //�ŧi�@��float�ܼ�fValue�A�ë��w��l�Ȭ�0.0
		
	 System.out.println(fValue);
		
	 //�]�w�@�Ӱ���Q�����j��
	 for (int i=0 ; i<10 ; i++){
    fValue+=0.1;                //�j��C����@���A�N�NfValue���ƭȥ[�W0.1
    System.out.println(fValue); 
	 }
*/




/*      
        //�ѦҧY�i
        System.out.println("~8���ȬO " + ~8 );   //-9          
        // 00000000 00000000 00000000 00001000  (+8)
        // 11111111 11111111 11111111 11110111  (-9)
        System.out.println("~-9���ȬO " + ~-9 ); //8
	
	
	      // 00000000 00000000 00000000 00001000  (+8)
	      // 00000000 00000000 00000000 00000100  (+4)
	      // 00000000 00000000 00000000 00001100  (+12)
	      System.out.println("8&4���ȬO " + (8&4) );   //0
	      System.out.println("8|4���ȬO " + (8|4) );   //12
	      System.out.println("8^4���ȬO " + (8^4) );   //12
*/



/*	
	      //�ѦҧY�i
	      // 00000000 00000000 00000000 00100000  (+32)
	      // 00000000 00000000 00000000 00010000  (+16)
        // 00000000 00000000 00000000 00001000  (+8)
        // 00000000 00000000 00000000 00000100  (+4)
        // 00000000 00000000 00000000 00000010  (+2)
        System.out.println("8<<1���ȬO " + (8<<1) );     //16
        System.out.println("8<<2���ȬO " + (8<<2) );     //32
        System.out.println("8>>1���ȬO " + (8>>1) );     //4
        System.out.println("8>>2���ȬO " + (8>>2) );     //2
        
        System.out.println(" 8>>>1���ȬO " + (8>>>1) );  //4   ��: �Ȭ����� >>> �P >> �ۦP
        System.out.println("-8>>>1���ȬO " + (-8>>>1) ); //    ��: �Ȭ��t�� >>> �ܦ�����
*/





/*
   //�T���B�⦡
	 int a=0, x=10, y=5;
	 a = ( x > y ) ? x+100 : y+100;
	 System.out.println(a);  //110
*/





/*       
   //�T���B�⦡
	 int x=10, y=5; float z=5.5f;
	 z=(x>y)?10:5; 
	 System.out.println(z);  //10.0
*/   





/*
   double a = 7.5;
	 short b;
	
	 b = a;  //���w�ܼƭȮɪ������|�o�Ϳ��~

	 System.out.println("b ���ȬO " + (b) );	
*/  

		   
/* 
	 double a = 7.5;
	 short b;
	
	 b = (short)a; //�]�����ഫ���O�A�ҥH���|�o�Ϳ��~

	 System.out.println("b ���ȬO " + (b) );
*/




	    
/*
	 int x=10, y=5; float z=5.5f;
	 x=(int)z+4;
	 System.out.println(x);   //9
*/




	    


  }

}