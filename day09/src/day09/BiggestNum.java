package day09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class BiggestNum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> numList = new ArrayList<>();
		int biggest=Integer.MIN_VALUE;
		
		while(true) {
			System.out.println("숫자 입력 : ");
			int num=scanner.nextInt();
			if(num == -1) break;
			numList.add(num);
		}
		
		Iterator<Integer> it = numList.iterator();
		while(it.hasNext()) {
			biggest = biggest > it.next()? biggest:it.next();
		}
		System.out.println("제일 큰 숫자는 "+ biggest);
	}
}
