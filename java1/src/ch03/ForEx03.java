package ch03;

public class ForEx03 {
	public static void main(String[] args) {
		//1~100까지 홀수만 출력
		for(int i =1; i<=100; i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
		
		//증감식에 대입연산자 사용
		for(int i =1; i<=100; i+=2) {
			System.out.println(i);
		}
		
		//1~100까지 짝수만 출력
		for(int i =2; i<=100; i+=2) {
			System.out.println(i);
		}
	}
}
