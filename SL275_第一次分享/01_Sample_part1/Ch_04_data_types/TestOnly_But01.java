public class TestOnly_But01{
	
  public static void main(String args[])	{
		 
/* 		 
   System.out.println(1+1);   //2   數字相加
   System.out.println("1"+1); //11  串接運算
*/





/* 
	 System.out.println(5.0/2);  //2.5
	 System.out.println(5/2);    //2 注意
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
	 int z = x + y;               //compile error 運算後的位階與運算元位階高者相同  float z = x + y;
	 System.out.println(z);
*/





/*       
   byte x=1; short y=2;
	 short z = x + y;             //compile error 若兩個運算元為基本型別，至少會轉換成int型別  int z = x + y;
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
	 x = y ;                                   //compile error  右值的位階,不可高於左值的位階
	 System.out.println("x 的值是 " + x );	
	 System.out.println("y 的值是 " + y );	
*/ 





/* 
	 float fValue = 0.0f; //宣告一個float變數fValue，並指定初始值為0.0
		
	 System.out.println(fValue);
		
	 //設定一個執行十次的迴圈
	 for (int i=0 ; i<10 ; i++){
    fValue+=0.1;                //迴圈每執行一次，就將fValue的數值加上0.1
    System.out.println(fValue); 
	 }
*/




/*      
        //參考即可
        System.out.println("~8的值是 " + ~8 );   //-9          
        // 00000000 00000000 00000000 00001000  (+8)
        // 11111111 11111111 11111111 11110111  (-9)
        System.out.println("~-9的值是 " + ~-9 ); //8
	
	
	      // 00000000 00000000 00000000 00001000  (+8)
	      // 00000000 00000000 00000000 00000100  (+4)
	      // 00000000 00000000 00000000 00001100  (+12)
	      System.out.println("8&4的值是 " + (8&4) );   //0
	      System.out.println("8|4的值是 " + (8|4) );   //12
	      System.out.println("8^4的值是 " + (8^4) );   //12
*/



/*	
	      //參考即可
	      // 00000000 00000000 00000000 00100000  (+32)
	      // 00000000 00000000 00000000 00010000  (+16)
        // 00000000 00000000 00000000 00001000  (+8)
        // 00000000 00000000 00000000 00000100  (+4)
        // 00000000 00000000 00000000 00000010  (+2)
        System.out.println("8<<1的值是 " + (8<<1) );     //16
        System.out.println("8<<2的值是 " + (8<<2) );     //32
        System.out.println("8>>1的值是 " + (8>>1) );     //4
        System.out.println("8>>2的值是 " + (8>>2) );     //2
        
        System.out.println(" 8>>>1的值是 " + (8>>>1) );  //4   註: 值為正時 >>> 與 >> 相同
        System.out.println("-8>>>1的值是 " + (-8>>>1) ); //    註: 值為負時 >>> 變成正值
*/





/*
   //三元運算式
	 int a=0, x=10, y=5;
	 a = ( x > y ) ? x+100 : y+100;
	 System.out.println(a);  //110
*/





/*       
   //三元運算式
	 int x=10, y=5; float z=5.5f;
	 z=(x>y)?10:5; 
	 System.out.println(z);  //10.0
*/   





/*
   double a = 7.5;
	 short b;
	
	 b = a;  //指定變數值時的部分會發生錯誤

	 System.out.println("b 的值是 " + (b) );	
*/  

		   
/* 
	 double a = 7.5;
	 short b;
	
	 b = (short)a; //因為有轉換型別，所以不會發生錯誤

	 System.out.println("b 的值是 " + (b) );
*/




	    
/*
	 int x=10, y=5; float z=5.5f;
	 x=(int)z+4;
	 System.out.println(x);   //9
*/




	    


  }

}