package com.controller;

import java.util.HashMap;
import java.util.Map;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.Academy;
import com.service.AcademyService;

@Controller
public class AcademyController {
	
	@Autowired
	private AcademyService service;
	
	@RequestMapping(value = "/enrollmentPage", method = RequestMethod.GET)
	public String showPage(@ModelAttribute("academyBean") Academy academyBean) {
		System.out.println("in controller");
		return "enrollmentPage";
	} 
	@ModelAttribute("programList")
	public  Map<String, String> buildState(){
		
		Map<String, String> progMap = new HashMap<String, String>();
		progMap.put("ClassicalDance", "ClassicalDance");
		progMap.put("KarnaticVocals", "KarnaticVocals");
		progMap.put("WesternDance","WesternDance");
		progMap.put("Drawing", "Drawing");
		progMap.put("Instruments","Instruments");
		 
		return progMap;                     
		
	}	 	  	    	    	     	      	 	

	@RequestMapping(value = "/progEstimation", method = RequestMethod.POST)
	public String calculateProgramCost(@ModelAttribute("academyBean") @Valid Academy academyBean, BindingResult result,
			ModelMap model) {	
		if (result.hasErrors()) {
			System.out.println("Error : " + result.toString());
			return "enrollmentPage";
		}
		double cost=service.calculateProgramCost(academyBean);
		model.addAttribute("cost", cost);
		return "estimationPage";
	}
	

}
