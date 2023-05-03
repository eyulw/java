package point;

//inner class
class Point{
	private int x,y;
	
	public Point() {
		this.x=0;
		this.y=0;
	}
	
	//생성자 오버로드
	public Point(int x, int y) {
		this.x =x;
		this.y =y;
	}
	
	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}
}

class ColorPoint extends Point{
	private String color;
	
	public ColorPoint() {
		this.color="black";
	}
	
	public ColorPoint(int x, int y, String color) {
//		super();	//부모클래스의 기본생성자 호출 -> x,y는 0,0으로 초기화
		super(x,y);
		this.color= color;
	}
	
	public void showColorPoint() {
		System.out.print(color);
		this.showPoint();
	}
}

public class SuperTest {
	public static void main(String[] args) {
		ColorPoint colorPoint = new ColorPoint(10,10,"red");
		colorPoint.showColorPoint();
		
		ColorPoint colorPoint2=new ColorPoint();
		colorPoint2.showColorPoint();
	}
}