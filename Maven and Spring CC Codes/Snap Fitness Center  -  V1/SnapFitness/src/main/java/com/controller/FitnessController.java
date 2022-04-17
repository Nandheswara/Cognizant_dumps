package com.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.model.FitnessCenter;
import com.service.FitnessService;

//use appropriate annotation to configure SnapFitnessController as Controller
@Controller
public class FitnessController {
	
//	Use appropriate annotation
    @Autowired
	private FitnessService service;	
	
	@ModelAttribute("packageList")
	 public Map<String, String> buildState() {
		Map<String, String> pairs = new HashMap();
		pairs.put("Aerobics","Aerobics");
		pairs.put("Zumba","Zumba");
		pairs.put("PersonalTraining","PersonalTraining");
		pairs.put("Yoga","Yoga");
		pairs.put("RegularGYM","RegularGYM");
		return pairs;
	}
	@GetMapping("/snapEnquiryPage")
	 public String snapEnquiryPage( @ModelAttribute("snap") FitnessCenter fitnessCenter){
		 return "snapEnquiryPage";
	 }
    @PostMapping("/packEstimation")
	public String calculatePackageCost(@Valid @ModelAttribute("snap")FitnessCenter fitness, BindingResult result,
			ModelMap model) {
	if(result.hasErrors()){
	        model.addAttribute("messege", "Number of months should be minimum one");
			return "snapEnquiryPage";
		}
		model.addAttribute("cost",service.calculatePackageCost(fitness));
		return "snapEstimation";
	}
	

}
