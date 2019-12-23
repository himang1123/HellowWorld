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

//		while (a < 10) {
//			a++;
//			sum += a;
//
//		}
//		System.out.println(sum);

		// 1~100까지의 수 중에서 3의 배수의 합
//		for (int i = 1; i < 101; i ++) {
//			if((i % 3) == 0) {
//				sum += i;
//			}
//			
//		}
		// 1~100까지의 수 중에서 7의 배수의 합
//		for (int i = 1; i < 101; i++) {
//			if ((i % 7) == 0) {
//				sum += i;
//
//			}
//		}
//		
		// 1~6까지 수 중 5가 나올때 까지 출력
		for (int i = 0; i < 7; i++) {
			sum = (int) (Math.random() * 6) + 1;
			System.out.print(sum + " ");
			if (sum == 5) {
				break;
			}
		}

	}
}
