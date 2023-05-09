package day10;

import java.io.FileWriter;
import java.util.Scanner;

public class FileWriterTest {
	public static void main(String[] args) {
		//Scanner를 이용하여 키보드에서 입력받은 데이터를 "C:\\temp\\my.txt" 파일에 저장하는 프로그램.
		Scanner scanner = new Scanner(System.in);
		try {
			FileWriter fileWriter = new FileWriter("C:\\temp\\my.txt");
			while(true) {
				String line = scanner.nextLine();
				if(line.length()==0) break;	//아무것도 안치고 엔터누르면 종료
				fileWriter.write(line, 0, line.length());
				fileWriter.write("\r\n");	//캐리지리턴 (\r) , 새로운 줄을 쓰겠다 (\n)
			}
			fileWriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		scanner.close();
	}
}
