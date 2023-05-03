package ch02;

public class Ex04 {
	public static void main(String[] args) {
		int a =10;
		int b =10;
//		System.out.println(++a + b); //순서 : 증감 11, 덧셈 21, 출력 21
//		System.out.println(++a + ++b); //11 + 11 출력 22
		
		//후증가이기때문에 가운데 덧셈이 먼저 일어남
//		System.out.println(a++ + b++);	//10 + 10 출력 10 후증가 a 11 b 11
		
//		System.out.println(++a + ++a);	//11 + 12 출력 23
		
		System.out.println(a++ + a++);	//10 + 11 최종 a는 후증가 돼서12
		//하나의 변수에는 연산자 하나만 대기할 수 있다.
		//앞에있는 증가연산이 먼저 실행
	}
}