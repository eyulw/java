package ch01;

public class Ex11 {
	public static void main(String[] args) {
		int a =130;
		byte b= (byte)a;	//오버플로우
		System.out.println(b);	//표현할 수 있는 범위를 넘어서 나타나는 현상.
		
		// 형변환 '기준'이 있어서 오류가 난다.
		float f = 5.7f;	//(float)5.7 , 5.7f ,5.7F
		
		long c = 100000*100000L;	//(long), l (숫자 1과 헷갈릴수 있어서 대문자 사용) , L
		System.out.println(c);
	}
}


