package day05;

import java.util.Iterator;

public class For01 {
	public static void main(String[] args) {
		//문(statement 제어문, 반복문)
		//식(계산)
		
		//1+2+3+ ... + 9+10=55
		int sum=0;
		
		for(int i=1;i<=10;i++) {
			sum+=i;
			System.out.print(i);
			if(i==10) {
				System.out.print("=");
				System.out.print(sum);
			}else {
				System.out.print("+");
			}
		}
		
		
	}
}
