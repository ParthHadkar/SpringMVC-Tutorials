package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetingController {
	
	@RequestMapping("/showForm")
	public String displayForm() {
		return "greeting";
	}
}
