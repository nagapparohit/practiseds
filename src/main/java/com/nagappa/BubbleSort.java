package com.nagappa;

public class BubbleSort {

	public int[] bubblesort(int[] x) {
		
		boolean flag = true;
		int length = x.length;
		for(int i=0;i<length-1;i++) {
			
			for(int j=0;j<length-1-i;j++) {
				
				if(x[j] > x[j+1]) {
					int temp = x[j];
					x[j] = x[j+1];
					x[j+1] = temp;
					flag = false;
				}
				
			}
			if(flag)
				break;
		}
		
		return x;
	}
}
