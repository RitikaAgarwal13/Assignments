package com.nagarro.training.insurancecalculator.service.impl;

import java.util.Scanner;

import com.nagarro.training.insurancecalculator.exceptions.InvalidCarCostException;
import com.nagarro.training.insurancecalculator.exceptions.InvalidCarTypeException;
import com.nagarro.training.insurancecalculator.exceptions.InvalidInsuranceTypeException;
import com.nagarro.training.insurancecalculator.models.Car;
import com.nagarro.training.insurancecalculator.service.InputService;

public class ConsoleInputServiceImpl implements InputService{

	@Override
	public void takeInput() {
		      
	            try (Scanner input1 = new Scanner(System.in)) {
					String type = input1.nextLine();
					if(type !="SUV" || type !="SEDAN" || type!="HATCHBACK") {
						throw new InvalidCarTypeException("Please enter the correct car type");
							}
					else {
						Car c1 =new Car();
						c1.getType();
					}
	            }
	            catch(Exception e1) {
					System.out.println(e1);
				}
	            
					try (Scanner input2 = new Scanner(System.in)) {
						double cost= input2.nextDouble();
						if(cost<0) {
							throw new InvalidCarCostException("Please enter the correct cost price");
								}
						/*else {
					     Car c1 =new Car();
					     c1.setCost(cost);
						}*/
					}
					catch(Exception e) {
						System.out.println(e);
					}
						try (Scanner input3 = new Scanner(System.in)) {
							String insuranceType1 = input3.nextLine();
							if(insuranceType1 !="BASIC" || insuranceType1 !="PREMIUM") {
								throw new InvalidInsuranceTypeException("Please enter the correct insurance type");
							}
							else if(insuranceType1=="BASIC"){
								BasicInsuranceCalculatorImpl bInsurance = new BasicInsuranceCalculatorImpl();
								bInsurance.calculate(insuranceType1);
								
							}
							else if(insuranceType1=="PREMIUM"){
								PremiumInsuranceCalculatorImpl pInsurance = new PremiumInsuranceCalculatorImpl();
								pInsurance.calculate(insuranceType1);
								
							}
						}
						catch(Exception e) {
							System.out.println(e);
			
						}
						@SuppressWarnings("resource")
						Scanner input4 = new Scanner(System.in); 
							String model = input4.nextLine();
							Car c1 = new Car();
							c1.setModel(model);
							
						
					
				}
	
				
	
	}

