package day06;

public class CircleTest {
	public static void main(String[] args) {
		Circle circle=new Circle();
		circle.name="써클";
		circle.radius=10;
		circle.getArea();
		System.out.println(circle.name+"의 넓이는 "+circle.getArea()+"입니다.");
		
		
		Circle pizza = new Circle();
		pizza.name="도미노피자";
		pizza.radius = 25;
		System.out.println(pizza.name+"의 넓이는 "+pizza.getArea()+"입니다.");
		
		Circle dunkin = new Circle();
		dunkin.name="던킨도넛";
		dunkin.radius=5;
		System.out.println(dunkin.name+"의 넓이는 "+dunkin.getArea()+"입니다.");
		
		Circle ball = new Circle("축구공",30);
		System.out.println(ball.name+"의 넓이는 "+ball.getArea()+"입니다.");
		
		Circle ball2 = new Circle(30);
		ball2.name="공2";
		System.out.println(ball2.name+"의 넓이는 "+ball2.getArea()+"입니다.");		
		
	}
}
