package ch03;

public class SwitchEx03 {
	public static void main(String[] args) {
		int a = 10;
		switch(a) {
			case 10:
				System.out.println("10점");
				break;	//break; 를 만나면 switch문을 빠져나간다.
						//case 종료.
						//조건문 반복문 : if, for, while, do-while문에 사용된다.
			case 9:
				System.out.println("9점");
				break;		//case마다 사용해도 된다.
			case 8:
				System.out.println("8점");
				break;
			default:
				System.out.println("0점");
		}
	}
}
