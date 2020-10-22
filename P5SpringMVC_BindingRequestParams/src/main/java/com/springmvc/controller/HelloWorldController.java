package com.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	//create controller method to process helloWorld form
	//add data to the model
	@RequestMapping("/processForm1")
	public String processShoutUsingHttpServletRequest(HttpServletRequest request,Model model) {
		try {
			// read the request parameter from the html form
			String studentName = request.getParameter("studentName");
			// convert data to all caps
			studentName = studentName.toUpperCase();
			// create the message
			String result = "Yo! "+studentName;
			// add message to the model
			model.addAttribute("message", result);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return "helloWorld";
	}
	
	@RequestMapping("/processForm2")
	public String processShoutUsing(
			@RequestParam("studentName") String studentName
			,Model model) {
		try {
			// convert data to all caps
			studentName = studentName.toUpperCase();
			// create the message
			String result = "Welcome "+studentName;
			// add message to the model
			model.addAttribute("message", result);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return "helloWorld";
	}
}
