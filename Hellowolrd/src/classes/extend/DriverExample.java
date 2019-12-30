package classes.extend;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		Vehicle vehicle = new Vehicle();
		
		vehicle = new Bus();
		vehicle = new Truck();
		
		driver.drive(vehicle);//매개변수의 다형성
		
		Bus bus = new Bus();
		Truck truck = new Truck();
		driver.drive(bus);
		driver.drive(truck);//드라이브라는 매소드는 같은데 다른 인스턴스를 담을 수 있다.
	}
}
