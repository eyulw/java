package ch03;

public class ForEx02 {
	public static void main(String[] args) {
		// for( 초기식; 조건식; 증감식){ 실행코드 }
		// 실행순서 : 초기식 -> 조건식 -> 실행코드 -> 증감식 -> 조건식 -> 실행코드 ->증감식 .....
		// 초기식 : 처음 단 한번만 실행
		// 조건식 : 조건식의 결과가 true일때 실행문 실행 , 몇번 반복하는지 알수있다.
		// 증감식 : 증감함. 대입연산자가 사용된다.
		// 조건식이 false일때 for문 종료.
		
		for(int a=1; a<=3; a++) {
			System.out.println(a);
		}	//for문 종료
		
		System.out.println("-----------------");
		
		// 0부터 5까지 출력하는 코드
		for(int b=0; b<=5; b++) {
			System.out.println(b);
		}
		
		System.out.println("-----------------");
		
		//1부터 100까지 출력하는 코드
		for(int i =0; i<100;i++) {
			System.out.println(i+1);
		}
		
		int c;
		for(c=1; c<=100; c++) {
			System.out.println(c);
		}
		
	}
}
