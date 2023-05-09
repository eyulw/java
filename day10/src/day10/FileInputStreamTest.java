package day10;

import java.io.FileInputStream;

public class FileInputStreamTest {
	public static void main(String[] args) {
		//FileInputStream을 이용하여 test.out파일을 읽어 byte[] 배열속에 저장하고 화면에 출력하기.
		byte byteArray[] = new byte[6];
		try {
			FileInputStream fileInputStream = new FileInputStream("C:\\temp\\test.out");
			int num =0;
			int c;
			while((c=fileInputStream.read())!=-1) {
				byteArray[num] = (byte)c;
				num++;
			}
			for(int i=0; i<byteArray.length;i++) {
				System.out.print(byteArray[i]+" ");
			}
			fileInputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
