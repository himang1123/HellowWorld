package operators;

public class StringEqualsExample {
	public static void main(String[] args) {
//		String str1 = "최윤진";
//		String str2 = "최윤진";
//		String str3 = new String("최윤진");
//
//	System.out.println(str1 == str2); //== 같은 값일경우 트루, 다르면 펄스
//	System.out.println(str2 == str3);
//
//	System.out.println(str1.equals(str2));
//	System.out.println(str1.equals(str3));

//		if (str1.equals(str3)) { // 클래스를 비교 할 경우 equals를 사용해야한다.
//			System.out.println("같은 내용입니다.");
//		} else {
//			System.out.println("다른 내용입니다.");
//		}
//		System.out.println(var1 + ", " + var2);
		
//		int score =85;
//		char grade = (score > 90) ? 'A' : 'B';//괄호안의 값이 참이면 A, 아니면 B 라는 뜻
//		System.out.println(grade);
		
		int score =40;
		char grade = (score > 90) ? 'A' : 
			         ((score > 80) ? 'B' : 
			        	 ((score > 70) ? 'C' : 
			        		 ((score > 60) ? 'D' : 'F')));
		System.out.println(grade);
		
		System.out.println("hahaha");
	}
}
