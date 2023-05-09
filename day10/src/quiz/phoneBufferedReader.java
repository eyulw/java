package quiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class phoneBufferedReader {
	public static void main(String[] args) {
		File phone =new File("C:\\temp\\phone.txt");
		try {
			FileReader fileReader =new FileReader(phone);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			while(true) {
				String line = bufferedReader.readLine();
				if(line == null) break;
				System.out.print(line+"\r\n");
			}
			bufferedReader.close();
			fileReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
