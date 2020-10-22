package com.springmvc.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.springmvc.validation.CourseCode;
import com.springmvc.validation.CourseCodeMulti;

public class Customer {
	
	private String firstName;
	
	@NotNull
	@Size(min = 1,message = "Last Name is required")
	private String lastName;// Required
	
	@NotNull(message = "Free Passes is required")
	@Min(value = 0,message = "Free Passes must be 0 or greater than 0")
	@Max(value = 10,message = "Free Passes must be 10 or lesser than 10")
	private Integer freePasses;// Number Ranges //int to Integer so that StringTrimmerEditor will trim it to null
	
	
	@Pattern(regexp = "^[a-zA-Z0-9]{6}",message = "Postal Code must be only 6 chars/digits")
	private String postalCode;// Regular Expression
	
	@CourseCode(value = "PA",message = "Course Code Must Start With PA")
	private String courseCode;
	
	@CourseCodeMulti(value = {"LUV","PA"},message = "Course Code Must Start With LUV OR PA")
	private String courseCodeMulti;
	
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
	public Integer getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getCourseCodeMulti() {
		return courseCodeMulti;
	}
	public void setCourseCodeMulti(String courseCodeMulti) {
		this.courseCodeMulti = courseCodeMulti;
	}
	
}
