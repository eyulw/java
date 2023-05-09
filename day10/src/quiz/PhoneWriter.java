package quiz;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class PhoneWriter {
	public static void main(String[] args) {
		//전화번호부
		//장성호 010-1111-2222
		//정진영 010-2222-2222
		try {
			File file = new File("C:\\temp\\phone.txt");
			FileWriter fileWriter = new FileWriter(file);
			Scanner scanner = new Scanner(System.in);
			System.out.println("전화번호 입력 프로그램입니다.");
			while(true) {
				System.out.println("이름 전화번호 >>>");
				String line = scanner.nextLine();
				if(line.equals("exit")) break;
				fileWriter.write(line);
				fileWriter.write("\r\n");
			}
			scanner.close();
			fileWriter.close();	//꼭 닫아주기
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}