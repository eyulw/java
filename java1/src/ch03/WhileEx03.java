package ch03;

public class WhileEx03 {
	public static void main(String[] args) {
		// 구구단
//		int dan , num;
//		for(dan=2;dan<10;dan++) {
//			for(num=1;num<10;num++) {
//				System.out.println(dan+" x "+num+" = "+(dan*num));
//			}
//		}
		
		int dan=2;
		while(dan<10) {
			int num=1;	//초기식의 위치는 반드시 조건식의 위에 위치해야한다.
			while(num<10) {
				System.out.println(dan+" x "+num+" = "+(dan*num));
				num++;
			}
			dan++;
		}

		
		
		System.out.println("----주의----");
		int a=2;
		int b=1;	//b가 여기 있으면 첫번째 반복에서 b가 10인 상태로 반복문을 빠져나오게되는데
					//다시 1로 초기화가 되지않아 반복문의 조건이 false가 되어 반복을 실행하지 않는다.
		while(a<10) {
			while(b<10) {
				System.out.println(a+" x "+b+" = "+(a*b));
				b++;
			}
			a++;
		}
		
	}
}
