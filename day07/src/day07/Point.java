package day07;

public class Point {
	// x, y를 가짐
	
	//속성
	private int x;
	private int y;

	// 메서드를 통해서 내부의 속성을 바꾸는게 좋다.
	// getter(값을 얻어갈수만 있다 : 읽기전용)
	// setter
	
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}
}
