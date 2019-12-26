package classes;

public class CalculatotExample {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.execute();

		double avg = cal.avg(30, 50);
		cal.println("두 수의 " + avg);

	}
}
