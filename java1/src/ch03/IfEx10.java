package ch03;

public class IfEx10 {
	public static void main(String[] args) {
		int score = 97;
//		String result; 선언만 하면 안됨.
		String result="";
		
		if(score>=90) {
			if(score>=95) {
				result="A+";
			}else {
				result="A";
			}
		}
		
		System.out.println(result);
		/* 
		 * result 오류나는 이유
		 * if문이 false일때의 값이 없기때문에 result의 초기화가 필요하다.
		 * String에서는 ""공백도 문자다.
		 */
	}
}
