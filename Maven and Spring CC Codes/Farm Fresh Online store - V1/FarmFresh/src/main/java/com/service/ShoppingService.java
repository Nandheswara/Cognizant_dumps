package com.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.stereotype.Service;

import com.exception.NoStockException;
import com.model.Product;

//use appropriate annotation to configure ElectricityService as a Service
@Service
public class ShoppingService {
	
	public double calculateCost(Product product) throws  NoStockException {
	double totalCost=0.0;

	Map<String,Integer> stock=getProductStock();
	for (Entry<String, Integer> entry : stock.entrySet()) {  
		if(product.getProductName().equalsIgnoreCase(entry.getKey())) {	
			
			if(product.getQuantity()>entry.getValue()) {
				  throw new NoStockException("No enough stock for product "+product.getProductName());
			}
		}
	} 
	
	if(product.getProductName().equals("Apple")) {		
		product.setCostPerKg(250);
	}
	else if(product.getProductName().equals("JackFruit")) {		
		product.setCostPerKg(75);
	}
	else if(product.getProductName().equals("Orange")) {		
		product.setCostPerKg(90);
	}	 	  	    	    		        	 	
	else if(product.getProductName().equals("Mango")) {
		product.setCostPerKg(60);
	}
	else if(product.getProductName().equals("Grapes")) {
		product.setCostPerKg(150);
	}
	
	totalCost=product.getQuantity()*product.getCostPerKg();

	return totalCost;
	}
			
	public  Map<String,Integer> getProductStock(){		
		Map<String,Integer> stock = new HashMap<String,Integer>();
		stock.put("Apple",50);
		stock.put("Grapes",10);
		stock.put("Orange",30);
		stock.put("Mango",75);
		stock.put("JackFruit",25);
		           return stock;
	}	  
}
