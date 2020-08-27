package com.nagappa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class TestBubbleSort {

	@Test
	public void testBubbleSort() {
		
		assertArrayEquals(new int[] {1,3,4,7,8,10},new BubbleSort().bubblesort(new int[] {7,8,3,10,4,1}));
		
		assertArrayEquals(new int[] {1},new BubbleSort().bubblesort(new int[] {1}));
		assertArrayEquals(new int[] {-10,-2,-1,1,3,4},new BubbleSort().bubblesort(new int[] {-1,-2,-10,1,3,4}));
		
		
	}
}
