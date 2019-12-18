package operators;

public class IncreaseDecreaseOperatorExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		x++;
		y--;
		System.out.println("x: " + x + ", y: " + y);

		System.out.println(x++);// x값을 먼저 출력하고 증감연산자를 통해 증감시킨다.
		System.out.println(++x);// 증감을 먼저 하고 x값을 출력한다.

		boolean play = true;
		System.out.println(play);

		for (int i = 0; i < 10; i++) {
			play = !play;
			System.out.println(play);

			if (play)
				System.out.println(play + "한번 더 출력");
		}
	}
}
