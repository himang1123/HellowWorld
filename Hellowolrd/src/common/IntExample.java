package common;

public class IntExample {
	public static void main(String[] args) {
		int var1 = 10;  // => 10진수
		int var2 = 010; // => 8진수 
		int var3 = 0x7; // => 16진수

		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);

		for (int i = 0; i < 10; i++) {
			System.out.println(var3++);
			System.out.printf("%2X ", var3++);
		}
	}
}
