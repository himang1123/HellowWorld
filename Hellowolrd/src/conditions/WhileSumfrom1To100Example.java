package conditions;

public class WhileSumfrom1To100Example {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {

		}
		int i = 1;
		int sum = 0;
		while (i <= 100) {
			sum = sum + i;
			i++;
		}
		System.out.println("1에서 100 까지 합은 " + sum);
		i = 1;
		sum = 0;
		do {
			sum = sum + i;
			i++;
		} while (i <= 100);
	}
}