package test;

public class Test02 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {		//j가 i보다 작거나 같을때까지 반복
				System.out.print("*");	//줄바꾸지않고 별찍기
			}
			System.out.println();		//줄바꿈
		}
	}
}
