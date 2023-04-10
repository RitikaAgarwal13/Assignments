package com.nagarro.training.insurancecalculator.service.impl;

import com.nagarro.training.insurancecalculator.models.Car;
import com.nagarro.training.insurancecalculator.service.InsuranceCalculator;

public class PremiumInsuranceCalculatorImpl implements InsuranceCalculator{
	private double cost;
	private double premium;
	private double basicPremium;
	@Override
	public double calculate(String Car) {
	
		premium=basicPremium+0.2*cost;
		return 0;
	}
	public double getPremium() {
		return premium;
	}
	public void setPremium(double premium) {
		this.premium = premium;
	}
	public void calculate(Car c) {
		// TODO Auto-generated method stub
		premium=basicPremium+0.2*cost;
		
	}

}
