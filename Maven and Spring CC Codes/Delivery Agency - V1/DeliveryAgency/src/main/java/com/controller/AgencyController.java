package com.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.exception.NoOrdersFoundException;
import com.model.Order;
import com.service.AgencyService;

//use appropriate annotation to configure AgencyController as Controller
@Controller
public class AgencyController {
	
	//Use appropriate annotation
	@Autowired
	private AgencyService service;
	
	@RequestMapping(value = "/searchPage", method = RequestMethod.GET)
	public String searchPage(@ModelAttribute("orderBean") Order orderBean) {
		return "searchPage";
	}
	
	
	//invoke the service class - searchDeliveryOrders method. 
	@RequestMapping(value = "/orderList", method = RequestMethod.POST)
	public String searchDeliveryOrders(@ModelAttribute("orderBean") @Valid Order orderBean, BindingResult result,
			ModelMap model) throws NoOrdersFoundException  {		
		//fill the code
		if (result.hasErrors()) {
			return "searchPage";			
		} else {
			List<Order> ordersFound = service.searchDeliveryOrders(orderBean);
			if(ordersFound.isEmpty()) {
				throw new NoOrdersFoundException("No orders found for this search criteria");
			} else {
				model.addAttribute("orders", ordersFound);
				return "deliveryListPage";
			}
			
		}
	}
	
	@ExceptionHandler(NoOrdersFoundException.class)
	public ModelAndView exceptionHandler(Exception e) {
		ModelAndView mav = new ModelAndView();
	    mav.addObject("exception", e);
	    mav.setViewName("exceptionPage");
	    return mav;
	}
}
