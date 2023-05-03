package ch03;

public class IfEx08 {
	public static void main(String[] args) {
		// 중첩 if문
		int score = 85;
		String grade;
		
		if(score > 90) {	//{} 블럭 안에서는 모든 문법 사용이 가능하다.
			
			if(score>=95) {
				grade="A+";
			}else {
				grade="A";
			}
		}else {
			if(score >=85) {
				grade ="B+";
			}else {
				grade="B";
			}
		}
		
		System.out.println("학점 : " + grade);
	}
}
