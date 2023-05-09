package day10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	public static void main(String[] args) {
		//파일 전체를 읽어 화면에 출력하는 코드
		//예외처리
		try {	//파일 있는지 없는지 모르니까 예외처리
			//여기 및에 있는 코드 실행
			FileReader fileReader = new FileReader("C:\\Windows\\system.ini");
			try {	//파일 잘못읽어서 오류날수도있으니까 예외처리
				int c;
				while((c=fileReader.read())!=-1) {
					System.out.print((char)c);		//read()는 int타입 return하므로 char로 형변환
				}
				fileReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {		//Exception으로 통틀어서 처리하기도 함
//			e.printStackTrace();
			System.out.println("입출력 오류");
		}
		
//		try {
//			FileReader fileReader = new FileReader("C:\\Windows\\system.ini");
//			int c;
//			while((c=fileReader.read())!=-1) {
//				System.out.println((char)c);
//			}
//			fileReader.close();
//		} catch (Exception e) {
////			e.printStackTrace();
//			System.out.println("입출력오류");
//		}
		
	}
}
