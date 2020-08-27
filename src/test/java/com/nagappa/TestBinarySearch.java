package com.nagappa;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestBinarySearch {

	@Test
	public void testBinarySearch() {
		
		assertEquals(true, new BinarySearch().binarySearch(7, new int[] {1,2,3,4,5,6,7,8,9}));
		assertEquals(false, new BinarySearch().binarySearch(10, new int[] {1,2,3,4,5,6,7,8,9}));
		assertEquals(true, new BinarySearch().binarySearch(10, new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14}));
		assertEquals(false, new BinarySearch().binarySearch(-1, new int[] {}));
	}
}
