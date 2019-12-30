package classes.extend;

public class Car {
//	Tire frontLeft = new Tire("앞왼쪽", 6);
//	Tire frontRight = new Tire("앞오른쪽", 3);
//	Tire backLeft = new Tire("뒤왼쪽", 3);
//	Tire backRight = new Tire("뒤오른쪽", 4);

	Tire[] tires = { new Tire("앞왼쪽", 6), new Tire("앞오른쪽", 3), new Tire("뒤왼쪽", 3), new Tire("뒤오른쪽", 4) };

	void stop() {
		System.out.println("[자동차가 멈춤니다]");
	}

	int run() {
		System.out.println("[자동차가 달립니다]");
		for (int i = 0; i < tires.length; i++) {
			if (tires[0].roll() == false) {
				stop();
				return 1 + i; // 왼.앞.
			}
		}
		return 0;

	}
}
