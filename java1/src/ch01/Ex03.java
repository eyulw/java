package ch01;

public class Ex03 {
	public static void main(String[] args) {
		/*
		<기본 데이터 타입(8가지)>
		정수형
			byte	-128~127
			char	한 글자의 문자
			short	약 -32,000 ~ 32,000
			int(기본)약 -21억 ~ 21억
			long	-2의 63승 ~ 2의 63승-1
		
		실수형
			float		약 소수점 7자리까지 표현
			double(기본)	약 소수점 16자리까지 표현
		논리형
			boolean	true / false
		 */
		
		//정수형
		int a =5;
		System.out.println(a);
		
		//실수형
		double b;
		b=5.5;
		double c =7.7;
		double d = 5;	//적어도 하나의 소수점이 나온다.
		System.out.println(d);
		System.out.println(b);
		System.out.println(c); //출력문도 하나의 값만 사용 가능
//		System.out.println(a,b); //불가능
		System.out.println(a+b);
		
	}
}
