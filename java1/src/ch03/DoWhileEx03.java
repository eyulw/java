package ch03;

import java.util.Scanner;

public class DoWhileEx03 {
	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);	//객체생성
		String inputString; 	//문자를 입력할 변수
		
		do {
			System.out.println(">");
			inputString=scanner.nextLine();		//키보드로부터 입력받음.
			System.out.println(inputString);
		}while(!inputString.equals("q"));
		System.out.println();
		System.out.println("프로그램 종료");
	}
}
