package ch03;

public class SwitchEx05 {
	public static void main(String[] args) {
		char grade = '0';		//(char)'A' : (int)65 , (char)'a' : (int)97 , (char)'0' : (int)48
		switch(grade) {
			case 'A':	//A이거나 a이거나 0인경우
			case 'a':
			case '0':
				System.out.println("최고 등급입니다.");
				break;	// switch문 빠져나감
			case 'B':	// B이거나 b인 경우(case)
			case 'b':
				System.out.println("중간 등급입니다.");
				break;
			default:	//값이 case에 없을 경우
				System.out.println("최저 등급입니다.");
		}
	}
}
