package referencetype;

public class ForArrayExample {
	public static void main(String[] args) {
		// 1~10까지 합계을 구하는 for구문을 만들어라.
		int sum = 0;
		int a = 0;
//		for (int i = 1; i < 11; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
//		
		// 위의 문제를 while로 만들어라

		while (a < 10) {
			a++;
			sum += a;

		}
		System.out.println(sum);
	}
}
