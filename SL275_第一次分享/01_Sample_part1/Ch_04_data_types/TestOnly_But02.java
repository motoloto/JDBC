public class TestOnly_But02{
	
	public static void main(String args[])	{
		
	     char ch1 = 'A';           
	     char ch2 = 65; 
	     char ch3 = '\u0041';  
	     System.out.println(ch1);       //A
	     System.out.println(ch2);       //A
	     System.out.println(ch3);       //A
	     
	     int i = 65+1;               
	     int j = 'A'+1;              
	     int k = '\u0041'+1;
	     System.out.println(i);         //66
	     System.out.println(j);         //66
	     System.out.println(k);         //66
	     
	     char l = 65+1;               
	     char m = 'A'+1;              
	     char n = '\u0041'+1;
	     System.out.println(l);          //B
	     System.out.println(m);          //B
	     System.out.println(n);          //B
	     System.out.println(65+1);       //66
	     System.out.println('A'+1);      //66
	     System.out.println('\u0041'+1); //66
	     
	     System.out.println('\u3105');           //£t
	     System.out.println('\u3106');           //£u
	     System.out.println((char)('\u3105'+1)); //£u
	     
	     
	     
	}

}