package com.nagarro.training.insurancecalculator.exceptions;

public class InvalidCarTypeException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidCarTypeException(String msg){
		System.out.println(msg);
		
	}
}
