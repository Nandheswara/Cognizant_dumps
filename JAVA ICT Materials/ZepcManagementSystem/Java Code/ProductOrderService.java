package com.cts.zepcpd.service;

import java.util.ArrayList;
import java.util.List;

import com.cts.zepcpd.exception.ProductOrderException;
import com.cts.zepcpd.vo.ProductOrder;

public class ProductOrderService {
	

	/**
	 * @param productOrderRecords
	 * @return List<ProductOrder>
	 */
	public static List<ProductOrder> buildProductOrdersList(List<String> productOrderRecords) {
		List<ProductOrder> productOrdersList = new ArrayList<ProductOrder>();
		
		//Code here..	

		return productOrdersList;  
	}


	public boolean addProductOrderDetails(String inputFeed) throws ProductOrderException {
		//Code here..

		return false;  //TODO change this return value
	}

	public static double[] calculateTotalOrderCost(int noOfProducts, double noOfKmsForDelivery, String productLevel) {
		double[] productOrderCosts = new double[4];

		//Code here..

		return productOrderCosts;

	}

	public boolean searchProductOrder(String orderId) throws ProductOrderException {
		boolean status = false;
		
		//Code here..

		return status;  
	}
}
