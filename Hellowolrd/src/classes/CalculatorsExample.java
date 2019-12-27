package classes;

class Calculators {
	static double PI = 3.14159; // 정적변수는 대문자로표기, 두 단어 이상이면 _ 로 표기
	String color;
	public String setColor;

	// 자바머신이 켜지면 static이 할당된 변수는 메모리에 바로 저장된다.
	// 없으면 인스턴스로 취급된다.
	void setColor(String color) {
		this.color = color;
	}

	static int plus(int x, int y) {
		return x + y;
	}

	static int minus(int a, int b) {
		return a - b;
	}
}

public class CalculatorsExample {
	public static void main(String[] args) {
		Calculators cal = new Calculators();
		cal.color = "White";
		cal.setColor = ("black"); //인스턴스 메소드는 반드시 인스턴스 선언 후 사용이 가능
		cal.plus(4, 5);
		
		Calculators.plus(6, 7);//정적(static)메소드는 클래스명.메소드로 쓸 수 있다.
	}
}
