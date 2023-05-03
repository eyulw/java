package ch03;

public class SwitchEx07 {
	public static void main(String[] args) {
//		int score = 0;
//		String grade = "B";
//		switch(grade) {	//()안에 들어가는 타입에 맞춰서 case 써주기
//			case "A":
//				score = 100;
//			case "B":
//				score = 80;
//				break;
//			default:
//				score = 60;
//		}
//		System.out.println("score는 "+score);
		
		int score = 85;
		String grade = "";
		switch(score) {	//()안에 들어가는 타입에 맞춰서 case 써주기
			case 100:
				grade = "A";
				break;
			case 80:
				grade = "B";
				break;
			default:
				grade = "C";
				break;
			case 60:
				grade="D";
				break;
		}
		System.out.println("grade : "+grade);
		
	}
}
