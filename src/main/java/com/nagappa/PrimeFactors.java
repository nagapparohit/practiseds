package com.nagappa;

import java.util.ArrayList;

public class PrimeFactors {

	long num;
	
	public PrimeFactors() {
		// TODO Auto-generated constructor stub
	}
	public PrimeFactors(long num){
		this.num = num;
	}
	
	public long getNum() {
		return num;
	}
	
	public void setNum(long num) {
		this.num = num;
	}
	
	public ArrayList<Long> primeFactors(){
		
		ArrayList<Long> result = new ArrayList<Long>();
		long factor = 2;
		
		while(this.num>1) {
			if(this.num%factor==0) {
				result.add(factor);
				this.num /= factor;
			}else {
				factor += 1;
			}	
		}
		return result;
	}
}
