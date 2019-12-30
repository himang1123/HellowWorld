package classes;

public class Friend {// 부모클래스
	private String name;
	private String phone;

	public Friend(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	@Override // Friend클래스는 object클래스의 자식클래스이기때문에 String을 재정의 한것
	public String toString() {
		return "친구 >>>>>>>> 이름=" + name + ", 번호=" + phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void introduce() {
		System.out.println("이름은:" + name + "연락처는:" + phone);
	}
}
