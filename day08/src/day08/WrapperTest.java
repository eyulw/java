package day08;

public class WrapperTest {
	public static void main(String[] args) {
		char ch=Character.toLowerCase('A');
		System.out.println(ch);
		char ch01='a';
		char ch02='4';
		System.out.println(Character.isDigit(ch01));	//isDigit : 숫자인지 따지기
		System.out.println(Character.isDigit(ch02));
		System.out.println(Character.isAlphabetic(ch01));	//isAlphabetic : 문자인지 따지기
		System.out.println(Character.isAlphabetic(ch02));	
		
		int age = Integer.parseInt("20");
		if(age > 20) {
			System.out.println("성인");
		}else {
			System.out.println("미성년자");
		}
		
		int num = 20;
		Integer objNum = num;	//boxing
		int unboxingNum = objNum+10;	//unboxing
		System.out.println(unboxingNum);
		String str=Integer.toString(unboxingNum);
		System.out.println(str.equals("30"));
		
	}
}
