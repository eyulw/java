package ch03;

public class SwitchEx01 {
	public static void main(String[] args) {
		// switch문 : 변수의 값을 가지고 case를 찾아간다.
		// 결과값을 주로 int(정수형에서 long빼고) , String 타입을 사용한다.
		//{} 블럭만 영역이다. " : " , " ; " -> 영역 아님
//		int a = 10;
//		switch(a) {
//			case 50:
//				System.out.println("50");
//			case 30:
//				System.out.println("30");
//			case 10:
//				System.out.println("10");
//		}
		
		int num = 3;
		switch(num) {
			case 1:		//case문은 해당 case부터 밑에 있는 모든 실행문들을 실행한다. 
				System.out.println(1);
			case 2:
				System.out.println(2);
			case 3:
				System.out.println(3);
			case 4:
				System.out.println(4);
			default:	//조건에 만족하는 값이 없을때  default로 간다.
				System.out.println(0);
		}
		
	}
}
