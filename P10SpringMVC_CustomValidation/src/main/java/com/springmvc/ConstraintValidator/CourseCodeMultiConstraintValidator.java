package com.springmvc.ConstraintValidator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.springmvc.validation.CourseCode;
import com.springmvc.validation.CourseCodeMulti;

public class CourseCodeMultiConstraintValidator implements ConstraintValidator<CourseCodeMulti, String>{

	private String[] coursePrefixes;
	
	public void initialize(CourseCodeMulti courseCodeMulti) {
		coursePrefixes = courseCodeMulti.value();
	}
	public boolean isValid(String value, ConstraintValidatorContext context) {
		boolean result = false;
		if(value != null) {
			for(String coursePrefix:coursePrefixes) {
				result = value.startsWith(coursePrefix);
				if(result) {
					break;
				}
			}
		}
		else {
			result = true;
		}
		return result;
	}

}
