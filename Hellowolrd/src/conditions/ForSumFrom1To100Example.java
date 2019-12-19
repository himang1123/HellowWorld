package conditions;

public class ForSumFrom1To100Example {
	public static void main(String[] args) {
		int sum = 0;

//	for(int i = 1; i <=100; i++) {
//		sum += i;
//	}
//	System.out.println("1~100 합 : " + sum);

//		for(int i = 1; i <=100; i ++) {
//		if (i % 2 == 1)
//			sum += i;
//	                                홀수들의 100까지의 합을 구하는 2가지의 방법
		for (int i = 1; i <= 100; i += 2) {
			sum += i;
		}
		System.out.println("1~100 합 : " + sum);
	}
}
