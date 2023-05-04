package day08;

//equals override => 면적이같으면 같다고 나오도록.
class Rect{
	private int width, height;

	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public boolean equals(Object obj) {
		Rect r=(Rect)obj;
		if(this.width*this.height == r.width*r.height) {
			return true;
		}
		return false;
	}
}

public class RectTest {
	public static void main(String[] args) {
		Rect rect01=new Rect(10,10);
		Rect rect02=new Rect(50,2);
		System.out.println(rect01.equals(rect02));
	}
}
