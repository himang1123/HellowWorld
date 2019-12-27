package operators;

public class Chapt3Example1 {
	public static void main(String[] args) {
		exam07();
	}

	public static void exam07() {
		double x = 5.0;
		double y = 2.0;
		double z = x % y;
		System.out.println(z);
		if (Double.isNaN(z))
			System.out.println("0.0으로 나눌 수 없습니다.");
		else {
			double result = z + 10;
			System.out.println("결과: " + result);
		}
	}

	public static void exam06() {
		int x = 10;
		int y = 5;
		System.out.println((x > 7 && y <= 5));
		System.out.println((x % 3 == 2) || (y % 2 != 1));
	}

	public static void exam05() {
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = ((lengthTop + lengthBottom) / 2.0) * height;
		System.out.println(area);
	}

	public static void exam04() {
		int value = 2456;
//		System.out.println(value -= value % 100);
//		System.out.println(value = (value / 100) * 100);
		// value = value - (value%100).
	}

	public static void exam03() {
		int pencils = 534;
		int students = 30;
		// 학생 한명의 연필 수
		int pencilsPerStudent = (pencils / students);
		System.out.println(pencilsPerStudent);
		// 남은 연필수
		int pendilsLeft = (pencils % students);
		System.out.println(pendilsLeft);
	}

	public static void exam02() {
		int score = 85;
		String result = (!(score > 90)) ? "가" : "나";
		System.out.println(result);
	}

	public static void exam01() {
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z);
		System.out.println(x + ", " + y);
	}

	public static void exam00() {
		int score = 65;
		char grade = (score > 90) ? 'A' : (score > 80 ? 'B' : (score > 70 ? 'C' : (score > 60 ? 'D' : 'F')));
		System.out.println(score + "점은 " + grade + "등급입니다.");
	}

}
