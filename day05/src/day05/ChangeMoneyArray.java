package day05;

import java.util.Scanner;

public class ChangeMoneyArray {
	public static void main(String[] args) {
		//배열은 규칙이 없는 것에 규칙을 만들어 줄때 사용한다.
		System.out.print("금액을 입력하세요 : ");
		Scanner scanner =new Scanner(System.in);
		int money = scanner.nextInt();
		
		int units[] = {50000,10000,5000,1000,500,100,50,10};
		for(int i=0; i< units.length;i++) {
			if(units[i]<1000) {
				System.out.println(units[i]+"원=== "+money/units[i]+"개");
			}else {
				System.out.println(units[i]+"원=== "+money/units[i]+"장");	
			}
			money%=units[i];
		}
	}
}
