package classes;

public class Student { // 클래스 첫 단어는 대문자
	// 필드
	String university;
	String studentNo; // 클래스 앞이 공백이면 디폴트 값이 온다.
	String studentName;
	String major;
	int age;

	// 생성자
	Student() {

	}

	Student(String university, String studentNo, String studentName) {
this.university = university;//this는 변수와 인스턴스를 구별하기 위해 붙인다.
this.studentNo = studentNo;
this.studentName = studentName;
	}

	void study() {

		// 메소드
		System.out.println("공부한다.");
	}

	void introduce() {
		System.out.println("학교는 " + university + " 학번은 " + studentNo + "이고 이름은 " + studentName + "입니다.");
	}

	void basketBall() {
		System.out.println("농구한다.");
	}

	void sleep() {
		System.out.println("숙제한다.");
	}

	void doHomework() {
		System.out.println("잠을잔다.");
	}

}
