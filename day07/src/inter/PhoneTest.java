package inter;

public class PhoneTest {
	public static void main(String[] args) {
		Gallaxy gallaxy22 = new Gallaxy();
		gallaxy22.sendCall();
		gallaxy22.receiveCall();
		gallaxy22.samsungPay();
		gallaxy22.sendSMS();
		gallaxy22.receiveSMS();
		gallaxy22.play();
		gallaxy22.stop();
		
		Iphone iphone10=new Iphone();
		iphone10.sendCall();
		iphone10.receiveCall();
		iphone10.printLogo();
		
		PhoneInterface myPhone = new Gallaxy();
		myPhone.receiveCall();
//		myPhone.samsungPay(); //불가능 -> 업캐스팅
	}
}
