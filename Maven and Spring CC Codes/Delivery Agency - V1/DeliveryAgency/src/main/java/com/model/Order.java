package com.model;

import javax.validation.constraints.NotEmpty;

import org.springframework.stereotype.Component;

//pojo class with required attributes,getters and setters
@Component
public class Order {
	private String orderId;
	private String orderFrom;
	private String deliveryTo;
	// fill the code
	
	@NotEmpty(message = "Delivery Date should be Mandatory")
	private String deliveryDate;
	
	private String deliveryStatus;
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderFrom() {
		return orderFrom;
	}
	public void setOrderFrom(String orderFrom) {
		this.orderFrom = orderFrom;
	}
	public String getDeliveryTo() {
		return deliveryTo;
	}
	public void setDeliveryTo(String deliveryTo) {
		this.deliveryTo = deliveryTo;
	}
	public String getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getDeliveryStatus() {
		return deliveryStatus;
	}
	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}
	public Order(String orderId, String orderFrom, String deliveryTo, String deliveryDate, String deliveryStatus) {
		super();
		this.orderId = orderId;
		this.orderFrom = orderFrom;
		this.deliveryTo = deliveryTo;
		this.deliveryDate = deliveryDate;
		this.deliveryStatus = deliveryStatus;
	}
	
	public Order()	{}
	
}
