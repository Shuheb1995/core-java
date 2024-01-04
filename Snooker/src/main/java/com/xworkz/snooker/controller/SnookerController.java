package com.xworkz.snooker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.snooker.service.SnookerService;

@Controller
public class SnookerController {
	@Autowired
	private SnookerService service;
	
	@RequestMapping(value = "/data" , method = RequestMethod.GET)
	public String getMessage(Model model) {
		model.addAttribute("welcome", "Welcome To Pro Snooker Club");
		return "Snooker";	
	}
	
	@RequestMapping(value = "/registered" , method = RequestMethod.POST)
	public String getForm(@RequestParam String name, int age, long contactNumber, Model model) {
		System.out.println(name);
		System.out.println(age);
		System.out.println(contactNumber);
		
		boolean register = service.regiser(name, age, contactNumber, model);
		System.out.println(register);
		
		return "Snooker";
	}

}
