package day10;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class FileReaderHangul {
	public static void main(String[] args) {
		//문자 집합과 InputStreamReader를 이용한 텍스트 파일 읽기
		try {
			FileInputStream fileInputStream = new FileInputStream("C:\\temp\\hangul.txt");
			InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream,"utf-8");	//파일, 인코딩방식
			System.out.println("인코딩 방식은 === "+inputStreamReader.getEncoding());
			int c;
			while((c=inputStreamReader.read())!=-1) {
				System.out.print((char)c);
			}
			inputStreamReader.close();	//나중에 열린거를 먼저 닫아주기
			fileInputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
