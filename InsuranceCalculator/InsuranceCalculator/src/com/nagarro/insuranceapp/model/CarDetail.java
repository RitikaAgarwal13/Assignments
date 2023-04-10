package com.nagarro.insuranceapp.model;


public class CarDetail {
	
	private String carModel;
	private CarType carType;
	private double carCostPrice;
	private InsuranceType insuranceType;
	
	private double finalPremium;

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public CarType getCarType() {
		return carType;
	}

	public void setCarType(CarType carType) {
		this.carType = carType;
	}

	public double getCarCostPrice() {
		return carCostPrice;
	}

	public void setCarCostPrice(double carCostPrice) {
		this.carCostPrice = carCostPrice;
	}

	public InsuranceType getInsuranceType() {
		return insuranceType;
	}

	public void setInsuranceType(InsuranceType insuranceType) {
		this.insuranceType = insuranceType;
	}

	public double getFinalPremium() {
		return finalPremium;
	}

	public void setFinalPremium(double finalPremium) {
		this.finalPremium = finalPremium;
	}
	
	
	

}
