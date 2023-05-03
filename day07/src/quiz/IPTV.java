package quiz;

public class IPTV extends ColorTV{
	private String ip;
	
	public IPTV(String ip,int size, int color) {
		super(size, color);
		this.ip=ip;
	}
	
	public void showInfo() {
		System.out.println("IP 주소는 "+ip);
		super.showInfo();
	}	
}
