package quiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Vector;

public class WordSearch {
	public static void main(String[] args) {
		// 단어를 입력하면 해당하는 단어 찾아주기
		// words.txt 읽어서 vector에 넣어야 한다.
		Scanner scanner = new Scanner(System.in);
		Vector<String> wordList = new Vector<>();
		File file = new File("C:\\temp\\words.txt");
		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			while (true) {
				String line = bufferedReader.readLine();
				if (line == null)
					break;
				wordList.add(line);
			}
			bufferedReader.close();
			fileReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		while (true) {
			System.out.println("단어를 입력하세요. >> ");
			String searchWord = scanner.nextLine();
			if (searchWord.equals("그만")) break;
			for (int i = 0; i < wordList.size(); i++) {
				String word=wordList.get(i);
				if(word.length()<searchWord.length()) continue;	//검색단어보다 짧은 단어는 비교해볼필요도없음.
				String frontWord = word.substring(0,searchWord.length());
				if (searchWord.equals(frontWord)) {
					System.out.println(word);
				}
			}
		}
		scanner.close();
	}
}
