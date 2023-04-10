package com.nagarro.insuranceapp.model;

public enum CarType {
	
	SEDAN("sedan", 0.08), SUV("suv", 0.1), HATCHBACK("hatchback", 0.05);
	
	
	private String code;
	private double multiplier;
	private CarType(String code, double multiplier) {
		this.code = code;
		this.multiplier = multiplier;
	}
	public String getCode() {
		return code;
	}
	public double getMultiplier() {
		return multiplier;
	}
	
	
	public static CarType getCarType(String code) {
		for(CarType carType : CarType.values()) {
			if(code.equalsIgnoreCase(carType.getCode())) {
				return carType;
			}
		}
		
		return null;
	}
	
	

}
