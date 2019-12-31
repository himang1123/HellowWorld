package classes;

public class ClassExample {

	public static void main(String[] args) {
		Object obj = new Friend();
		System.out.println(obj.hashCode());
		Object[] objAry = new Object[10];
		if (obj instanceof Friend) {
			Friend frnd = (Friend) obj;
			System.out.println(frnd.getName() + frnd.getPhone());
		}

		objAry[0] = new Friend();
		objAry[1] = new Member();

		Friend[] fArray = new Friend[10];
		fArray[0] = new UnivFriend("", "", "", "");
		fArray[1] = new ComFriend("", "", "", "");
		fArray[2] = new UnivFriend();

		System.out.println(fArray[0]);
		System.out.println(fArray[1]);
		System.out.println(fArray[0].equals(fArray[1]));
	}
}
