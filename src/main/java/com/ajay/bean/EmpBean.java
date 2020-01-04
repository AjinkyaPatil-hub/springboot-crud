package com.ajay.bean;

public class EmpBean {

	private String name;
	private String address;
	private int pincode;
	private String gender;
	public EmpBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmpBean(String name, String address, int pincode, String gender) {
		super();
		this.name = name;
		this.address = address;
		this.pincode = pincode;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
