public class TestIfElseIf_2{
	
	public static void main(String argv[]){
		
		int score;
		String finalScore;

		score=59;
		
		if (score >=90 && score<=100)
			finalScore= "��";
		else if (score >=80 && score<90)
			finalScore= "�A";
		else if (score >=70 && score<80)
			finalScore= "��";
		else if (score >=60 && score<70)
			finalScore= "�B";
		else
			finalScore= "��";

		System.out.println("�A�����Z���Ŭ��G "+finalScore);
	}
}