package ch02;

public class Ex07 {
	public static void main(String[] args) {
		// 논리 연산자 -> if문과 for문에 함께 쓰임.
		// ( && , || , ! )
		// && (and)연산자 : 조건이 모두 true일 때 결과가 true
		// || (or)연산자 : 조건이 하나라도 true이면 결과가 true
		// ! (not)연산자 : 결과를 반대로
		
//		System.out.println(true && true);
//		System.out.println(true && false);
//		System.out.println(true && false && true);
//		System.out.println(false && false);
//		
//		
//		System.out.println(true || true);
//		System.out.println(true || false);
//		System.out.println(true || false || true);
//		System.out.println(false || false);
		
		// 논리연산자는 주로 비교연산자와 함께 사용함.
		int a = 10;
		int b = 5;
		boolean result = (a>0) && (a>100);
		System.out.println(result);
		
		boolean result2 =(a>0) || (a>100);
		System.out.println(result2);
		System.out.println(!result2); // !는 결과를 반대로 보여줄 뿐 변수의 값이 변경되지 않는다.
		
		System.out.println(a>7 && b<=5);
		System.out.println((a%3==2) || ((b%2)!=1));
		
		
	}
}
