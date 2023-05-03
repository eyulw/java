package ch03;

public class ForEx09 {
	public static void main(String[] args) {
		// for문 속 for문 2개
		
//		int a;
//		for(a=1;a<=5;a++) {
//			for(int x=1; x<=5; x++) {
//				System.out.println(a +" | "+ x);
//			}	//x의 종료
//			for(int y=1;y<=5;y++) {
//				System.out.println(a+" hello");
//			}	//y의 종료
//		} //a의 종료
//		
//		int b;
//		for(b=1; b<=5; b++) {
//			for(int x=1; x<=5;x++) {	
//				System.out.println(b+"//"+x);
//			}
//			for(int x=1; x<=5;x++) {	//x가 지역변수라 사용 가능
//				System.out.println(b+"--"+x);
//			}
//		}
		
		int c;
		int x;
		for(c=1;c<=5;c++) {
			for(x=1;x<=5;x++) {		//x 사용 영역이 다르기때문에 사용가능
				System.out.println(c+"//"+x);
			}
			for(x=1;x<=5;x++) {
				System.out.println(c+"--"+x);
			}
		}

	}
}
