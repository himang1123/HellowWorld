package classes;

public class PlayBaseBall {
	public static void main(String[] args) {

		int[] hitter = new int[3];
		for (int i = 0; i < hitter.length; i++) {
			hitter[i] = (int) (Math.random() * 9) + 1;
			for (int j = 0; j < i; j++) {
				if (hitter[i] == hitter[j]) {
					i--;
					break;
				}

			}

		}
		
		int[] pitcher = new int[3];
		for (int i = 0; i < pitcher.length; i++)
	}
}
