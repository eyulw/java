package quiz;

import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		int day = now.get(Calendar.DAY_OF_WEEK);
		int date = now.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+"년 "+month+"월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for(int i=0;i<day;i++) {
			System.out.print("\t");
		}
		for(int i=0;i<date;i++) {
			
		}
		
	}
}
