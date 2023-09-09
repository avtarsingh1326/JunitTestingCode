package com.junit.main;

public class Calculator {
	
	//Creating functions for Add, Sub, Multiplication, Divide
	public double add(double firstValue, double secondValue) {
		double result = firstValue + secondValue;
		return result;
	}
	
	public double sub(double firstValue, double secondValue) {
		double result = firstValue - secondValue;
		return result;
	}
	public double multiply(double firstValue, double secondValue) {
		double result = firstValue * secondValue;
		return result;
	}
	public double divide(double firstValue, double secondValue) {
		double result = firstValue / secondValue;
		return result;
	}
	
	
//	public static void main(String[] args) {
//		
//		//Creating object for calculator class
//		Calculator calculator = new Calculator();
//		
//		System.out.println(" Addition of two number is " + calculator.add(12, 3));
//		System.out.println(" Subtraction of two number is " + calculator.sub(12, 3));
//		System.out.println(" Multiply of two number is " + calculator.multiply(12, 3));
//		System.out.println(" Divide of two number is " + calculator.divide(12, 3));
//		
//		
//	}
	
	
}
