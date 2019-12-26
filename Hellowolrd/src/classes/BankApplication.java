package classes;

import java.util.Scanner;

public class BankApplication {

	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("===========================");
			System.out.println("1. 계좌생성  2. 계좌목록  3. 예금  4. 출금  5. 종료");
			System.out.println("===========================");
			System.out.println("선택 > ");

			int selectNO = sc.nextInt();

			if (selectNO == 1) {
				createAccount();
			} else if (selectNO == 2) {
				accountList();
			} else if (selectNO == 3) {
				deposit();
			} else if (selectNO == 4) {
				withraw();
			} else if (selectNO == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	private static void createAccount() {
		Account acc = new Account();
		System.out.println("========");
		System.out.println("계좌생성");
		System.out.println("========");
		String ano = sc.nextLine();
		
	}
}
