package classes.extend;

import java.util.Calendar;

public class CalendarExe {
	public static void main(String[] args) {
//		Calendar cal = Calendar.getInstance();

//		cal.set(2019, 0, 1);
//
//		System.out.println("년도: " + cal.get(Calendar.YEAR));
//		System.out.println("월: " + cal.get(Calendar.MONTH));
//		System.out.println("일: " + cal.get(Calendar.DAY_OF_MONTH));
//		// 월은 1월 -> 0, 1월 -> 1, 12월 -> 11
//		System.out.println("마지막 일: " + cal.getActualMaximum(Calendar.DAY_OF_MONTH));
//		System.out.println("오늘의 요일: " + cal.get(Calendar.DAY_OF_WEEK));
//		cal.set(2019, 0, 1);
		createCal(2020, 0);
	}

	public static void createCal(int year, int month) {
		Calendar cal = Calendar.getInstance();

		int months = month + 1;

		cal.set(year, month, 1);

		System.out.println("=============(" + months + "월)============");
		String[] weeks = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };
		for (int i = 0; i < weeks.length; i++) {
			System.out.print(" " + weeks[i]);
		}
		System.out.println();
		System.out.println("===============================");
		int spaceCnt = 0;
		for (int i = 1; i < cal.get(Calendar.DAY_OF_WEEK); i++) {
			System.out.print("    ");
			spaceCnt++;
		}
		for (int i = 1; i < cal.getActualMaximum(Calendar.DAY_OF_MONTH); i++) {
			System.out.printf("%4d", i);
			if ((i + spaceCnt) % 7 == 0)
				System.out.println();
		}
	}

}
