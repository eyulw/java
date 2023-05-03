package quiz;

public class TVTest {
	public static void main(String[] args) {
//		ColorTV myColorTV = new ColorTV(66, 1024);
//		myColorTV.showInfo();
		IPTV iptv = new IPTV("192.168.0.8",66,3840);
		iptv.showInfo();
	}
}
