package day06;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Lotto {
	public static void main(String[] args) {
//		int lotto[] = new int[6];		//메모리공간 확보
//		System.out.println("로또번호 : ");
//		// Math - static class - 선언 안 하고써도됨.
//		for (int i = 0; i < lotto.length; i++) {
//			lotto[i] = (int) (Math.random() * 45) + 1; // Math.random : 0~1사이의 실수
//														// 연산 먼저하고 타입변환 //1~46까지 출력해야돼서 1을 더해줌
//			for (int j = 0; j < i; j++) {
//				if (lotto[i] == lotto[j]) {
//					i--;
//					break;
//				}
//			}	//filtering
//		}
		
//		Scanner scanner= new Scanner(System.in);
		
		
		int lotto[][] = new int[5][6];		//메모리공간 확보
		System.out.println("로또번호 : ");
		// Math - static class - 선언 안 하고써도됨.
		for (int i = 0; i < lotto.length; i++) {
			for(int j=0;j<lotto[i].length;j++) {
				lotto[i][j] = (int)(Math.random() * 45) + 1;
				for (int k = 0; k < j; k++) {
					if (lotto[i][j] == lotto[i][k]) {
						j--;
						break;
					}
				}
			}
			Arrays.sort(lotto[i]);
		}
		
		// 문제 : 오름차순, 로또 장 수에 따라 번호 출력하기
//		Arrays.sort(lotto);		//sorting
		
		for (int i = 0; i < lotto.length; i++) {
			for(int j=0; j<lotto[i].length;j++) {
				System.out.print(lotto[i][j] + " ");	
			}
			System.out.println();
		}
	}
}
