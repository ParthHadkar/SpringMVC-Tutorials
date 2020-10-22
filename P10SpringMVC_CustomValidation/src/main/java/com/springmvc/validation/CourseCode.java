package com.springmvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.springmvc.ConstraintValidator.CourseCodeConstraintValidator;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
	
	// define default value
	public String value() default "LUV";
	// define default error message
	public String message() default "Course Code Must Start With LUV";
	// define default group
	public Class<?>[] groups() default {}; 
	// define default payloads gives addition information about validation error 
	public Class<? extends Payload>[] payload() default {}; 
	
}
