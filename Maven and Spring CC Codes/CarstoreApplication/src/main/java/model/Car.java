package com.cts.carstore.model;

public class Car {
	private String brandName;
	private String modelName;
	private double price;   //price in lakh
	private String fuelType;
	private double mileage;
	private int seatingCapacity;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String brandName, String modelName, double price, String fuelType,double mileage, int seatingCapacity) {
		super();
		this.brandName = brandName;
		this.modelName = modelName;
		this.price = price;
		this.fuelType = fuelType;
		this.mileage = mileage;
		this.seatingCapacity = seatingCapacity;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {	 	  	 	      	      	 	      	   	 	
		this.modelName = modelName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	
	
	
	
	
}	 	  	 	      	      	 	      	   	 	
