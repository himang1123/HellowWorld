package referencetype;

public class test191224 {
	public static void main(String[] args) {
		int[][] num = new int[5][5];
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 1; j < num.length; j++) {
				num[i][0] = i + 1;
				num[i][j] = num[i][j-1] + 5;
			}
		}
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
	}

}
