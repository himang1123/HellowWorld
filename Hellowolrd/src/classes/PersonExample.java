package classes;

public class PersonExample {
	public static void main(String[] args) {

		Person p1 = new Person("최윤진", 31, "890728-123456");
		Person p2 = new Person("최윤지", 31, "890728-123457");
		Person p3 = new Person("최윤주", 31, "890728-123458");

		Person[] human = new Person[3];
		human[0] = p1;
		human[1] = p2;
		human[2] = p3;

		for (int i = 0; i < 3; i++) {
			human[i].id();
		}
		System.out.println("================");
//확장 for
		for (Person p : human) {
			p.id();// 배열안의 갯수만큼 돌리겠다
		}

	}
}
