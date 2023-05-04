package quiz;

import java.util.Scanner;

//Player(내가 골라서 내기) vs Computer(랜덤)

class Player {
	private String name;
	private Scanner scanner = new Scanner(System.in);

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int turn() {
		System.out.print(name + " [가위(1), 바위(2), 보(3), 끝내기(4)] >>");
		return scanner.nextInt();
	}
}

class Computer extends Player {

	public Computer(String name) {
		super(name);
	}

	public int turn() {
		return (int) (Math.random() * 3 + 1);	//Math.random()은 0~1사이의 실수 -> 3 곱하면 (0~2.xxx)범위이므로
	}											//1을 더해주고 (int)로 타입변환

}

public class RockPaperScissors {
	public static void main(String[] args) {
		Player me = new Player("나");
		Computer com = new Computer("슈퍼컴퓨터");
		String rockPaperScissors[] = { "가위", "바위", "보" };

		while (true) {							//계속 반복
			int playerChoice = me.turn();		//scanner로 입력받고 변수에 대입
			if(playerChoice==4) {				//숫자 4를 입력받으면 종료 -> 반복문 break;
				System.out.println("종료");
				break;
			}
			if(playerChoice<1 || playerChoice>4) {	//숫자 1~4를 제외한 나머지 숫자 입력시 처음으로 돌아가서(continue 사용) 다시 입력하도록 하기
				System.out.println("다시 입력하세요");
				continue;
			}
			System.out.println(me.getName() + " : " + rockPaperScissors[playerChoice - 1]);	//배열 인덱스가 0부터 시작이므로 -1해주기
			int computerChoice = com.turn();
			System.out.println(com.getName() + " :" + rockPaperScissors[computerChoice - 1]);
			if (playerChoice == computerChoice) {
				System.out.println("비겼음");
			} else if (playerChoice == 1 && computerChoice == 3) {
				System.out.println(me.getName() + " 이김");
			} else if (playerChoice == 2 && computerChoice == 1) {
				System.out.println(me.getName() + " 이김");
			} else if (playerChoice == 3 && computerChoice == 2) {
				System.out.println(me.getName() + " 이김");
			} else {
				System.out.println(me.getName() + " 졌음");
			}	
		}

	}
}
