package com.example.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/org")
@RestController
public class HelloWorldController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String sayHello(ModelMap model) {
		model.addAttribute("message","Hello ");
		return "welcome";
	}	
	@RequestMapping(value="/hi", method=RequestMethod.GET)
	public String sayHi(ModelMap model) {
			model.addAttribute("message","Hi ");
			return "welcome";
	}

}
