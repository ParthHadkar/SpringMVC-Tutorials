package com.springmvc.controller;

import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Value("#{countryOptions}")
	private LinkedHashMap<String, String> countryOptions;
	
	@Value("#{favoriteLanguageOptions}")
	private LinkedHashMap<String, String> favoriteLanguageOptions;
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		// create student object
		Student student = new Student();
		// add student object to the model
		model.addAttribute("student", student);
		model.addAttribute("countryOptions1", countryOptions);
		model.addAttribute("favoriteLanguageOptions1", favoriteLanguageOptions);
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student student) {
		// log the input data
		System.out.println("Student "+student.getFirstName()+" "+student.getLastName());
		return "student-confirmation";
	}
}
