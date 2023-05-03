package ch02;

public class Ex01 {	//연산자
	public static void main(String[] args) {
		// 증감연산자 ( ++ , -- )
		// 1증가, 1감소 (boolean타입 사용 불가)
//		int a = 10;
//		System.out.println(a);	//10
//		++a;	//하나의 실행문: 혼자있을때 증가한다.
//		System.out.println(a);	//11
//		a++;
//		System.out.println(a);	//12
		
		int a=10;
		//할일 두가지 : 연산, 출력
		//증감연산자가 변수 뒤에 있을때 연산이 제일 마지막에 일어남.
		System.out.println(++a);	//연산	출력 11 11 ->선증가
		System.out.println(a);		//	 	출력 11
		System.out.println(a++);	//출력 	연산 11 12 ->후증가
		System.out.println(a);		//	 	출력 12
		
	}
}
