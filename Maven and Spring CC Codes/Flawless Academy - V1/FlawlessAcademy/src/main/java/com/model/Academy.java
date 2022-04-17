package com.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.Max;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Academy {
	
	private String program;
	
	private double costPerSession;	
	private int weeksPerMonth;
	@Min(value = 2, message = "Minimum 2 Sessions/Week")
	@Max(value = 5, message = "Maximum 5 Sessions/Week")
	private int sessionsPerWeek;
	
	public int getSessionsPerWeek() {
		return sessionsPerWeek;
	}

	public void setSessionsPerWeek(int sessionsPerWeek) {
		this.sessionsPerWeek = sessionsPerWeek;
	}

	public Academy()
	{
		
	}
	
	public int getWeeksPerMonth() {
		return weeksPerMonth;
	}
	public void setWeeksPerMonth(int weeksPerMonth) {
		this.weeksPerMonth = weeksPerMonth;
	}
	public double getCostPerSession() {
		return costPerSession;
	}
	public void setCostPerSession(double costPerSession) {
		this.costPerSession = costPerSession;
	}
	
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}


	

}
	 	  	    	    		        	 	
