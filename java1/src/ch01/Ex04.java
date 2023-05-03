package ch01;

public class Ex04 {
	public static void main(String[] args) {
		// 논리형	boolean
		// 결과값이 t/f로 나온다
		
		boolean a;	// class가 다르기 때문에 같은 이름의 변수 사용 가능
		a = true;
		System.out.println(a);
		
		boolean b = false;
		System.out.println(b);
		
		b=true;
		System.out.println(b);
		
		System.out.println("최종 b = "+b);
		
		int x =10;
		int y =5;
		boolean z=x>y;
		System.out.println(z);
		
		z = (x!=y);	// !는 프로그래밍 언어에서 반대의 의미를 가진다.
		System.out.println("z의 결과는 : "+z);
		
	}
}
