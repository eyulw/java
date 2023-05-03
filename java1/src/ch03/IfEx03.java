package ch03;

public class IfEx03 {
	public static void main(String[] args) {
		// if-else문
		int a = 6;
		if(a<0) {
			//조건이 true
			System.out.println("크다");
		} else { //else는 필수가 아님. 단독사용 불가.
			//조건이 false
			System.out.println("작다");
		}
		
		System.out.println(a);
	}
}
