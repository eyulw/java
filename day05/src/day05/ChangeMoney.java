package day05;

import java.util.Scanner;

public class ChangeMoney {
	public static void main(String[] args) {
		// 50000원, 10000원, 1000원, 500원, 100원, 50원,10원
		// 출력 :
		// 오만원 30장 
		// 만원 4장 
		// 오천원 1장 
		// 천원 4장 
		// 오백원 1장 
		// 백원 4장 
		// 오십원 1장  
		// 십원 3장 

		System.out.print("금액을 입력하세요 : ");
		Scanner scanner =new Scanner(System.in);
		int money = scanner.nextInt();
		
		System.out.println();
		
		System.out.println("오만원=="+money/50000+"장");
		money%=50000;
		
		System.out.println("만원=="+money/10000+"장");
		money%=10000;
		
		System.out.println("오천원=="+money/5000+"장");
		money%=5000;
		
		System.out.println("천원=="+money/1000+"장");
		money%=1000;
		
		System.out.println("오백원=="+money/500+"개");
		money%=500;
		
		System.out.println("백원=="+money/100+"개");
		money%=100;
		
		System.out.println("십원=="+money/10+"개");
		
		scanner.close();
	}
}
