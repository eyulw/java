package ch03;

public class IfEx01 {
	public static void main(String[] args) {
		// if문
		// 조건식의 결과가 true일 때 실행부분 실행된다.
		// false일때는 필수가 아니다.
		
		int a = 6;
		if(a>0) {	//조건식의 결과가 true
			System.out.println("크다");
			System.out.println("크다");
			System.out.println("크다");
		}
		
		if(a>0) {
			a+=4;
		}
		System.out.println(a);
		
		if(a<0) {
			a+=4;
			System.out.println(a);
		}
		System.out.println(a);
		
		
		
	}
}
