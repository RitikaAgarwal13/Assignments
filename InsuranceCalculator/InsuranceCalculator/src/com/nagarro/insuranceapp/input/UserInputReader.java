package com.nagarro.insuranceapp.input;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.nagarro.insuranceapp.model.CarDetail;
import com.nagarro.insuranceapp.model.CarType;
import com.nagarro.insuranceapp.model.InsuranceType;

public class UserInputReader {

	private static final Scanner sc = new Scanner(System.in);

	public List<CarDetail> read() {

		List<CarDetail> carDetails = new ArrayList<>();
		char userChoise = 'Y';
		while (userChoise != 'N') {

			CarDetail carDetail = new CarDetail();
			readCarModel(carDetail);
			readCarType(carDetail);
			readCarPrice(carDetail);
			readCarInsuranceType(carDetail);

			carDetails.add(carDetail);

			System.out.println("Want to check for another car : Y/N");
			userChoise = sc.next().charAt(0);
			sc.nextLine();

		}

		return carDetails;

	}

	private void readCarModel(CarDetail carDetail) {
		System.out.println("Enter car model: ");
		String carModel = sc.nextLine();
		carDetail.setCarModel(carModel);
	}

	private void readCarType(CarDetail carDetail) {
		System.out.println("Enter car type: ");
		String code = sc.nextLine();
		CarType carType = CarType.getCarType(code);
		if (carType == null) {
			System.out.println("Enter valid car Type!");
			readCarType(carDetail);
		} else {
			carDetail.setCarType(carType);
		}
	}

	private void readCarInsuranceType(CarDetail carDetail) {
		System.out.println("Enter car insurance Type");

		String insurance = sc.nextLine();

		InsuranceType insuranceType = InsuranceType.getInsuranceType(insurance);
		if (insurance == null) {
			System.out.println("No match try again!");
			readCarInsuranceType(carDetail);
		} else {
			carDetail.setInsuranceType(insuranceType);
		}
		// carDetail.setModel(null);

	}

	private void readCarPrice(CarDetail carDetail) {
		System.out.println("Enter car price");
		double price = 0.0;
		String carPrice = sc.nextLine();

		try {
			price = Double.parseDouble(carPrice);
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("car price not valid!");
			readCarPrice(carDetail);
		}
		if (price < 0) {
			System.out.println("You have entered wrong price please enter the details again");
			readCarPrice(carDetail);
		} else {
			carDetail.setCarCostPrice(price);
		}
	}

}
