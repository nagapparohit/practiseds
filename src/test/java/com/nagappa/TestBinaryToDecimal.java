package com.nagappa;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestBinaryToDecimal {

	BinaryToDecimal b1 = new BinaryToDecimal("11");
	BinaryToDecimal b2 = new BinaryToDecimal("0");
	BinaryToDecimal b3 = new BinaryToDecimal("11111111");
	BinaryToDecimal b4 = new BinaryToDecimal("1111101000");
	BinaryToDecimal b5 = new BinaryToDecimal("1");
	
	@Test
	public void testConvertToDecimal() {
		
		assertEquals(3, b1.convertToDecimal());
		assertEquals(0, b2.convertToDecimal());
		assertEquals(255, b3.convertToDecimal());
		assertEquals(1000, b4.convertToDecimal());
		assertEquals(1, b5.convertToDecimal());
		
	}
	
	@Test
	public void testConvertToDecimalAlt() {
		assertEquals(3, b1.convertToDecimalAlt());
		assertEquals(0, b2.convertToDecimalAlt());
		assertEquals(255, b3.convertToDecimalAlt());
		assertEquals(1000, b4.convertToDecimalAlt());
		assertEquals(1, b5.convertToDecimal());
		
	}
	
}
