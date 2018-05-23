package com.java.calculator;


import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	Calculator calculator ;

	@BeforeEach
	void setUp() throws Exception {
	  calculator = new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	
	
	@Test
	void testAddWithEmptyStringReturnZero() {
		
		assertEquals(0, calculator.add(""));
		
	}
	
	@Test
	void testAddWithOneParameter() {
		assertEquals(2, calculator.add("2"));
		
	}
	
	@Test
	void testAddWithTwoParameter() {
		assertEquals(5, calculator.add("2,3"));
		
	}
	
	@Test
	void testAddWithAnyNumberOfParameter() {
		assertEquals(20, calculator.add("2,3,4,5,6"));
		
	}
	
	@Test
	void testAddWithAnyNumberOfParameterWithNewLine() {
		assertEquals(13, calculator.add("1\n3,4,5"));
		
	}
	
	@Test
	void testAddWithAnyNumberOfParameterWithNewLineInSecondParameter() {
		Assertions.assertThrows(NumberFormatException.class, ()->calculator.add("1,\n4,5"));
	}
	
	@Test
	void testWithAnotherDelimeter() {
		assertEquals(3,calculator.add("//;\n1;2"));
	}
	
	

}
