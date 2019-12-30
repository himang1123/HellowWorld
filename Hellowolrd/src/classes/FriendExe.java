package classes;

import java.util.Scanner;

public class FriendExe {
	private static Friend[] friendList = new Friend[100];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("===========================================");
			System.out.println("1. 연락처 입력  2. 연락처 리스트  3. 연락처 조회   4. 종료");
			System.out.println("===========================================");
			System.out.println("선택 >> ");
			int selectNo = sc.nextInt();

			if (selectNo == 1) {
				System.out.println("===========================================");
				System.out.println("1. 대학교동창  2. 회사 동창  3. 그 외 ");
				System.out.println("===========================================");
				System.out.println("선택 >> ");
				int selectNo2 = sc.nextInt();
				sc.nextLine();
				if (selectNo2 == 1) {
					createUkinfo();
				} else if (selectNo2 == 2) {
					createCfinfo();
				} else if (selectNo2 == 3) {
					createFinfo();
				}
			} else if (selectNo == 2) {
				System.out.println("===========================================");
				System.out.println("연락처 리스트 ");
				System.out.println("===========================================");
				friendList();
			}
		}
//			else if (selectNo == 3) {
//				nameSearch();
//		}
//
////			 else if (selectNo == 4) {
//////				run = false;
////			}
////		}
////		System.out.println("프로그램 종료");
//	}

	private static void nameSearch() {
		System.out.println("이름 입력: ");
		String name = sc.nextLine();
		Friend names = findAccount(name);
		accnt.setBalance(balance + amount);
	}

	static Account findAccount(String ano) {
		Account accnt = null;
		for (Account acnt : accountArray) {
			if (acnt != null) { // null 여부 체크
				if (ano.equals(acnt.getAno())) {
					accnt = acnt;
					break;
//				}
//			}
//		}
	}

	private static void friendList() {
		for (Friend flist : friendList) {
			if (flist != null) {
				System.out.println(flist);
			}
		}
	}

	private static void createFinfo() {
		System.out.println("이름 입력: ");
		String name = sc.nextLine();
		System.out.println("전화번호 입력: ");
		String phone = sc.nextLine();
		Friend flist = new Friend(name, phone);
		for (int i = 0; i < friendList.length; i++) {
			if (friendList[i] == null) {
				friendList[i] = flist;
				break;
			}
		}
	}

	private static void createCfinfo() {
		System.out.println("이름 입력: ");
		String name = sc.nextLine();
		System.out.println("전화번호 입력: ");
		String phone = sc.nextLine();
		System.out.println("학교 입력 : ");
		String univ = sc.nextLine();
		System.out.println("학과 입력 : ");
		String major = sc.nextLine();
		UnivFriend flist = new UnivFriend(name, phone, univ, major);
		for (int i = 0; i < friendList.length; i++) {
			if (friendList[i] == null) {
				friendList[i] = flist;
				break;
			}
		}
	}

	private static void createUkinfo() {
		System.out.println("이름 입력: ");
		String name = sc.nextLine();
		System.out.println("전화번호 입력: ");
		String phone = sc.nextLine();
		System.out.println("회사 입력 : ");
		String company = sc.nextLine();
		System.out.println("부서 입력 : ");
		String dept = sc.nextLine();
		ComFriend flist = new ComFriend(name, phone, company, dept);
		for (int i = 0; i < friendList.length; i++) {
			if (friendList[i] == null) {
				friendList[i] = flist;
				break;
			}
		}
	}

//	static void withraw() {
//		System.out.println("조회할 계좌 입력: ");
//		String ano = sc.nextLine();
//		System.out.println("출금 금액 입력: ");
//		int amount = sc.nextInt();
//		Account accnt = findAccount(ano);
//		int balance = accnt.getBalance();// 현 잔고
//		accnt.setBalance(balance - amount);
//	}
//
//	static void deposit() {
//		System.out.println("조회할 계좌 입력: ");
//		String ano = sc.nextLine();
//		System.out.println("입금 금액 입력: ");
//		int amount = sc.nextInt();
//		Account accnt = findAccount(ano);
//		int balance = accnt.getBalance();// 현 잔고
//		accnt.setBalance(balance + amount);
//	}
//
//	static Account findAccount(String ano) {
//		Account accnt = null;
//		for (Account acnt : accountArray) {
//			if (acnt != null) { // null 여부 체크
//				if (ano.equals(acnt.getAno())) {
//					accnt = acnt;
//					break;
//				}
//			}
//		}
//		return accnt;
//	}
//

}
