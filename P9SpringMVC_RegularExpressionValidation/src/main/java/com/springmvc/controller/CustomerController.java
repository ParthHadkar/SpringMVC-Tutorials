package com.springmvc.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.model.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	// Add InitBinder ... to convert/trim input string
	// to remove leading and trailing white space
	// to resolve issue of our validation
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		// create customer object
		Customer customer = new Customer();
		// Add customer object to the model
		model.addAttribute("customer", customer);
		return "customer-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer customer,
			BindingResult bindingResult) {
		System.out.println("Last Name |"+customer.getLastName()+"|");
		System.out.println("BindingResult: "+bindingResult);
		System.out.println("\n");
		if(bindingResult.hasErrors()) {
			return "customer-form";
		}
		else {
			return "customer-confirmation";
		}
		
	}
}
