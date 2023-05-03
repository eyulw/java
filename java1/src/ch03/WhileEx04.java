package ch03;

public class WhileEx04 {
	public static void main(String[] args) {
		int sum=0;
		int i=1;		//초기식
		while(i<=5) {	//조건식
			sum+=i;
			i++;		//증감식
		}
		System.out.println("1~5까지의 합 : "+sum);
		
		System.out.println("----------------");
		
		//1~100까지의 합
		
		int sum1=0;
		int j=1;
		while(j<=100) {
			sum1+=j;
			j++;
		}
		System.out.println("1~100까지의 합 : "+sum1);
		
	}
}
