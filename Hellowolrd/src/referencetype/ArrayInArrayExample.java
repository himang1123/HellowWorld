package referencetype;

public class ArrayInArrayExample {
	public static void main(String[] args) {
		int[][] intAry = new int[5][5];

		int num = 1;
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				intAry[j][i] = num++;
			}
		}
		// 원래 순서.
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				System.out.print(intAry[j][i] + " ");
			}
			System.out.println();
		}
		System.out.println("====================");
		// 아래로 출력.
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				System.out.print(intAry[i][j] + " ");
			}
			System.out.println();
		}
	}
}
