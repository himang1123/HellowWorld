package classes;

public class ComFriend extends Friend {//자식클래스2
	private String company;
	private String dept;

	public ComFriend(String name, String phone, String company, String dept) {
		super(name, phone);
		this.company = company;
		this.dept = dept;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "회사친구 >>>> 이름=" + getName() + ", 번호=" + getPhone() + ", 회사=" + company + ", 부서=" + dept ;
	}

	@Override
	public void introduce() {
		System.out.println("이름은:" + super.getName() + "연락처는:" + super.getPhone() + "회사: " + company + "부서는:" + dept);
	}
}
