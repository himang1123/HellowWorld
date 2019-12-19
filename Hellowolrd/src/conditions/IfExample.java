package conditions;

public class IfExample {
	public static void main(String[] args) {
		int score = 60;
		if (score > 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A");
		} else { // else는 앞에서 건 조건 이외의 경우에만 실행이 된다.
			if (score >= 80) {
				System.out.println("점수가 80보다 큽니다.");
				System.out.println("등급은 B");
			} else {
				if (score >= 70) {
					System.out.println("점수가 70보다 작습니다.");
					System.out.println("등급은 C");
				} else {
					System.out.println("점수가 70보다 작습니다.");
					System.out.println("등급은 D");
				}
			}
		}
//		if (score < 90) //중괄호가 빠지면 if구문과 상관없이 출력이 된다.
//			System.out.println("점수가 90보다 작습니다.");
//			System.out.println("등급은 B");

	}
}
