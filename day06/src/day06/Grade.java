package day06;

public class Grade {
	//kor, eng, math 입력받아서 평균 출력하는 class
	//Grade myGrade=new Grade(60,80,70);
	//myGrade.average(); //double 출력
	//나의 평균은 82.5입니다.
	
	private double kor;
	private double eng;
	private double math;
	
	public Grade() {}
	
	public Grade(double kor,double eng, double math) {
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	
	public double average(int digit) {
		double num=1;
		for(int i=0;i<digit;i++) {
			num*=10;
		}
//		double num = Math.pow(10, digit);	//for문 안돌리고 간단하게 쓰는방법
		double avg=Math.round((kor+eng+math)/3*num)/num;
		return avg;
	}
	
	public double average() {
		double avg=(kor+eng+math)/3;
		return avg;
	}
	
}
