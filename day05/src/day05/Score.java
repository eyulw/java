package day05;

public class Score {
	public static void main(String[] args) {
		double scoreList[][]= {{4.49,4.38},{2.34,3.5},{3.87,2.88},{4.1,3.9}};
		//4년 학점 평균 구하기
		
		double scoreSum=0.0;
		int cnt=0;
		
		
		for(double[] scores:scoreList) {
			for(double s:scores) {
				scoreSum+=s;
				cnt++;
			}
		}
		
		double avg=scoreSum/cnt;
		
		System.out.println("4년 학점 평균은 "+avg);
		
		System.out.println("---------------------");
		
		double sum=0;
		for(int year=0;year<scoreList.length;year++) {
			for(int term=0; term<scoreList[year].length;term++) {
				sum+=scoreList[year][term];
			}
		}
		System.out.println(sum/(scoreList.length*scoreList[0].length));
		
	}
}
