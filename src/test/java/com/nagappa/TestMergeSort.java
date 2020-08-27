package com.nagappa;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;


public class TestMergeSort {

	@Test
	public void testMerge() {
		assertArrayEquals(new int[] {2,3,5,6,10,14,18},new MergeSort().merge(new int[] {5,10,14,18}, new int[] {2,3,6}));
		assertArrayEquals(new int[] {2,3,5,6,10,10,14,18},new MergeSort().merge(new int[] {5,10,14,18}, new int[] {2,3,6,10}));
		assertArrayEquals(new int[] {2,3,5,6,10,10,14,18},new MergeSort().merge(new int[] {5,10,14,18}, new int[] {2,3,6,10}));
		assertArrayEquals(new int[] {1,100},new MergeSort().merge(new int[] {100}, new int[] {1}));
	}
	
	@Test
	public void testSort() {
		assertArrayEquals(new int[] {2,3,5,6,10,10,14,18},new MergeSort().sort(new int[] {18,14,10,10,6,2,3,5},0,7));
		assertArrayEquals(new int[] {8},new MergeSort().sort(new int[] {8},0,0));
		assertArrayEquals(new int[] {1,3,8},new MergeSort().sort(new int[] {8,1,3},0,2));
		assertArrayEquals(new int[] {1,3,4,5,5,8},new MergeSort().sort(new int[] {8,1,3,4,5,5},0,5));
	}
	
	
	
	
}
