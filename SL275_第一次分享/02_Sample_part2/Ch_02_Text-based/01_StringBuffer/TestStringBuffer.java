class TestStringBuffer {
	public static void main(String args[]) {

		StringBuffer sb = new StringBuffer("Hello Java ");
		sb.append("StringBuffer!");
		System.out.println(sb);



/*	
	  StringBuffer sb =
			new StringBuffer("Hello  StringBuffer!");
		sb.insert(6,"Java");
		System.out.println(sb);
*/		

		
/*		
		StringBuffer sb = 
		  new StringBuffer("Hello Java StringBuffer!");
		sb.delete(6,10);
		System.out.println(sb);
*/		


/*		
		StringBuffer sb =
			new StringBuffer("Hello Java StringBuffer!");
		sb.replace(7,10,"AVA");
		System.out.println(sb);
*/	
	
	  
	  
/*	���ե�:
    -StringBuffer���O�O�b��r��Ҧb�O�����m���ܦr�ꤺ�e 
    -���мg(Override) Object���O�� equals method 
*/ 

/*	  
	  StringBuffer sb1 = new StringBuffer("AB");
		System.out.println("sb1="+sb1);       //AB
		
		StringBuffer sb2 = sb1.append("CD");
		System.out.println("sb1="+sb1);       //ABCD
		System.out.println("sb2="+sb2);       //ABCD
		
		System.out.println(sb1==sb2);         //true
		System.out.println(sb2.equals(sb1));  //true 
*/	
	
	}
}
