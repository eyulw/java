package inter;

public class Gallaxy implements MobilePhoneInterface , Mp3Interface{

	@Override
	public void sendCall() {
		System.out.println("띵띠링띠 띵띠링띠디");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화왔어요...");
	}
	
	public void samsungPay() {
		System.out.println("삼성페이 결제할 수 있음");
	}

	@Override
	public void sendSMS() {
		System.out.println("SMS 보낼 수 있음");
	}

	@Override
	public void receiveSMS() {
		System.out.println("SMS 받을 수 있음");
	}

	@Override
	public void stop() {
		System.out.println("music stop");
	}

	@Override
	public void play() {
		System.out.println("music start");
	}
	
}
