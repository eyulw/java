package day08;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
		//Calendar은 추상클래스이므로 객체생성불가
		
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		int day = now.get(Calendar.DAY_OF_WEEK);	//요일
		int date = now.get(Calendar.DAY_OF_MONTH);	//날짜
		
		int hourOfDay = now.get(Calendar.HOUR_OF_DAY);
		int hour=now.get(Calendar.HOUR);
		int ampm=now.get(Calendar.AM_PM);
		int min=now.get(Calendar.MINUTE);
		int sec=now.get(Calendar.SECOND);
		
		System.out.println(hourOfDay+"시");
		System.out.println(ampm==0?"오전":"오후"+hour+"시"+min+"분"+sec+"초");
	
		System.out.println(day);	//일1 월2 화3 수4 목5 금6 토7
		System.out.println(date);

		String monthArray[]= {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Oct","Nov","Dec"};
		String dayArray[]= {"Sun","Mon","Tue","Wed","Tur","Fri","Sat"};
		System.out.println(year+"/"+monthArray[month]+"/"+date+"/"+dayArray[day-1]);
		
		System.out.println(now.getTime());
		SimpleDateFormat dateFormat=new SimpleDateFormat("YYYY/MM/dd - HH:mm:ss");
		System.out.println(dateFormat.format(now.getTime()));

	}
}
