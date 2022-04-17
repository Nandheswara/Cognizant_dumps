package com.model;

import javax.validation.constraints.Min;

import org.springframework.stereotype.Component;

//pojo class with required attributes,getters and setters 
@Component
public class Home {

	private String location;
	private String address;
	private String contactNumber;
	private String bhkType;
	private String contactPerson;
	@Min(value = 5000, message = "Minimum rent should be 5000")
	private double rent;
	public double getRent() {
		return rent;
	}
	public void setRent(double rent) {
		this.rent = rent;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getBhkType() {
		return bhkType;
	}
	public void setBhkType(String bhkType) {
		this.bhkType = bhkType;
	}
	public String getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	
	public Home(String location, String address, String contactNumber, String bhkType, String contactPerson,double rent) {
		super();
		this.location = location;
		this.address = address;
		this.contactNumber = contactNumber;
		this.bhkType = bhkType;
		this.contactPerson = contactPerson;
		this.rent=rent;
	}
	public Home()
	{}
	
}
