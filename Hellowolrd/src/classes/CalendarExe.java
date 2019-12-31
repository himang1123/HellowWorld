package classes;

public class CalendarExe {
	public static void main(String[] args) {
		int month = 11;
		int spaceCnt = 0;
		for (int i = 1; i < getFirstDayofMonth(month); i++) {
			System.out.println("    ");
			spaceCnt++;
		}
		System.out.println(getFirstDayofMonth(month));
		System.out.println(" =============(" + month + ")===========");
		String[] weeks = { "sun", "mon", "tue", "wen", "thr", "Fri", "sat" };

		for (int a = 0; a < weeks.length; a++) {
			System.out.print(" " + weeks[a]);
		}

		for (int i = 1; i <= getMaxDate(month); i++) {
			System.out.printf("%4d", i);
			if (i + spaceCnt % 7 == 0) {
				System.out.println();
			}
		}

		System.out.println();
		System.out.println(" ============================");

		// 7일단위로 출력
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
			} else {
				if (month == 2) {
					dayCnt = 28;
				} else {
					dayCnt = 30;
				}
			}
		} else if (7 < month) {
			if (month % 2 == 0) {
				dayCnt = 31;
			} else {
				dayCnt = 30;
			}
		}
		return dayCnt;
	}
}
