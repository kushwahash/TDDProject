package com.java.calculator;

public class Runner {
	
	public static void main(String[] args) {
		String inp = "hello,there,ans:me-num";
		String o[] = inp.split(",|:|-");
		for(String i:o)
			System.out.println(i);
	}

}
