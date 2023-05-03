package ch03;

public class SwitchEx06 {
	public static void main(String[] args) {
		int score = 96;
		switch(score/10) {
			case 10: case 9:	//가로로 써도 가능하다.
				System.out.println("A");
			case 8: case 7:
				System.out.println("B");
			break;
			default:
				System.out.println("F");
		}
	}
}
