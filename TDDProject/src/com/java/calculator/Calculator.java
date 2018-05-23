package com.java.calculator;

import java.util.Arrays;

public class Calculator {
	
	private static final String DELIMITER = ",|\n";


	public int add(String numbers) throws NumberFormatException {
		// TODO Auto-generated method stub
		if(numbers.isEmpty())
			return 0;
		numbers = numbers.replaceAll("\n", ",");
		if(numbers.contains(",")) {
			String num[] = numbers.split(",");
			int ans = 0;
			for(int i=0;i<num.length;i++)
				ans+=Integer.parseInt(num[i]);
			
			return ans;
		}else {
			return Integer.parseInt(numbers);
		}
		
	}
	
	String getDelimiter(String input) {
		return DELIMITER;
	}

	String getNumberList(String input) {
		return input;
	}

}
