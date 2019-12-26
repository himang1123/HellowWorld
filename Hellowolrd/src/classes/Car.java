package classes;

public class Car {

	private String company = "현대자동차"; //외부에서의 접근수준을 개인만 가능하게 하겠다.(Car클래스 안에서만 company필드값을 사용하게 하겠다.)
	private String model = "그랜저"; //
	private String color = "검정";
	private int maxSpeed = 350;
	
	
	
	public Car(String company, String model, String color) {
		super();
		this.company = company;
		this.model = model;
		this.color = color;
	}
	
	
	
	
	private int speed;
	private int r;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getCompany() {
		return company;
	}
	public int getR() {
		return r;
	}
	Car(){}
	Car(String company) {
		this.company = company;
		//Car 매개값이 있는 생성자를 생성해고 매개값이 없는 생성자를 추가하고 싶을때는 
		//매개갑이 없는 생성자를 추가해줘야 한다.
	}
	
	void setCompany(String company) {
		this.company = company;
	}
	void setR(int r) {
		this.r = r;
	}
	double getArea() {
		double result = 3.14 * this.r * this.r;
		return result;
	}
}
