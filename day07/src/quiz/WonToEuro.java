package quiz;

public class WonToEuro extends Converter{
	
	public WonToEuro(double ratio) {
		this.ratio=ratio;
	}
	
	@Override
	public double convert(double src) {
		return Math.round(src/ratio*100)/100.0;
	}

	@Override
	public String srcString() {
		// TODO Auto-generated method stub
		return "원";
	}

	@Override
	public String destString() {
		// TODO Auto-generated method stub
		return "유로";
	}

}
