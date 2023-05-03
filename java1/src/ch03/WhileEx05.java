package ch03;

public class WhileEx05 {
	public static void main(String[] args) {
		//100까지 출력
		int i=1;
		while(i<=100) {
			System.out.print(i+" ");
			i++;
		}
		
		System.out.println();
		
		//1~100까지 홀수 출력
		i=1;
		while(i<=100) {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
			i++;
		}
		
//		int i=1;
//		while(i<=100) {
//			System.out.print(i+" ");
//			i+=2;
//		}
		
		System.out.println();
		
		//1~100까지 짝수 출력
		i=1;
		while(i<=100) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
			i++;
		}
		
//		int i=2;
//		while(i<=100) {
//			System.out.print(i+" ");
//			i+=2;
//		}
		
	}
}
