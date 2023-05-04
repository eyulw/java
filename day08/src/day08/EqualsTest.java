package day08;

class Point02 {
	private int x, y;

	public Point02(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public boolean equals(Object obj) { // equals Override
		Point02 point = (Point02) obj; // 어떤 객체가 들어올지 모르니까 Object로 받고 다운캐스팅해주기
		if (this.x == point.x && this.y == point.y) {
			return true; // return을 만나면 함수를 끝냄.
		}
		return false;
	}
}

public class EqualsTest {
	public static void main(String[] args) {
		Point02 pointA = new Point02(10, 10);
		Point02 pointB = new Point02(10, 10);
		Point02 pointC = pointA;
		System.out.println(pointA == pointB);
		System.out.println(pointA == pointC);
		System.out.println(pointA.equals(pointB));
		System.out.println(pointA.equals(pointC));
		 
	}
}
