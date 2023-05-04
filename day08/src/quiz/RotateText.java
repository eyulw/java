package quiz;

import java.util.Scanner;

public class RotateText {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(">>");
		String st = scanner.nextLine();
		
		for(int i=0; i<st.length();i++) {
			st=st.substring(1).concat(st.substring(0,1));
			System.out.println(st);
		}
		
		System.out.println("---------------------");
		
		String str ="오늘 지나면 3일 연휴다 ";
		int total=str.length();
		for(int i=0; i<total;i++) {
			String first=str.substring(0,1);
			String rest=str.substring(1);
			str=rest+first;
			System.out.println(str);
		}
		
	}
}
