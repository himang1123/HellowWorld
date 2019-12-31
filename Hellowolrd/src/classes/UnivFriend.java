package classes;

public class UnivFriend extends Friend { // 자식클래스1
	private String univ;
	private String major;
	public UnivFriend() {}
	public UnivFriend(String name, String phone, String univ, String major) {
		super(name, phone);
		this.univ = univ;
		this.major = major;
	}

	public String getUniv() {
		return univ;
	}

	public void setUniv(String univ) {
		this.univ = univ;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "대학교친구 >>> 이름=" + getName() + ", 번호=" + getPhone() + ", 학교=" + univ + ", 학과=" + major;
	}

	@Override
	public void introduce() {
		System.out.println("이름은:" + super.getName() + "연락처는:" + super.getPhone() + "학교: " + univ + "전공은:" + major);

	}

}
