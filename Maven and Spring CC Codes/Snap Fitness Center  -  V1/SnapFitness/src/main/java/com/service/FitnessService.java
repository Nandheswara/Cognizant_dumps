package com.service;

import com.model.FitnessCenter;

import org.springframework.stereotype.Service;

//use appropriate annotation to configure SnapFitnessService as a Service class
@Service
public class FitnessService {
	
	//calculate the Package cost and return the rent amount
	public double calculatePackageCost (FitnessCenter fitness) {
		
		double packageCost=0.0;
		// fill the code
		String serviceName = fitness.getPreferredPackage();
		int months = fitness.getNumberOfMonths();
		if(serviceName.equals("Aerobics"))
		{
			packageCost = months*1500.0;
		}
		else if(serviceName.equals("Zumba"))
		{
			packageCost = months*1750.0;
		}
		else if(serviceName.equals("RegularGYM"))
		{
			packageCost = months*1250.0;
		}
		else if(serviceName.equals("PersonalTraining"))
		{
			packageCost = months*2500.0;
		}
		else if(serviceName.equals("Yoga"))
		{
			packageCost = months*1300.0;
		}
		
		return packageCost;
		
		
	}

}
