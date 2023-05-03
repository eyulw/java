package ch03;

public class ContinueEx02 {
	public static void main(String[] args) {
		System.out.println("--------짝수만출력--------");
		for(int a=1;a<=10;a++) {
			if(a%2 != 0) {	//a가 홀수일때
				continue;	//홀수 출력 안 함
			}
			System.out.print(a+" ");	//print에서 ln은 줄바뿜
		}
		
		System.out.println("\n--------홀수만출력--------");
			
		for(int a=1;a<=10;a++) {
			if(a%2 == 0) {	//a가 짝수일때
				continue;	//출력 안 함
			}
			System.out.print(a+" ");
		}
		
		
	}
}
