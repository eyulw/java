package ch03;

public class ForEx11 {	//break문 사용.
	public static void main(String[] args) {
		for(int a=1; a<=100; a++) {
			if(a%5==0) {
				break;	//a==5일때 for문 종료.
			}
			System.out.println(a);
		}
		System.out.println("hello");
	}
}
