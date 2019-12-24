package classes;

public class StudentExample {
	public static void main(String[] args) {
		String str = "Hello";
		String str1 = new String("Hello");

		Student student = new Student();// new 객체(인스턴스)를 만드는 키워드
										// 주소값만 찍어주는것
		student.university = "Yedam";
		student.studentNo  = "191234-1234";
		student.studentName = "김철수";
		student.age = 20;
		student.major = "English";
		student.introduce();
		
		Student student1 = new Student("Yedam", "921111-1111", "박철수");
		student1.introduce();
		System.out.println(student.major);
		student.doHomework();
		System.out.println(student);
	}
}
