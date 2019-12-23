package conditions;

public class referencetype {
	public static void main(String[] args) {
		int[][] intAry = new int[5][4];
		int num = 1;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				intAry[i][j] = num++;
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(intAry[i][j] + " ");
			}System.out.println();
		}
		

	}
}
