package ru.teamscore.java23.t1_06.compareforstream.model;

public class PersonClient extends Client {
	public PersonClient(String fullName, String phone) {
		super();
		this.fullName = fullName;
		this.phone = phone;
	}
	private String fullName;
	private String phone;
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
