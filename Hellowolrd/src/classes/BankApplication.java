package classes;

import java.util.Scanner;

public class BankApplication {

	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("========================================");
			System.out.println("1. 계좌생성  2. 계좌목록  3. 예금  4. 출금  5. 종료");
			System.out.println("========================================");
			System.out.println("선택 >> ");
			int selectNO = sc.nextInt();
			sc.nextLine();

			if (selectNO == 1) {
				createAccount();
			} else if (selectNO == 2) {
				accountList();
			} else if (selectNO == 3) {
//				deposit();
			} else if (selectNO == 4) {
				withraw();
			} else if (selectNO == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");

	}

	private static void withraw() {
		// TODO Auto-generated method stub

	}

	private static void deposit() {
		System.out.println("========");
		System.out.println("입금");
		System.out.println("========");
		System.out.println("계좌번호");
		String ano = sc.nextLine();
		System.out.println("예금액: ");
		int money = sc.nextInt();
		Account account = findAccount(ano);
			}
	private static Account findAccount(String ano) {
		return null;
	}

	private static void accountList() {
		System.out.println("======");
		System.out.println("계좌목록");
		System.out.println("======");
		for (Account account : accountArray) {
			if (account != null) {
				System.out.println(account);
			}
		}

	}

	private static void createAccount() {
		System.out.println("======");
		System.out.println("계좌생성");
		System.out.println("======");
		System.out.println("");
		System.out.println("계좌번호: ");
		String ano = sc.nextLine();
		System.out.println("계좌주: ");
		String owner = sc.nextLine();
		System.out.println("예금잔액: ");
		int balance = sc.nextInt();
		Account newAccount = new Account(ano, owner, balance);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("결과 : 계좌가 생성되었습니다.");
				break;
			}
		}

	}
}
