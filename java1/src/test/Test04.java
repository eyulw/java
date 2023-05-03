package test;

public class Test04 {
	public static void main(String[] args) {
		for(int i=0; i<5;i++) {		//세로줄 반복
			for(int j=1;j<=5;j++) {		//가로로 반복
				System.out.print(i+j);	//i+j 가로로 출력
			}
			System.out.println();
		}
	}
}
