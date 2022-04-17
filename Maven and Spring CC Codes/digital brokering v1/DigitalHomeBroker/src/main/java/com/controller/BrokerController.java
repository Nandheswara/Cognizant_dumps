package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.Home;
import com.service.BrokerService;


//use appropriate annotation to configure BrokerController as Controller
@Controller
public class BrokerController {
	
	//Use appropriate annotation above this property
	@Autowired
	private BrokerService service;
	
	
	//invoke the service class - searchHome method.
	@RequestMapping(value = "/homeList", method = RequestMethod.POST)
	public String searchHome(@ModelAttribute("homeBean") Home homeBean, BindingResult result,
			ModelMap model) {
		if(result.hasErrors())
			return "searchPage";
		ArrayList<Home> listHome=service.searchHome(homeBean);
		model.addAttribute("listHome",listHome);
		
		//fill the code
		return "homeListPage";
	}
	
	@RequestMapping(value="/searchPage", method = RequestMethod.GET)
	public String searchPage() {
		
		return "searchPage";
	}
	
}
