package com.nagappa;

public class MergeSort {

	
	public int[] sort(int[] arr,int start,int end) {
		
		if(start < end) {
			
			int mid = (end - start)/2 + start;
			sort(arr,start,mid);
			sort(arr,mid+1,end);
			merge(arr,start,mid,end);
			
		}
		return arr;
	}
	
	
	public void merge(int[] arr,int start,int mid,int end) {
		
		int n1 = mid - start +1;
		int n2 = end - mid;
		
		int[] L = new int[n1];
		int[] R = new int[n2];
		
        for (int i = 0; i < n1; ++i) 
            L[i] = arr[start + i]; 
        for (int j = 0; j < n2; ++j) 
            R[j] = arr[mid + 1 + j];
		
		int i=0,j=0;
		
		int k = start;
		
		while(i<n1 && j < n2) {
			if(L[i] <= R[j]) {
				arr[k]=L[i];
				i++;
			}else {
				arr[k]=R[j];
				j++;
			}
			k++;
		}
		
        while (i < n1) { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        while (j < n2) { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        }
	}
		
		
	
	//this will merge two sorted list
	public int[] merge(int[] a,int[] b) {
		//two pointers point p1 point to start of "a" and p2 point to start of "b"
		int p1 = 0;
		int p2 = 0;
		int p3 = 0 ; //p3 is pointer to start of array c
		int size = a.length+b.length;
		int[] c = new int[size]; //create a array of which will return the 
		
		while(p1<a.length && p2 < b.length) {
			if(a[p1] < b[p2] ) {
				c[p3++] = a[p1++];
			}else {
				c[p3++] = b[p2++];
			}
		}
		for(;p1<a.length;p1++) {
			c[p3++]=a[p1];
		}
		for(;p2<b.length;p2++) {
			c[p3++]=b[p2];
		}
		return c;
	}
}
