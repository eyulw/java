package ch02;

public class Ex02 {
	public static void main(String[] args) {
		// 증감연산자 위치와 순서
		// 변수 앞(선증가) 변수 뒤(후증가)
//		int a=10;
//		System.out.println(a++);	//출10 연11
//		System.out.println(++a);	//연12 출12
//		System.out.println(a++);	//출12 연13
//		System.out.println(a++);	//출13 연14
//		System.out.println(++a);	//연15 출15
//							a++;	//연16
//		System.out.println(++a);	//연17 출17
//		System.out.println(a);		//출17
		
		int a=10;
		System.out.println(a--);	//출10 연9
		System.out.println(--a);	//연8 출8
		System.out.println(a--);	//출8 연7
		System.out.println(a--);	//출7 연6
		System.out.println(--a);	//연5 출5
							a--;	//연4
		System.out.println(--a);	//연3 출3
		System.out.println(a);		//출3
		
		
	}
}
