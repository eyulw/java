package ch03;

public class IfEx09 {
	public static void main(String[] args) {
		//지역변수 : 선언된 블럭(영역, 지역) 안에서만 사용 가능
		//			블럭이 닫히면 자동으로 삭제된다.
		int a = 100;
		if(a > 0) {
			int x=1000;
			
			System.out.println(a);
			System.out.println(x);
		} //if문 종료 -> int x는 자동 삭제
		
		System.out.println(a);
//		System.out.println(x); //if문 밖에서는 사용 못함.
	
	} //main 종료
} 
