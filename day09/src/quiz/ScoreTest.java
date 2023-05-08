package quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ScoreTest {
	public static void main(String[] args) {
		//순서가 중요하면 ArrayList, 키값이 중요하면 HashMap
		ArrayList<String> scoreList = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("학점을 7개 입력하면 평균을 내어 드립니다.");
		int i=0;
		double score =0;
		while(true) {
			scoreList.add(scanner.next());
			i++;
			if(i>=7) break;
		}
		
		for(int j=0; j<7;j++) {
			switch(scoreList.get(j).toUpperCase()) {
				case "A" : score+=4.5; break;
				case "B" : score+=3.5; break;
				case "C" : score+=3.0; break;
				case "D" : score+=2.0; break;
				case "F" : score+=0.0; break;
			}
		}
		
		System.out.println(score/scoreList.size());
		
//		HashMap<String,Double> gradeMap= new HashMap<>();
//		gradeMap.put("A",4.5);
//		gradeMap.put("B",3.5);
//		gradeMap.put("C",3.0);
//		gradeMap.put("D",2.0);
//		gradeMap.put("F",0.0);
//
//		Scanner scanner = new Scanner(System.in);
//		double sum=0;
//		for(int i=0; i<7;i++) {
//			String grade=scanner.next();
//			sum+=gradeMap.get(grade);
//		}
//		
//		double avg=Math.round(sum/7*100)/100.0;
//		System.out.println("평점은 "+ avg);
	}
}
