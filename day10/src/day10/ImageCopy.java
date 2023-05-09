package day10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;

public class ImageCopy {
	public static void main(String[] args) {
		File originalImg = new File("C:\\temp\\jun.jpg");
		File copyImg = new File("C:\\temp\\jun_copy.jpg");
		int c;
		Date date = null;
		try {
			FileInputStream fileInputStream = new FileInputStream(originalImg);
			FileOutputStream fileOutputStream = new FileOutputStream(copyImg);
			byte buffer[] =new byte[1024];
			date = new Date();
			long start = date.getTime();	//while문 시작시간
			
			//byte로 받아오기
//			while((c=fileInputStream.read())!=-1) {		// -1 : eof
//				fileOutputStream.write((byte)c);	//글자는 char 이미지는 byte
//			}
			
			//buffer로 받아오기 -> 빠름
			while(true) {
				int num = fileInputStream.read(buffer);	//num은 buffer크기(1024)
//				System.out.println(num);
				fileOutputStream.write(buffer,0,num);	//buffer크기만큼 읽어오기 1024byte만큼씩
				if(num<buffer.length) break;
			}
			date = new Date();
			long end = date.getTime();	//while문 끝난시간
			System.out.println((end - start));	//while문 걸린 시간
			fileOutputStream.close();
			fileInputStream.close();
			
			System.out.println(originalImg.getPath()+"를 "+copyImg.getPath()+"로 복사하였습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
