package classes;

public class FriendExample {
	public static void main(String[] args) {
		Friend[] fArray = new Friend[5];

		UnivFriend uf = new UnivFriend("name1", "1111", "Yedam", "java");
		ComFriend cf = new ComFriend("name2", "2222", "YDCompany", "Develop");
		Friend f = new Friend("name3", "3333");

		Friend f1 = uf;
		Friend f2 = cf;

		uf.getName(); // Friend class에서 상속받음
		uf.getPhone(); // Friend class에서 상속받음
		uf.getUniv(); // 부모가 가진 메소드와 필드를 사용할 수 있다.
		uf.getMajor();

		f1.getName(); // 부모클래스는 자식클래스의 메소드 및 필드를 사용할 수 없다.
		f1.getPhone();

		fArray[0] = uf;
		fArray[1] = cf;
		fArray[2] = f;

		for(int i=0; i<3; i++) {
			fArray[i].introduce();
		}
	}
}
