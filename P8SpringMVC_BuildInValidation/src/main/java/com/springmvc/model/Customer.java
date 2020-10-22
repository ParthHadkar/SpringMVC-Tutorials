package com.springmvc.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {
	
	private String firstName;
	
	@NotNull
	@Size(min = 1,message = "Last Name is required")
	private String lastName;// Required
	
	@Min(value = 0,message = "Free Passes must be 0 or greater than 0")
	@Max(value = 10,message = "Free Passes must be 10 or lesser than 10")
	private int freePasses;//Number Ranges
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(int freePasses) {
		this.freePasses = freePasses;
	}
	
}
