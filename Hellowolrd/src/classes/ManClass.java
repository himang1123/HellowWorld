package classes;

public class ManClass {

	public ManClass() {
		WomanClass wc = new WomanClass();
		WomanClass wc1 = new WomanClass();
		
		System.out.println(wc.equals(wc1));
	}
}
