package com.cts.zepcpd.dao;

import java.util.ArrayList;
import java.util.List;

import com.cts.zepcpd.exception.ProductOrderException;
import com.cts.zepcpd.vo.ProductOrder;

public class ProductOrderDAO {

	
	public boolean addProductOrderDetails(List<ProductOrder> pdtOrder) throws ProductOrderException {
		boolean recordsAdded = false;
		
		//Code here..

		return recordsAdded;  
	}

	public List<ProductOrder> getAllProductOrderDetails() throws ProductOrderException {
		List<ProductOrder> pdtOrder = new ArrayList<ProductOrder>();
		
		//Code here..
		
		return pdtOrder; 

	}
}