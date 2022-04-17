package com.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
	
	@RequestMapping(value = "/searchPage", method = RequestMethod.GET)
	public String searchPage(@ModelAttribute("homeBean") Home homeBean)	{		
		return "searchPage";
	}
	
	//invoke the service class - searchHome method.
	@RequestMapping(value = "/homeList", method = RequestMethod.POST)
	public String searchHome(@ModelAttribute("homeBean") @Valid Home homeBean, BindingResult result,
			ModelMap model) {
		if (result.hasErrors()) {
			return "searchPage";
		}
		model.addAttribute("homes", service.searchHome(homeBean));
		return "homeListPage";
	}
}
