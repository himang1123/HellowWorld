package referencetype;

public class test2 {
	public static void main(String[] args) {
		if(args.length !=2) {
			System.out.println("프로그램의 사용법");
			System.out.println("java MainStringArrayArgument num1 num2");
			System.exit(0);
			
		}
		Stiring strNum1 = args[0];
		Stiring strNum2 = args[1];
	}
}
