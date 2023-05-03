package day06;

public class LottoTest {
	public static void main(String[] args) {
		/*
		 * main은 이름이 정해져 있는거고 static을 써서
		 * 미리 메모리(heap)에 띄어두기 위해서 쓴다.
		 * 
		 * main을 미리 메모리에 상주시킴.
		 */
		
		Lotto2 lotto = new Lotto2();
		lotto.howMany(2);
		
		Lotto2 lotto02 = new Lotto2(2);
	}
	
	
}
