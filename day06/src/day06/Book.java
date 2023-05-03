package day06;

public class Book {
	// 제목,작자
	public String title;
	public String author;

	//생성자1
	public Book() {		//생성자 함수 - 클래스랑 이름이같다, 리턴타입이 붙지않는다, 빈 생성자라도 무조건 있어야함
						//생성자가 없으면 컴파일러가 빈생성자 만들어줌, 생성자가 하나라도있으면 생성자 따로 안만듦 	
		this("untilted","nonamed");	//생성자3 호출해서 씀.	
	}
	//생성자2
	public Book(String title) {
		this.title = title;		//나 자신을 가리키는 함수 this
		author = "작자미상";
	}
	//생성자3
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public void showInfo() {
		System.out.println("제목 : "+ this.title+" , 작가 : "+ this.author);
	}
	
}
