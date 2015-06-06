//宣告介面
interface Display2 {
	//宣告變數(常數) , 修飾子如同 public static final 
	int num1 = 100;   
	int num2 = 10;
	//宣告方法(抽象方法) , 修飾子如同 public abstract
	void disp2();
}

/*
  1. 使用內部匿名類別(Inner anonymous class)可減少程式碼,
     因為可以不必再另外宣告一個類別
  2. Inner class 的觀念將於part2時再做介紹  
*/
class TestInterface2 {
	public static void main(String args[]) {
		Display2 p2 = new Display2(){
			public void disp2() {
		  System.out.print(num1 + " + " + num2 + " = ");
		  System.out.println(num1 + num2);
	    }
		};
		p2.disp2();
	}
}
