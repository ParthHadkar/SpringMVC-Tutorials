package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
//1. create a controller class
public class HomeController {
	
	@RequestMapping("/")//3.add request mapping to controller method
	//2.define controller method
	public String showMyPage() {
		return "main-menu";//4. return view name
	}
}
