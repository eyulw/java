package ch03;

public class DoWhileEx01 {
	public static void main(String[] args) {
		//while문
		int a =0;
		while(a<3) {
			a++;
			System.out.println("hello");
		}
		
		System.out.println("----------------");
		
		// do-while문 : while문을 뒤집은거
		// 무조건 한번은 실행 -> 조건이 false여도 한번은 실행.
		
		int b=0;
		do {
			System.out.println("hihihi");
			b++;
		}while(b<3);
		
	}
}
