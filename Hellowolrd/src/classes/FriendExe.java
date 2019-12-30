package classes;

import java.util.Scanner;

public class FriendExe {
	private static Friend[] friendList = new Friend[100];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("============================================");
			System.out.println("1. 연락처 입력  2. 연락처 리스트  3. 연락처 조회   4. 종료");
			System.out.println("============================================");
			System.out.println("선택 >> ");
			int selectNo = sc.nextInt();

			if (selectNo == 1) {
				System.out.println("============================================");
				System.out.println("1. 대학교동창  2. 회사 동창  3. 그 외 ");
				System.out.println("============================================");
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

			else if (selectNo == 3) {
				nameSearch();
			}

			else if (selectNo == 4) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	private static void nameSearch() {
		System.out.println("이름 입력: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println(findFriend(name));
	}

	static Friend findFriend(String name) {
		Friend flist = null;
		for (Friend fflist : friendList) {
			if (fflist != null) { // null 여부 체크
				if (name.equals(fflist.getName())) {
					flist = fflist;
					break;
				}
			}
		}
		return flist;

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
		System.out.println("회사 입력 : ");
		String company = sc.nextLine();
		System.out.println("부서 입력 : ");
		String dept = sc.nextLine();
		UnivFriend flist = new UnivFriend(name, phone, company, dept);
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
		System.out.println("학교 입력 : ");
		String univ = sc.nextLine();
		System.out.println("학과 입력 : ");
		String major = sc.nextLine();
		ComFriend flist = new ComFriend(name, phone, univ, major);
		for (int i = 0; i < friendList.length; i++) {
			if (friendList[i] == null) {
				friendList[i] = flist;
				break;
			}
		}
	}
}
