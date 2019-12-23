package conditions;

public class test191223 {
	public static void main(String[] args) {
//		int a = 11, b = 9, c = 1, d = 5, e = 8;
//		int maxValue = 0;
//		int[] num = { a, b, c, d, e };
//		for (int i = 0; i < num.length; i++) {
//			for (int j = 0; j < num.length; j++) {
//				if (num[i] >= num[j]) {
//					maxValue = num[i];
//				} else {
//					break;
//				}
//			}
//		}
//		System.out.println("가장 큰 수는 " + maxValue);

		int a = 11, b = 9, c = 1, d = 5, e = 8;
		int minValue = 0;
		int[] num = { a, b, c, d, e };
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				if (num[i] < num[j]) {
					minValue = num[i];
				} else {
					break;
				}
			}
		}
		System.out.println("가장 큰 수는 " + minValue);

	}
}
