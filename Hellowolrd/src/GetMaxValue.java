
public class GetMaxValue {
	public static void main(String[] args) {
		int temp = 0;
		int[] num = { 8, 7, 6, 5, 4 };

		for (int i = 0; i < num.length-1; i++) {
			for (int j = 0; j < num.length-1; j++) {
				if (num[j] > num[j + 1]) {
					temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}

		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}
}
