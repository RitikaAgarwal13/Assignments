package com.nagarro.insuranceapp;
import java.util.List;
import com.nagarro.insuranceapp.calculator.InsuranceCalculator;
import com.nagarro.insuranceapp.input.UserInputReader;
import com.nagarro.insuranceapp.model.CarDetail;

public class InsuranceApp {

	public static void main(String[] args) {

		// 1 Read User Input
		List<CarDetail> carDetails = new UserInputReader().read();

		// 2 . Calculate
		InsuranceCalculator calculator = new InsuranceCalculator();
		for (CarDetail carDetail : carDetails) {
			calculator.calculate(carDetail);
			System.out.println(
					"Total insurance of car model" + carDetail.getCarModel() + " is :" + carDetail.getFinalPremium());
		}
		// 3. Print Output

		System.out.println();
		System.out.println("Thanks for using insurance calculating service! visit again!");

	}
}
