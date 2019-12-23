package referencetype;

public class MethodExample {
	public static void main(String[] args) {
		printStar();
		int s1 = sum(3, 5);
		double a = divideBy(5, 3);
		System.out.println(a);
		String result = printResult("최윤진");
		System.out.println(result);
		double s2 = calculator(3, 4, "/");
		System.out.println("s2은" + s2);

	}

	public static int sum(int a, int b) {
		int result = 0;
		result = a + b;
		return result;
	}

	public static void printStar() {
		System.out.println("*");
	}

	public static String printResult(String name) {
		// return str = "반갑습니다. " + name + "씨.";
		String str = "반갑습니다. " + name + "씨.";
		return str;

	}

	public static double divideBy(int a, int b) {
		double result = 0;
		result = (double) a / b;
		return result;
	}

	public static double calculator(double a, double b, String cal) {
		double s2 = 0;
		if (cal.equals("+")) {
			s2 = a + b;
		} else if (cal.equals("-")) {
			s2 = a - b;
		} else if (cal.equals("*")) {
			s2 = a * b;
		} else if (cal.equals("/")) {
			s2 = a / b;
		}

		return s2;
	}
}
