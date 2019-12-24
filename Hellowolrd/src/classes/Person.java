package classes;

public class Person {

	String name;
	int age;
	String birthday;

	Person() {
	}

	Person(String name, int age, String birthday) {
		this.name = name;
		this.age = age;
		this.birthday = birthday;
	}

	void id() {
		System.out.println("이름은 " + name + " 나이는 " + age + " 생일은 " + birthday);

	}

}
