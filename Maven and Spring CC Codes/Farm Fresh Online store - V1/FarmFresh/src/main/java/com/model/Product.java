package com.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import org.springframework.stereotype.Component;

@Component
public class Product {
	private String productName ;	
	@Min(value=1,message="Minimum quantity should be 1Kg")
	private int quantity;	
	private double costPerKg;
	
	
public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public double getCostPerKg() {
		return costPerKg;
	}	 	  	    	    		        	 	


	public void setCostPerKg(double costPerKg) {
		this.costPerKg = costPerKg;
	}


public Product() {}
}
