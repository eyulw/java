package ch03;

public class ForEx10 {
	public static void main(String[] args) {
		//반복문 속 조건문 <-> 조건문 속 반복문
		for(int a=1; a<=10;a++) {
			//for문의 조건식이 true일때 실행.
			if(a%2 == 0) {
				//if문의 조건식이 true일때 실행.
				System.out.println(a+" : 짝수");
			}else {
				//if문의 조건식이 false일때 실행.
				System.out.println(a+" : 홀수");
			} //if문 종료
		}// for문 종료
		
		
		int num = 3;
		if(num%2 != 0){
			for(int i=0; i<num; i++){
				System.out.print("홀수 ");
			}
		} else {
			for(int i=0; i<num; i++){
				System.out.print("짝수 ");
			}
		}
		
		
		
	}
}
