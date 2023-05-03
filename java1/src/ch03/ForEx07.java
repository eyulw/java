package ch03;

public class ForEx07 {
	public static void main(String[] args) {
		// for문 속 for문
		int a;
		int b;
		for(a=1; a<=5; a++) {
			for(b=1; b<=5; b++) {
				System.out.println(a+" | "+b);
			}
		}
		

	}
}
