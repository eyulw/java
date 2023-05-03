package day06;

public class Circle {
	int radius;
	String name;
	
	//생성자 오버로드
	public Circle() {
//		System.out.println("나는 circle");
	}	//class와 같은 이름. 리턴타입을 쓰지 않음.
	
	public Circle(String name,int radius) {
		this.name=name;
		this.radius=radius;
	}
	
	public Circle(int radius) {
		this.radius=radius;
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
}
