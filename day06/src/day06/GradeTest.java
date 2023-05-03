package day06;

public class GradeTest {
	public static void main(String[] args) {
		Grade myGrade=new Grade(12,88,99);
		double avg1 = myGrade.average(2); //double 출력
		double avg2 = myGrade.average();
		System.out.println("나의 평균은 "+avg1+"입니다.");

		System.out.println(Math.round(avg2*100)/100.0);
		System.out.println();
	}
}
