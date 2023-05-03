package quiz;

public class ColorTV extends TV{
	private int color;
	
	public ColorTV(int size,int color) {
		super(size);
		this.color= color;
	}
	
	public void showInfo() {
		System.out.println(this.getSize()+"인치 "+this.color+"컬러");
	}
}
