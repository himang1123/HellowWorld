package conditions;

public class Rotto {
	public static void main(String[] args) {
		int[] num = new int[6];
		int i = 0;
		// int RottoNumber = (int) (Math.random() * 45) + 1;
		for (i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				if (num[i] == num[j]) {
					i--;
					break;
				}
			}
		}
		for (i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}

	}
}