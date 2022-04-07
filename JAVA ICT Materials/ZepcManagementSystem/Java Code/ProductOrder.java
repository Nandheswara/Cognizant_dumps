/*
 * Don't change this code
 */
package com.cts.zepcpd.vo;

import java.util.Date;

public class ProductOrder {

	String orderId;
	String productCode;
	Date dateOfOrder;
	String productLevel;
	Date dateOfDelivery;
	int noOfProducts;
	double noOfKmsForDelivery;
	String managerApproval;
	double productCost;
	double gstTax;
	double deliveryCost;
	double totalOrderCost;
	String finalStatusOfOrder;

	public ProductOrder() {
		super();
	}
	
	public ProductOrder(String orderId, String productCode, Date dateOfOrder, String productLevel, Date dateOfDelivery,
			int noOfProducts, double noOfKmsForDelivery, String managerApproval, double productCost, double gstTax,
			double deliveryCost, double totalOrderCost, String finalStatusOfOrder) {
		super();
		this.orderId = orderId;
		this.productCode = productCode;
		this.dateOfOrder = dateOfOrder;
		this.productLevel = productLevel;
		this.dateOfDelivery = dateOfDelivery;
		this.noOfProducts = noOfProducts;
		this.noOfKmsForDelivery = noOfKmsForDelivery;
		this.managerApproval = managerApproval;
		this.productCost = productCost;
		this.gstTax = gstTax;
		this.deliveryCost = deliveryCost;
		this.totalOrderCost = totalOrderCost;
		this.finalStatusOfOrder = finalStatusOfOrder;
	}


	public String getOrderId() {
		return orderId;
	}


	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}


	public String getProductCode() {
		return productCode;
	}


	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}


	public Date getDateOfOrder() {
		return dateOfOrder;
	}


	public void setDateOfOrder(Date dateOfOrder) {
		this.dateOfOrder = dateOfOrder;
	}


	public String getProductLevel() {
		return productLevel;
	}


	public void setProductLevel(String productLevel) {
		this.productLevel = productLevel;
	}


	public Date getDateOfDelivery() {
		return dateOfDelivery;
	}


	public void setDateOfDelivery(Date dateOfDelivery) {
		this.dateOfDelivery = dateOfDelivery;
	}


	public int getNoOfProducts() {
		return noOfProducts;
	}


	public void setNoOfProducts(int noOfProducts) {
		this.noOfProducts = noOfProducts;
	}


	public double getNoOfKmsForDelivery() {
		return noOfKmsForDelivery;
	}


	public void setNoOfKmsForDelivery(double noOfKmsForDelivery) {
		this.noOfKmsForDelivery = noOfKmsForDelivery;
	}


	public String getManagerApproval() {
		return managerApproval;
	}


	public void setManagerApproval(String managerApproval) {
		this.managerApproval = managerApproval;
	}


	public double getProductCost() {
		return productCost;
	}


	public void setProductCost(double productCost) {
		this.productCost = productCost;
	}


	public double getGstTax() {
		return gstTax;
	}


	public void setGstTax(double gstTax) {
		this.gstTax = gstTax;
	}


	public double getDeliveryCost() {
		return deliveryCost;
	}


	public void setDeliveryCost(double deliveryCost) {
		this.deliveryCost = deliveryCost;
	}


	public double getTotalOrderCost() {
		return totalOrderCost;
	}


	public void setTotalOrderCost(double totalOrderCost) {
		this.totalOrderCost = totalOrderCost;
	}


	public String getFinalStatusOfOrder() {
		return finalStatusOfOrder;
	}


	public void setFinalStatusOfOrder(String finalStatusOfOrder) {
		this.finalStatusOfOrder = finalStatusOfOrder;
	}


	@Override
	public String toString() {
		return "ZepcManagementOrder Details: [orderId=" + orderId + ", productCode=" + productCode + ", dateOfOrder="
				+ dateOfOrder + ", productLevel=" + productLevel + ", dateOfDelivery=" + dateOfDelivery + ", noOfProducts="
				+ noOfProducts + ", noOfKmsForDelivery=" + noOfKmsForDelivery + ", managerApproval=" + managerApproval
				+ ", productCost=" + productCost + ", gstTax=" + gstTax + ", deliveryCost=" + deliveryCost + ", totalOrderCost=" + totalOrderCost
				+ ", finalStatusOfOrder=" + finalStatusOfOrder + "]";
	}
	
}
