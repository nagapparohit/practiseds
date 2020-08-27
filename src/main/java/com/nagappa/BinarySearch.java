package com.nagappa;

public class BinarySearch {

	public boolean binarySearch(int search,int[] listNumbers) {
		
		int start = 0;
		int end = listNumbers.length-1;
		while(start <=end) {
			int mid = (end - start)/2 + start;
			if(listNumbers[mid] == search)
				return true;
			else if(listNumbers[mid] > search)
				end = mid -1;
			else
				start = mid+1;
			
		}
		
		return false;
	}
}
