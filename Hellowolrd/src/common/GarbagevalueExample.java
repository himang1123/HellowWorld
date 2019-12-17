package common;
// main => ctrl+space => enter 
public class GarbagevalueExample {
	public static void main(String[] args) {
		int var1 =125;  // 2,123,483,647
		byte var2 =125; // 127
		
		for(int i = 10; i > 0; i--) { // for 안에 10회 반복해라
			var1 = var1 + i; // var1 = 125 + 0;
			var2 = (byte) (var2 + i); // int -> byte 형번환(casting)
			System.out.println("var1 : " + var1 + ", " + "var2 : " + var2); //sout -> 컨트롤 스페이스
		}   //++ -> 계속 증가 , -- -> 계속 감소
	}
}
