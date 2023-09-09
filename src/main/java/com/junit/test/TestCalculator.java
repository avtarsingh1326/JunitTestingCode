package com.junit.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.junit.main.Calculator;

public class TestCalculator {
	
	Calculator calculator = new Calculator(); 
	
	
	@Test
	public void testAdd() {
		double result = calculator.add(12, 12);
		assertEquals(result, 24 , 0);
	}
	
	
}
