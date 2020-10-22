package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	//creating a controller method to show helloWorld form 
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloWorld-form";
	}
	//create controller method to process helloWorld form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloWorld";
	}
}
