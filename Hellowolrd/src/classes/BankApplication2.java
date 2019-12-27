package classes;

import java.util.Scanner;

public class BankApplication2 {
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("=======================================");
			System.out.println("1. 계좌생성  2. 계좌목록  3. 예금  4. 출금  5. 종료");
			System.out.println("=======================================");
			System.out.println("선택 > ");
			int selectNO = sc.nextInt();
			sc.nextLine();

			if (selectNO == 1) {
				// 계좌생성 구현.
				createAccount();
			} else if (selectNO == 2) {
				// 계좌목록 구현.
				accountList();
			} else if (selectNO == 3) {
				// 예금 구현.
				deposit();
			} else if (selectNO == 4) {
				// 출금 구현.
				withraw();
			} else if (selectNO == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	static void withraw() {
		System.out.println("조회할 계좌 입력: ");
		String ano = sc.nextLine();
		System.out.println("출금 금액 입력: ");
		int amount = sc.nextInt();
		Account accnt = findAccount(ano);
		int balance = accnt.getBalance();// 현 잔고
		accnt.setBalance(balance - amount);
	}

	static void deposit() {
		System.out.println("조회할 계좌 입력: ");
		String ano = sc.nextLine();
		System.out.println("입금 금액 입력: ");
		int amount = sc.nextInt();
		Account accnt = findAccount(ano);
		int balance = accnt.getBalance();// 현 잔고
		accnt.setBalance(balance + amount);
	}

	static Account findAccount(String ano) {
		Account accnt = null;
		for (Account acnt : accountArray) {
			if (acnt != null) { // null 여부 체크
				if (ano.equals(acnt.getAno())) {
					accnt = acnt;
					break;
				}
			}
		}
		return accnt;
	}

	static void accountList() {
		for (Account acnt : accountArray) {
			if (acnt != null) {
				System.out.println(acnt);
			}
		}
	}

	static void createAccount() {
		System.out.println("계좌번호 입력: ");
		String ano = sc.nextLine();
		System.out.println("사용자 입력: ");
		String owner = sc.nextLine();
		System.out.println("금액입력 : ");
		int balance = sc.nextInt();
		Account acnt = new Account(ano, owner, balance);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = acnt;
				break;
			}
		}
	}

}
