package classes.extend;

public class Tire {
	int maxRotation; // 사용가능한 타이어 수명(회전수 (10))
	int accumulateRotation; // 현재까지 사용한 회전수
	String location; // 타이어 장착 위치 (앞왼, 앞오, 뒤왼, 뒤오)

	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	public boolean roll() {
		++accumulateRotation;
		if (accumulateRotation < maxRotation) {
			System.out.println(location + "Tire 수명: " + (maxRotation - accumulateRotation));
			return true;
		} else {
			System.out.println("*** " + location + "Tire 펑크 ***");
			return false;
		}
	}

}
