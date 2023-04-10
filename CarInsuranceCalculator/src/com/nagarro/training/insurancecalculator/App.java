package com.nagarro.training.insurancecalculator;

import com.nagarro.training.insurancecalculator.models.Car;
import com.nagarro.training.insurancecalculator.service.impl.BasicInsuranceCalculatorImpl;
import com.nagarro.training.insurancecalculator.service.impl.ConsoleInputServiceImpl;
import com.nagarro.training.insurancecalculator.service.impl.ConsoleOutputServiceImpl;
import com.nagarro.training.insurancecalculator.service.impl.PremiumInsuranceCalculatorImpl;

public class App {

	public static void main(String[] args) {
		Car c = new Car();
		ConsoleInputServiceImpl inputService = new ConsoleInputServiceImpl();
		inputService.takeInput();
		PremiumInsuranceCalculatorImpl pInsur = new PremiumInsuranceCalculatorImpl();
		pInsur.calculate(c);
		BasicInsuranceCalculatorImpl bInsur = new BasicInsuranceCalculatorImpl();
		bInsur.calculate(c);
		ConsoleOutputServiceImpl outputService = new ConsoleOutputServiceImpl();
		outputService.showOutput(c);
		c.toString();
		
	}

	}


