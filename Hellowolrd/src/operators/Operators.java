package operators;

public class Operators {
	public static void main(String[] args) {
		int result = 0;
		int a = 10, b = 20;
//		result = a + b;
//		System.out.println("결과값은: " + result);
		sum(30, 40);//메소드 안에 타입만 낮으면 아무거나 넣어도 된다.
		multi(20, 4);
	}
	
	public static void sum(int a, int b) {
		int result = a + b;
		System.out.println("method 결과값은: " + result);
	}
	public static void multi(int a, int b) {
		int result = a * b;
		System.out.println("method 결과값은: " + result);
		
	}
}
