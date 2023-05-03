package ch03;

public class ContinueEx01 {
	public static void main(String[] args) {
		// continue문
		// 반복문(for, while, do-while) 돌아가서 실행해라
		// 증감식, 조건식으로 바로 간다.
		// 반복을 종료하지 않고 계속 실행한다는 점이 break문과 다르다.
		
		int a;
		for(a=1;a<=10;a++) {
			if(a==3) {
				continue;	//다시 반복문으로 돌아가라
							//밑의 코드 실행하지않음.
			}
			System.out.println(a);
		}
		
	}
}
