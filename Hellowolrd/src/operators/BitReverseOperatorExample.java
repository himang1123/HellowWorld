package operators;

public class BitReverseOperatorExample {
	public static void main(String[] args) {
		int v1 = 10;
		int v2 = ~v1; // 1의 보수를 하면 -11이 된다.
		int v3 = v2 +1; // -10
		System.out.println(v1 +", " + v2 +", " + v3);
		System.out.println(toBinaryString(v1) + ", " + v1);
		System.out.println(toBinaryString(v2) + ", " + v2);
		System.out.println(toBinaryString(v3) + ", " + v3);
	}
	public static String toBinaryString(int va1) {
		String str = Integer.toBinaryString(va1);
		while (str.length() < 32) {
			str = "0" + str;
		}
		return str;
	}
}
