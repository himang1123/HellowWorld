package classes;

public class CalendarExe {
	public static void main(String[] args) {
		int month = 11;
		System.out.println("=============(" + month + "월)============");
		String[] weeks = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };
		for (int i = 0; i < weeks.length; i++) {
			System.out.print(" " + weeks[i]);
		}
		System.out.println();
		System.out.println("===============================");
		int spaceCnt = 0;
		for (int i = 1; i < getFirstDayofMonth(month); i++) {
			System.out.print("    ");
			spaceCnt++;
		}
		for (int i = 1; i < getMaxDate(month); i++) {
			System.out.printf("%4d", i);
			if ((i + spaceCnt) % 7 == 0)
				System.out.println();
		}
	}

	public static int getFirstDayofMonth(int month) {
		int result = 0;
		if (month == 9) {
			result = 1;
		} else if (month == 10) {
			result = 3;
		} else if (month == 11) {
			result = 6;
		} else if (month == 12) {
			result = 1;
		}
		return result;
	}

	public static int getMaxDate(int month) {
		int dayCnt = 0;
		if (month <= 7) {
			if (month % 2 == 1) {
				dayCnt = 31;
			} else if (month == 2) {
				dayCnt = 28;
			} else {
				dayCnt = 30;
			}
		} else {
			if (month % 2 == 0) {
				dayCnt = 31;
			} else {
				dayCnt = 30;
			}
		}
		return dayCnt;
	}
}