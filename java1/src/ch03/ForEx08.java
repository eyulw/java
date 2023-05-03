package ch03;

public class ForEx08 {
	public static void main(String[] args) {
		// 구구단 출력
//		int dan;
//		int num;
//		for(dan=2; dan<=9; dan++) {		//2~9단
//			System.out.println("[ "+dan+"단"+" ]");
//			for(num=1; num<=9; num++) {		//1~9까지 곱해줌
//				System.out.print(dan+" * "+num+" = "+(dan*num) +" | ");
//													//() : 수학에서 연산 우선순위 가장 높다.
//			}
//			System.out.println();
//		}
		
		for(int dan=2; dan<=9; dan++){
			System.out.println("[ "+dan+"단"+" ]");
			for(int num=1; num<=9; num++){
				System.out.print(dan+" x "+num+" = "+(dan*num)+" | ");
			}
			System.out.println();
		}
		
	}
}
