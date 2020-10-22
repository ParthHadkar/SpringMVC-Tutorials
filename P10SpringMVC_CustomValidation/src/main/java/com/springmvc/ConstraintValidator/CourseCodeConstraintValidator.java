package com.springmvc.ConstraintValidator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.springmvc.validation.CourseCode;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String>{

	private String coursePrefix;
	
	public void initialize(CourseCode courseCode) {
		coursePrefix = courseCode.value();
	}
	public boolean isValid(String value, ConstraintValidatorContext context) {
		boolean result;
		if(value != null) {
			result = value.startsWith(coursePrefix);
		}
		else {
			result = true;
		}
		return result;
	}

}
