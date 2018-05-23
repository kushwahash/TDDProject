package com.java.prime;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {

	public Object generatePrimeList(int num) {
		// TODO Auto-generated method stub
		List<Integer> result = new ArrayList<>();
		int prime=2;
		
		for(prime=2;num>1;prime++)
			for(;num%prime==0;num=num/prime)
				result.add(prime);
		return result;
	}

}
