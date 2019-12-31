package classes.extend;

import java.util.Calendar;

public class CalendarExe {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2019, 0, 1);
		System.out.println("년도: " + cal.get(Calendar.YEAR));
		System.out.println("월: " + cal.get(Calendar.MONTH));
		System.out.println("월: " + cal.get(Calendar.DAY_OF_MONTH));
		// 월은 1월 => 0, 1월 => 1, 12월 => 11
		System.out.println("마지막 일: " + cal.getActualMaximum(Calendar.DAY_OF_MONTH));// 해당월의 마지막 날짜를 부른다.
		System.out.println("오늘의 요일: " + cal.get(Calendar.DAY_OF_WEEK));
		cal.set(2019, 0, 1);
		createCal(2020, 2);
	}

	public static void createCal(int year, int month) {
		// 원하는 년도의 월을 입력하면 달력이 나오게 매소드를 설정하시오.
	}
}
