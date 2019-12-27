package operators;

import java.util.Scanner;

public class AmazingExample {
	public static void main(String[] args) {
		exam06();
	}

	public static void exam06() {
		/*
		 * 학생 5명의 성적 입력 및 합과 평균을 구하는 프로그램. 
		 * 작성자: cholee@yedam.ac
		 */
		boolean run = true;
		int[] studentAry = new int[5]; // 5명의 성적을 저장 할 배열의 크기 5를 선언함.
		Scanner sc = new Scanner(System.in); // 사용자의 입력을 받아 처리할 Scanner 객체.
		int menu = 0, score = 0;
		int sum = 0;
		double avg = 0;
		while (run) {
			System.out.println("-------------------");
			System.out.println("1.성적입력 2.합계 3.평균  4.종료");
			System.out.println("-------------------");
			System.out.print("선택>");
			menu = sc.nextInt();

			if (menu == 1) { // 성적입력 메뉴를 선택.
				System.out.print("점수입력>");
				score = sc.nextInt();
				for (int i = 0; i < 5; i++) {
					if (studentAry[i] == 0) { // 빈공간에 한건 입력한 후 종료해야함.
						studentAry[i] = score;
						break;
					}
				}

			} else if (menu == 2) { // 합계메뉴를 선택.
				sum = 0;
				for (int i = 0; i < 5; i++) {
					if (studentAry[i] > 0)
						sum += studentAry[i];
				}
				System.out.println("합계점수는 " + sum);

			} else if (menu == 3) { // 평균메뉴를 선택.
				int cnt = 0;
				for (int i = 0; i < 5; i++) {
					if (studentAry[i] != 0)
						cnt++;
				}
				avg = (double) sum / cnt;
				System.out.println("평균은 " + avg);

			} else if (menu == 4) {
				run = false;

			} else if (menu == 5) { // 메뉴에는 없지만 배열 전체의 내용을 확인하려면 5번 선택.
				for (int i = 0; i < 5; i++) {
					System.out.println(studentAry[i]);
				}
			}

		} // end of for
		sc.close();
		System.out.println("프로그램 종료");
	}// end of exam06

	public static void exam05() {
		boolean run = true;
		int balance = 0;
		Scanner sc = new Scanner(System.in);
		int menu = 0, amt = 0;
		while (run) {
			System.out.println("-------------------");
			System.out.println("1.예금 2.출금 3.잔고  4.종료");
			System.out.println("-------------------");
			System.out.print("선택>");

			menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) {
				System.out.print("예금액>");
				amt = sc.nextInt();
				balance += amt;
			} else if (menu == 2) {
				System.out.print("출금액>");
				amt = sc.nextInt();
				balance -= amt;
			} else if (menu == 3) {
				System.out.print("잔고>" + balance);
			} else if (menu == 4) {
				run = false;
			}

		}
		sc.close();
		System.out.println("프로그램 종료.");
	}// end of exam05

	public static void exam04() {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}// end of exam04

	public static void exam03() {
		for (int x = 0; x <= 10; x++) {
			for (int y = 0; y <= 10; y++) {
				if ((4 * x) + (5 * y) == 60)
					System.out.println("(" + x + ", " + y + ")");
			}
		}
	}// end of exam03

	public static void exam02() {
		int num1, num2;

		while (true) {
			num1 = (int) (Math.random() * 6) + 1;
			num2 = (int) (Math.random() * 6) + 1;

			if (num1 + num2 == 5)
				break;

		}
		System.out.println("(" + num1 + "," + num2 + ")");

	}// end of exam02

	public static void exam01() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0)
				sum += i;
		}
		System.out.println("3의 배수의 합은: " + sum);
	}// end of exam01
} // end of AmazingExample
