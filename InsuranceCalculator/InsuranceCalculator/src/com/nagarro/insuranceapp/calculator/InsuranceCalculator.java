package com.nagarro.insuranceapp.calculator;

import com.nagarro.insuranceapp.model.CarDetail;
import com.nagarro.insuranceapp.model.InsuranceType;

public class InsuranceCalculator {

	public void calculate(CarDetail carDetail) {
		double price = carDetail.getCarCostPrice();
		double finalinsurance;
		double insurance = price * carDetail.getCarType().getMultiplier();

		if (carDetail.getInsuranceType() == InsuranceType.PREMIUM) {
			finalinsurance = insurance * 0.20;
			insurance = insurance + finalinsurance;
		}

		carDetail.setFinalPremium(insurance);
	}

}
