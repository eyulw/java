package ch03;

public class ForEx05 {
	public static void main(String[] args) {
		// 100까지 홀수의 합
		int sum1=0;
		for(int i=1;i<=100;i+=2) {
			sum1+=i;
		}
		System.out.println("1~100까지 홀수의 합 : "+ sum1);
		
		// 100까지 짝수의 합
		int sum2=0;
		for(int i=2;i<=100;i+=2) {
			sum2+=i;
		}
		System.out.println("1~100까지 짝수의 합 : "+ sum2);
		
		int sum3=0;	//짝수합
		int sum4=0;	//홀수합
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				sum3+=i;
			}else {
				sum4+=i;
			}
		}
		System.out.println("홀수합 : "+ sum4+", "+"짝수합 : "+sum3);
		
	}
}
