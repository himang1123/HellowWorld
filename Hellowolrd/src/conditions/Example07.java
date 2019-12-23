package conditions;

import java.util.Scanner;

public class Example07 {
	public static void main(String[] args) {
//		boolean run = true;
//		int balance = 0, menu = 0, amt = 0;
//		Scanner scanner = new Scanner(System.in);
//
//		while (run) {
//			System.out.println("---------------------------");
//			System.out.println("1. 예금  2. 출금  3. 잔액  4. 종료");
//			System.out.println("---------------------------");
//			System.out.println("선택 > ");
//			menu = scanner.nextInt(); // 사용자가 선택한 값을 읽어와서 기억하겠다.
//			scanner.nextLine(); //
//
//			if (menu == 1) {
//				System.out.println(" 예금액 > ");
//				amt = scanner.nextInt();
//				balance = balance + amt;
//			} else if (menu == 2) {
//				System.out.println(" 출금액 > ");
//				amt = scanner.nextInt();
//				balance = balance - amt;
//			} else if (menu == 3) {
//				System.out.println(" 잔고 > " + balance);
//
//			} else if (menu == 4) {
//				run = false;
//			}
//
//		}
//		System.out.println("프로그램 종료");

		boolean run = true;
		int balance = 0, menu = 0, atm = 0, a = 0, num2 = 0, num3 = 0;
		Scanner scanner = new Scanner(System.in);
		int[] num = new int[5];
		double avg = 0;

		while (run) {
			System.out.println("---------------------------");
			System.out.println("1. 입력  2. 합계  3. 평균  4. 종료");
			System.out.println("---------------------------");
			System.out.println("선택 > ");
			menu = scanner.nextInt(); // 사용자가 선택한 값을 읽어와서 기억하겠다.
			scanner.nextLine(); //
			if (menu == 1) {
				System.out.println(" 입력 > ");

				for (int i = 0; i < num.length; i++) {
					atm = scanner.nextInt();
					num[i] = atm;
					balance = balance + num[i];
				}

			} else if (menu == 2) {
				System.out.println(" 합계 > " + balance);

			} else if (menu == 3) {
				if (balance == 0) {
					System.out.println(" 합계가 0 입니다. 다시 입력해주세요.");
					System.out.println("---------------------------");
					System.out.println("1. 입력  2. 합계  3. 평균  4. 종료");
					System.out.println("---------------------------");
					System.out.println("선택 > ");
					menu = scanner.nextInt();
					scanner.nextLine();
				} else
					for (a = 0; a < num.length; a++) {
						if (num[a] == 0) {
							num2 += 1;
							num3 = num.length - num2;
						}
					}
				System.out.println(" 평균 > " + balance / (double) num3);
			} else if (menu == 4) {
				run = false;
			}
		}
		System.out.println(" 종료 ");
	}
}