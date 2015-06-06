public class TestIfElseIf_2{
	
	public static void main(String argv[]){
		
		int score;
		String finalScore;

		score=59;
		
		if (score >=90 && score<=100)
			finalScore= "甲";
		else if (score >=80 && score<90)
			finalScore= "乙";
		else if (score >=70 && score<80)
			finalScore= "丙";
		else if (score >=60 && score<70)
			finalScore= "丁";
		else
			finalScore= "戊";

		System.out.println("你的成績等級為： "+finalScore);
	}
}