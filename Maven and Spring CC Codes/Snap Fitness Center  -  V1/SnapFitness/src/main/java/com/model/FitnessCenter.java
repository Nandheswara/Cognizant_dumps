package com.model;
import javax.validation.constraints.Min;
import org.springframework.stereotype.Component;

//pojo class with required attributes,getters and setters 

//use appropriate annotation to make this class as component class
@Component
public class FitnessCenter {
	
	private String preferredPackage;
	private double costPerMonth;
	// use appropriate annotation for validating numberOfMonths attribute
	@Min(value= 1,message="Number of months should be minimum one")
	private int numberOfMonths;
	

	public String getPreferredPackage() {
		return preferredPackage;
	}
	public void setPreferredPackage(String preferredPackage) {
		this.preferredPackage = preferredPackage;
	}
	public double getCostPerMonth() {
		return costPerMonth;
	}
	public void setCostPerMonth(double costPerMonth) {
		this.costPerMonth = costPerMonth;
	}
	public int getNumberOfMonths() {
		return numberOfMonths;
	}
	public void setNumberOfMonths(int numberOfMonths) {
		this.numberOfMonths = numberOfMonths;
	}
	

}
	 	  	    	    		        	 	
