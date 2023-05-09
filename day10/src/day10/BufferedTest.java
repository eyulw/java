package day10;

import java.io.BufferedOutputStream;
import java.io.FileReader;

public class BufferedTest {
	public static void main(String[] args) {
		/*
		 * 버퍼 스트림
		 * 	> 버퍼를 가진 스트림
		 * 	> 입출력 데이터를 일시적으로 저장하는 버퍼를 이용하여 입출력 효율 개선
		 * 버퍼 입출력 목적
		 *  > 입출력 시 운영체제의 API 호출 횟수를 줄여 입출력 성능 개선
		 *  	-출력시 여러번 출력되는 데이터를 버퍼에 모아두고 한번에 장치로 출력
		 */
		int c;
		int i=1;
		try {
			FileReader fileReader = new FileReader("C:\\temp\\test02.txt");
			BufferedOutputStream bufferedOutputStream =new BufferedOutputStream(System.out,5);	//size 5가 되면 출력
			while((c=fileReader.read())!=-1) {
				System.out.println(i++ +"번째 번호 들어옴");
				bufferedOutputStream.write(c);
				System.out.println(" 출력");
			}
//			bufferedOutputStream.flush();	//남아있는것들도 다 내보내기
			
			fileReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
