package referencetype;

public class EnumExample {
	public static void main(String[] args) {
		Week today = Week.SUNDAY;
		System.out.println(today);

		for (Week w : Week.values()) {
			System.out.println(w);
		}
	}
}
