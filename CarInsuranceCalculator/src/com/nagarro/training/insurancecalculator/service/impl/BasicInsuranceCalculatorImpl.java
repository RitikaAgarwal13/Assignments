package com.nagarro.training.insurancecalculator.service.impl;

import com.nagarro.training.insurancecalculator.models.Car;
import com.nagarro.training.insurancecalculator.service.InsuranceCalculator;

public class BasicInsuranceCalculatorImpl implements InsuranceCalculator {
	private double cost;
	private double basicPremium;
	@Override
	public double calculate(String Car) {
		
		if (Car == "HATCHBACK") {
			setbasicPremium(0.05*cost);
		}
		else if(Car =="SEDAN") {
			setbasicPremium(0.08*cost);
		}
		else if(Car =="SUV") {
			setbasicPremium(0.1*cost);
		}
		else {
			System.out.println("Invaild car type");
		}
		return 0;
	}
	public double getbasicPremium() {
		return basicPremium;
	}
	public void setbasicPremium(double basicPremium1) {
		basicPremium = basicPremium1;
	}
	public void calculate(Car c) {
		calculate(c);
		
	}


}
