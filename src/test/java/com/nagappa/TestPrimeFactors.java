package com.nagappa;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;


import org.junit.Test;

public class TestPrimeFactors {

	
	@Test
	public void testPrimeFactors(){
		
		ArrayList<Long> exp = new ArrayList<Long>();
		exp.add(2l);
		assertEquals(exp, new PrimeFactors(2).primeFactors());
		exp.clear();
		exp.add(17l);
		assertEquals(exp, new PrimeFactors(17).primeFactors());
		exp.clear();
		exp.add(3l);
		exp.add(7l);
		exp.add(7l);
		assertEquals(exp, new PrimeFactors(147).primeFactors());
		
	}
}
