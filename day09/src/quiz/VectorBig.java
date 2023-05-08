package quiz;

import java.util.Scanner;
import java.util.Vector;

public class VectorBig {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Vector<Integer> vec = new Vector<>();
		System.out.println("-1을 입력할때까지 계속 입력됩니다.");
		while(true) {
			int num = scanner.nextInt();
			if(num == -1) break;
			vec.add(num);
		}
		
		int biggest = vec.get(0);
		for(int i =1; i<vec.size();i++) {
			biggest = biggest > vec.get(i) ? biggest : vec.get(i);
		}
		
		System.out.println("제일 큰 숫자는 "+ biggest);
	}
}
