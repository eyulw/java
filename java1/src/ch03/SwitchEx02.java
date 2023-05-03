package ch03;

public class SwitchEx02 {
	public static void main(String[] args) {
		int time = 8;
		switch(time) {		//해당 case부터 밑에있는 모든 실행문 실행한다.
			case 8 :
				System.out.println("출근합니다.");
			case 9 : 
				System.out.println("회의를 합니다.");
			case 10 : 
				System.out.println("업무를 봅니다.");
			default:		//default는 정해진 위치 없음. 보통은 맨 아래에 사용
				System.out.println("외근을 나갑니다.");
		}
	}
}
