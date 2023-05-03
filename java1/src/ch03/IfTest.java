package ch03;

public class IfTest {
	public static void main(String[] args) {
		//1번
		int score = 93;
		String result;
		if( score >= 90) {
			result="A";
		} else if( score >= 80) {
			result="B";
		} else if( score >= 70) {
			result="C";
		} else if( score >= 60) {
			result="D";
		} else {
			result="F";
		}
		
		System.out.println("점수는 "+score+"점입니다.");
		System.out.println("학점은 "+result+"입니다.");
	}
}
