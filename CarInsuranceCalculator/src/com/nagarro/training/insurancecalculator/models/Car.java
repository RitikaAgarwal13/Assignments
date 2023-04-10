package com.nagarro.training.insurancecalculator.models;

public class Car {
	private CarType type;
	private double cost;
	private InsuranceType insuranceType;
	private String model;
	public CarType getType() {
		return type;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public InsuranceType getInsuranceType() {
		return insuranceType;
	}
	public void setInsuranceType(InsuranceType insuranceType) {
		this.insuranceType = insuranceType;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() { 
		return "Car Type is: " + type +"\n"+"Insurance Type is: "+ insuranceType;
	}
}
