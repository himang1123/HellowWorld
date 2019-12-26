package classes;

public class CarExample {
public static void main(String[] args) {
	
	Car myCar = new Car();
	
	myCar.setCompany("Hyundai");
	String result2 = myCar.getCompany();
	System.out.println();
	
	myCar.setR(-10);
	double result = myCar.getArea();
	System.out.println(result);
	

}
}
