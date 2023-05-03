package ch02;

public class Ex05 {
	public static void main(String[] args) {
		// 비교연산자
		// ( == , > , < , >= , <= , ! )
		// 비교연산자의 결과는 논리형으로 나온다.
		
		System.out.println(10>0);	//true
		System.out.println(10==0);	//false
		System.out.println(10==0+10);	//true
		System.out.println(10!=0);	//true
		
		//변수 활용
		int a = 10, b = 0;
		System.out.println(a>=b);	//true
		System.out.println(a==b+10);	//true
		System.out.println(a!=b);	//true
		
		
	}
}
