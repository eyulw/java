package ch03;

public class IfTest01 {
	public static void main(String[] args) {
		
		int kor=93;
		int eng=90;
		int math=100;
		int total=kor+eng+math;
		double avg=total/3;
		String grade;
		
		if(kor>100||eng>100||math>100) {
			System.out.println("잘못 입력하셨습니다.");
		}else {
			if( avg >= 90) {
				grade="A";
			} else if( avg >= 80) {
				grade="B";
			} else if( avg >= 70) {
				grade="C";
			} else if( avg >= 60) {
				grade="D";
			} else {
				grade="F";
			}
			System.out.println("국어 점수는 "+kor+"점입니다.");
			System.out.println("영어 점수는 "+eng+"점입니다.");
			System.out.println("수학 점수는 "+math+"점입니다.");
			
			System.out.println("총점은 "+total+" 입니다.");
			System.out.println("평균은 "+avg+" 입니다.");
			System.out.println("학점은 "+grade+"입니다.");	
		}
		
		
		
	}
}
