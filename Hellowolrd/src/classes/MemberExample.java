package classes;

import java.util.Scanner;

public class MemberExample {
	static Member[] memberAry = new Member[3];
	static Scanner sc = new Scanner(System.in);

	public void execute() {
		int cnt = 0, menu = 1;
		while (true) {
			System.out.println("=============================");
			System.out.println("1. 생성  2. 조회  3. 리스트  4. 종료 ");
			System.out.println("=============================");
			System.out.println("선택 > 2 Enter");
			menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) {
				createMember();
			} else if (menu == 2) {
				searchMember();
			} else if (menu == 3) {
				listMember();
			} else if (menu == 4) {
				break;
			}

		}
		System.out.println("프로그램 종료.");
	}

	public void searchMember() {
		System.out.println("id를 입력하세요.");
		String inputId = sc.nextLine();
		System.out.println("pw를 입력하세요.");
		String inputPw = sc.nextLine();
		for (Member mem : memberAry) {
			if (mem != null) {
				if (inputId.equals(mem.getId()) && inputPw.equals(mem.getPassword())) {
					System.out.println("ok" + mem);
				} else if (inputId.equals(mem.getId()) && !inputPw.equals(mem.getPassword())) {
					System.out.println("비밀번호가 틀립니다.");
				} else if (!inputId.equals(mem.getId()) && !inputPw.equals(mem.getPassword())) {
					System.out.println("없는 id 입니다.");
				}

			}
		}

	}

	public void listMember() {
		for (Member m : memberAry) {
			if (m != null)
				System.out.println(m);
		}
	}

	public void createMember() {
		Member mem = new Member();
		System.out.println("이름을 입력: ");
		String name = sc.nextLine();
		mem.setName(name);
		System.out.println("id를 입력: ");
		String id = sc.nextLine();
		mem.setId(id);
		System.out.println("password를 입력: ");
		String password = sc.nextLine();
		mem.setPassword(password);
//		System.out.println("age를 입력: ");
//		int age = sc.nextInt();
//		mem.setAge(age);

		for (int i = 0; i < memberAry.length; i++) {
			if (memberAry[i] == null) {
				memberAry[i] = mem;
				break;
			}
		}

	}

}
