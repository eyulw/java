package test;

public class Test09 {
	public static void main(String[] args) {
		for(int i=5; i>0; i--) {
			for(int j=0;j<5-i;j++) {
				System.out.print(" ");
			}
			for(int k=0; k<2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int a=5; a>0; a--) {		//줄반복
			for(int b=5-a; b>0; b--) {	//공백 없음으로 시작
				System.out.print(" ");
			}
			for(int c=a*2-1;c>0;c--) {	//a=5로 시작, *이 9개로 시작
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
