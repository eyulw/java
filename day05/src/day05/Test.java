package day05;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		//주어진 배열 2개가 있을때
		//1. 과목명을 키보드로 입력받았을때 해당하는 점수를 출력하는 프로그램을 짜시오.
		//2. 반복문 돌려서 "exit"를 입력받으면 빠져 나가게 하고 아니면 해당하는 점수를 출력하게도 해보세요.
		String course[] = {"Java","C++","HTML5","컴퓨터구조","안드로이드"};
		int score[] = {95,88,76,62,55};
		
		Scanner scanner =new Scanner(System.in);
		
		String subject;
		while(true) {
			System.out.println("과목명을 입력하세요 : ");
			subject=scanner.next();
			if(subject.equals("exit")) {
				break;
			}
			for(int i=0;i<course.length;i++) {
				if(subject.equals(course[i])) {
					System.out.println(course[i]+"의 점수는 "+score[i]);
				}
			}
		}
		scanner.close();
		
	}
}
