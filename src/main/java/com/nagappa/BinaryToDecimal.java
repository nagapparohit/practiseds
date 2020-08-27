package com.nagappa;

import java.io.Serializable;

public class BinaryToDecimal implements Serializable{

	private String binaryString;
	
	
	public BinaryToDecimal() {
		// TODO Auto-generated constructor stub
	}
	
	public String getBinaryString() {
		return binaryString;
	}
	
	public void setBinaryString(String binaryString) {
		this.binaryString = binaryString;
	}
	
	public BinaryToDecimal(String binaryString) {
		// TODO Auto-generated constructor stub
		this.binaryString = binaryString;
	}
	

	public long convertToDecimalAlt() {
		long conversion = 1;
		long result = 0;
		for(int i =1;i <=binaryString.length();i++) {
			
			if(binaryString.charAt(binaryString.length()-i) == '1') {
				result += conversion;
			}
			conversion *=2;
		}
		
		return result;
	}
	
	public long convertToDecimal(){
		
		int length = binaryString.length();
		long sum = 0;
		int term = 0;
		for(int i=length-1;i>=0;i--) {
			
			if (binaryString.charAt(i) == '1'){
					sum += Math.pow(2, term);
			}
			term++;
		}
		
		return sum;
	}
}
