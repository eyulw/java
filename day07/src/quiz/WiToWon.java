package quiz;

public class WiToWon extends Converter{
	
	public WiToWon(double ratio){
		this.ratio=ratio;
	}
	
	@Override
	public double convert(double src) {
		// TODO Auto-generated method stub
		return Math.round(src*ratio*100)/100.0;
	}

	@Override
	public String srcString() {
		// TODO Auto-generated method stub
		return "위안";
	}

	@Override
	public String destString() {
		// TODO Auto-generated method stub
		return "원";
	}
	
}
