package conditions;

public class forMultiplicationTableExample {
	public static void main(String[] args) {
//		for (int m = 2; m <= 9; m++) {
//
//			System.out.println("*** " + m + "단 ***");
//
//			for (int n = 1; n <= 9; n++) {
//				System.out.println(m + " X " + n + "=" + (m * n));
//			}
//
//		}

		for (int m = 2; m <= 9; m++) {
			System.out.print("***  " + m + "단 *** ");
		}
		for (int m = 2; m <= 9; m++) {
			for (int n = 1; n <= 9; n++) {
				System.out.print(m + " X " + n + "=" + (m * n) + " ");
			}
		}
	}

}
