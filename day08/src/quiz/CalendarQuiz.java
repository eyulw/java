package quiz;
//현재 시간을 출력하는데 --> 15시 15분
//6~11시 까지는 goodmorning
//12~17시 : goodafternoon
//18시~21 :goodevening
//22~ : good night

import java.util.Calendar;

public class CalendarQuiz {
	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();
		int hour=cal.get(Calendar.HOUR_OF_DAY);
		int min=cal.get(Calendar.MINUTE);
		System.out.println("현재시간 : "+hour + "시"+min+"분");
		
		if(hour>=6 && hour<=11) {
			System.out.println("Good Morning");
		} else if(hour>=12 && hour<=17) {
			System.out.println("Good Afternoon");
		} else if(hour>=18 && hour<=21) {
			System.out.println("Good Evening");
		} else {
			System.out.println("Good Night");
		}
	}
}
