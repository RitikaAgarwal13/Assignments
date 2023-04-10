package com.nagarro.training.insurancecalculator.service.impl;

import com.nagarro.training.insurancecalculator.models.Car;
import com.nagarro.training.insurancecalculator.service.OutputService;

public class ConsoleOutputServiceImpl implements OutputService{
	private double cost;
	private double basicPremium;
	private double premium;
	private double model;
	@Override
	public String showOutput( String Car ) {
		
		return "Car model : "+model+"Price : "+cost+"Total Premium"+premium;
		
		
	}
	public double getbasicPremium() {
		return basicPremium;
	}
	public void setbasicPremium(double basicPremium1) {
		basicPremium = basicPremium1;
	}
	public double getPremium() {
		return premium;
	}
	public void setPremium(double premium) {
		this.premium = premium;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public double getModel() {
		return model;
	}
	public void setModel(double model) {
		this.model = model;
	}
	public void showOutput(Car c) {
		showOutput(c);
		
	}

}
