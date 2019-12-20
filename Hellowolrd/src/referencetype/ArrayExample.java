package referencetype;

public class ArrayExample {
	public static void main(String[] args) {
//		int[] intAry = { 1, 2, 3, 4, 5 }; // int intAry[] 이렇게 사용할 수 도 있다.
//		System.out.println(intAry[2]);
//		//intAry[2] = 30;
//		System.out.println(intAry[2]);
//		int sum = 0;
//		for (int a = 0; a <= 4; a ++) {
//			sum += intAry[a];
//			
//		}System.out.println(sum);
//		int sum2 = 0;
//		for (int j = 0; j <= 4; j +=2) {
//			sum2 += intAry[j];
//		}System.out.println(sum2);
//
//		String[] strAry = { "Hello", "nice", "good", "wonderful" };
//		System.out.println(strAry[1]);

//		int[] num = new int[25];
//		for (int i = 0; i < num.length; i++) {
//			num[i] = 1 + i;
//			System.out.print(num[i]);
//			if (i % 5 == 4)
//				System.out.println();
//			// 배열 25까지 생성 후 5번째자리에서 줄을 바꿔 추력해라
//		}
		int[] num = new int[25];
		int summary = 0;
		double avg = 0;
		for (int i = 0; i < num.length; i++) {
			num[i] = 1 + i;
			summary += num[i]; 
		}
		avg = summary / (double)num.length;
		System.out.print(avg);
	}
}
