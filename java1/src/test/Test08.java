package test;

public class Test08 {
	public static void main(String[] args) {
		
		for(int i=0;i<5;i++) {
			for(int j=1;j<5-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<2*i+1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
