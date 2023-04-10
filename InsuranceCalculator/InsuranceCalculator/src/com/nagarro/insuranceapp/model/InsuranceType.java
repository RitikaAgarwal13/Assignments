package com.nagarro.insuranceapp.model;

public enum InsuranceType {
	
	BASIC("basic"), PREMIUM("premium");
	
	private String code;
	
	private InsuranceType(String code) {
		this.code = code;
	}
	
	
	
	public String getCode() {
		return code;
	}



	public static InsuranceType getInsuranceType(String code) {
		for(InsuranceType insuranceType : InsuranceType.values()) {
			if(code.equalsIgnoreCase(insuranceType.getCode())) {
				return insuranceType;
			}
		}
		
		return null;
	}

}
