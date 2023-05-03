package ch03;

public class ForEx12 {
	public static void main(String[] args) {
		//중첩 반복문에서의 break문
		int a,b;
		for(a=1; a<=5; a++) {
			for(b=1; b<=5;b++) {
				if(b==3) {	//가까운 for문 종료시킴
							//b for문 종료
					break;
				}
				System.out.println(a+"--"+b);
			}
		}
	}
}
