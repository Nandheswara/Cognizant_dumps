package com.controller;


import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;

import com.exception.NoStockException;
import com.model.Product;
import com.service.ShoppingService;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//use appropriate annotation to configure ShoppingController as Controller
@Controller
public class ShoppingController {
	
	@Autowired
	private ShoppingService shoppingService;
	
	@RequestMapping(value = "/showPage", method = RequestMethod.GET)
	public String showPage(@ModelAttribute("product")Product product) {	
		
		return "showPage";
	}
	
	@ModelAttribute("productNames")	
	public  List<String> populateProduct(){		
		List<String> productNames = new ArrayList<String>();
		           productNames.add("Apple");
		           productNames.add("Orange");
		           productNames.add("Grapes");
		           productNames.add("Mango");
		           productNames.add("JackFruit");
		           return productNames;
	}	 	  	    	    		        	 	

	//invoke the service class - calculateCostAndUpdate method.
	@RequestMapping(value = "/calculate", method = RequestMethod.POST)
	public String calculateCost(@ModelAttribute("product")@Valid Product product, BindingResult result,ModelMap model) throws  NoStockException {
		
		if(result.hasErrors()){
		
			return ("showPage");
		}
		else{		
			double cost=shoppingService.calculateCost(product);		
			model.addAttribute("cost",cost);
			model.addAttribute("costPerKg",product.getCostPerKg());
			model.addAttribute("name",product.getProductName());
			model.addAttribute("quantity",product.getQuantity());
			
		}
		 		
		return ("billDesk");
	}
	

	@ExceptionHandler(NoStockException. class)
	public ModelAndView exceptionHandler(Exception e) {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("message", e.getMessage());
		mav.setViewName("exceptionPage");
		return mav;
	}
	
}
	 	  	    	    		        	 	
