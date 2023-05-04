package quiz;

class Circle{
	private int x,y,radius;

	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius= radius;
	}
	
	public boolean equals(Object obj) {
		Circle c= (Circle)obj;
		if(this.x==c.x && this.y == c.y) {
			return true;			
		}
		return false;
	}
	
	public void isEquals(Circle c) {
		if(this.equals(c))
			System.out.println("좌표가 같습니다.");
		else
			System.out.println("좌표가 다릅니다.");
	}
}

public class CircleQuiz {
	public static void main(String[] args) {
		Circle circle01 = new Circle(10,10,100);
		Circle circle02 = new Circle(10,10,50);
		
		circle01.isEquals(circle02);
		
//		if(circle01.equals(circle02)) {
//			System.out.println("좌표가 같습니다");
//		} else {
//			System.out.println("좌표가 다릅니다.");
//		}
		
	}
}
