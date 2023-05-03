package ch02;

public class Ex09 {
	public static void main(String[] args) {
		// 대입 연산자
		// 변수의 값을 변경한다.
		// ( = , += , -= , *= , /= , %= )
		
		int a = 10;
		System.out.println(a+10);	//단순 + : 변수의 값이 변하지 않는다.
		System.out.println(a);
		
		System.out.println(a+=10); //a = a+10 :20
		System.out.println(a);		//대입연산자와 함께 사용 : 변수의 값이 변한다.
		
		int x = 10;
		int y = ++x;	//증감 먼저 대입 마지막
		System.out.println(x);
		System.out.println(y);
		
	}
}
