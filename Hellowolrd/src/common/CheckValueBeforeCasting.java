package common;

public class CheckValueBeforeCasting {
	public static void main(String[] args) {
		int i = 128; //-128~127
//		System.out.println(Byte.MAX_VALUE);//
//		System.out.println(Byte.MIN_VALUE);
		if(i > Byte.MAX_VALUE || i < Byte.MIN_VALUE) {
			System.out.println("byte타입으로 변환불가");
		} else {
			byte b = (byte) i;
			System.out.println(b);
	}
}
}