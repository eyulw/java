package quiz;

//import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileReader;

public class PhoneReader {
	public static void main(String[] args) {
		File phone =new File("C:\\temp\\phone.txt");
		try {
			FileReader fileReader =new FileReader(phone);
//			BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(System.out,1024);
			int c;
			while((c=fileReader.read())!=-1) {
//				bufferedOutputStream.write((char)c);
				System.out.print((char)c);
			}
			
			/*
			while(true) {
				c=fileReader.read();
				if(c==-1) break;
				System.out.print((char)c);
			}
			*/
//			bufferedOutputStream.flush();
//			bufferedOutputStream.close();
			fileReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
