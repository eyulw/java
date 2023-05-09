package day10;

import java.io.FileOutputStream;

public class FileOutputStreamTest {
	public static void main(String[] args) {
		//바이너리 값을 파일에 저장하는 바이트 스트림 코드
		//이 파일은 바이너리 파일이 되므로 메모장에서 볼 수 없다. FileInputStreamTest 코드 이용하여 출력하기
		byte byteArray[] = { 127,-128,12,23,45,56};
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("C:\\temp\\test.out");
			for(int i=0;i<byteArray.length;i++) {
				fileOutputStream.write(byteArray[i]);
			}
			fileOutputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
