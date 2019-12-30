package classes.extend;

public class ParentExample {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.method1();
		parent.method2();
//		parent.method3(); // 부모클래스에 정의되어있지않아 사용불가

		Child child = (Child) parent;
		child.field2 = "data2";
		child.method3();// 부모 변수를 Child타입으로 강제형변화 하면 method3를 쓸 수 있다.

		Parent parent2 = new Parent();
		if (parent2 instanceof Child) {//parent2가 Child의 인스턴스 입니까?라고 물어봐야한다.
			Child child2 = (Child) parent2;
			child2.method3();
		} else {
			System.out.println("형변환 할 수 없습니다.");
		}
		Object obj = new Parent();//Object 클래스는 모든 클래스를 받을 수 있다.
		
	}
}
