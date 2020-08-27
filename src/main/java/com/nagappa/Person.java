package com.nagappa;

import java.util.Date;

public class Person {
	private int age;
	private String fname;
	private String lname;
	private Date dob;
	
	public Person() {
		super();
		
	}
	public Person(int age, String fname, String lname, Date dob) {
		super();
		this.age = age;
		this.fname = fname;
		this.lname = lname;
		this.dob = dob;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	
	@Override
	public String toString() {
		return "Person [age=" + age + ", fname=" + fname + ", lname=" + lname + ", dob=" + dob + "]";
	}
	
}
