package day06;

public class BookTest {
	public static void main(String[] args) {
		Book littlePrince = new Book("어린왕자", "썡땍쥐베리");
//		System.out.println(littlePrince.author);
//		System.out.println(littlePrince.title);

		littlePrince.showInfo();

		Book java = new Book("java 코딩");
//		System.out.println(java.author);
//		System.out.println(java.title);

		java.showInfo();

		Book untitle = new Book();
		untitle.showInfo();

		/*
		 * 기본타입이 아닌 변수들은 참조를 한다. 복사하지않는다.
		 * 객체는 값을 "참조"함.
		 */
		Book myBook = littlePrince;
		littlePrince.author = "san theckjjiberry";
		myBook.author = "장성호";	//내용바꾸면 little이랑 myBook 다 바뀜
		System.out.println(myBook.author);
		System.out.println(littlePrince.author);

		int arr01[] = { 1, 2, 3 };
		int arr02[] = arr01;
		
		arr02[1]=200;
		System.out.println(arr01[1]);
	}
}
