package com.ajay.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Emp_Info")
public class EmpEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Integer id;
	private String name;
	private String address;
	private int pincode;
	private String gender;
	public EmpEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmpEntity(Integer id, String name, String address, int pincode, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.pincode = pincode;
		this.gender = gender;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
