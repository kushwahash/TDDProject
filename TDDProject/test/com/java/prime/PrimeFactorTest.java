package com.java.prime;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.java.prime.PrimeFactor;

class PrimeFactorTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testPrimeFactorGenerateWithInputOne() {
		PrimeFactor prime = new PrimeFactor();
		assertEquals(getList(),prime.generatePrimeList(1));
		
	}

	private List<Integer>  getList(int... num) {
		List<Integer> list =  new ArrayList<>();
		for(int i:num)
			list.add(i);
		return list;
	}
	
	@Test
	void testPrimeFactorGenerateWithInputTwo() {
		PrimeFactor prime = new PrimeFactor();
		assertEquals(getList(2),prime.generatePrimeList(2));
		
	}
	
	@Test
	void testPrimeFactorGenerateWithInputThree() {
		PrimeFactor prime = new PrimeFactor();
		assertEquals(getList(3),prime.generatePrimeList(3));
	}
	
	@Test
	void testPrimeFactorGenerateWithInputFour() {
		PrimeFactor prime = new PrimeFactor();
		assertEquals(getList(2,2),prime.generatePrimeList(4));
	}
	
	@Test
	void testPrimeFactorGenerateWithInputSix() {
		PrimeFactor prime = new PrimeFactor();
		assertEquals(getList(2,3),prime.generatePrimeList(6));
	}
	
	@Test
	void testPrimeFactorGenerateWithInputEight() {
		PrimeFactor prime = new PrimeFactor();
		assertEquals(getList(2,2,2),prime.generatePrimeList(8));
	}
	
	@Test
	void testPrimeFactorGenerateWithInputNine() {
		PrimeFactor prime = new PrimeFactor();
		assertEquals(getList(3,3),prime.generatePrimeList(9));
	}
	
	@Test
	void testPrimeFactorGenerateWithInputFive() {
		PrimeFactor prime = new PrimeFactor();
		assertEquals(getList(5),prime.generatePrimeList(5));
	}
	
	@Test
	void testPrimeFactorGenerateWithInputTwelve() {
		PrimeFactor prime = new PrimeFactor();
		assertEquals(getList(2,2,3),prime.generatePrimeList(12));
	}
	
	 

}
