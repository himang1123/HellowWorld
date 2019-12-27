package classes;

public class MethodExample1 {
	public static void main(String[] args) {
		showName();
		showName("Yoonjin");
		showAge(31);
	}

	public static void showName() {
		System.out.println("Hello, I am Kimchi");
	}

	public static void showName(String name) { // 똑같은 메소드를 만드는걸 메소드 오버로딩이라 한다.
		System.out.println("Hello, I am " + name);
	}

	public static void showAge(int age) {
		System.out.println("Hello, I am " + age + "year old.");
	}
	
}
