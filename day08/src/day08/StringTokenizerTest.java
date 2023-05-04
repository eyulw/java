package day08;

import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args) {
		String str = "아이언맨/토르/헐크/스파이더맨/앤트맨/캡틴아메리카";
		StringTokenizer st=new StringTokenizer(str,"/");
		System.out.println(st.countTokens());
//		for(int i=0; i<st.countTokens();i++) {
//			System.out.println(st.nextToken());
//		}
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
	}
}
