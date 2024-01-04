package com.xworkz.snooker.service;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

@Component
public class SnookerServiceImpl implements SnookerService {

	@Override
	public boolean regiser(String name, int age, long contactNumber , Model model) {
		
		if(name!=null && name.length()>=4) {
			if(age>=18) {
				if(contactNumber>10) {
					System.out.println("Data is Valid for saving");
					return true;
				}
				model.addAttribute("name", "Name is not valid");
				System.out.println("Name is not valid");
				return false;
			}
			model.addAttribute("age", "Age is not valid");
			System.out.println("Age is not valid");
			return false;
		}
		model.addAttribute("contactNumber", "Contact Number is not valid");
		System.out.println("Contact Number is not valid");
		return false;
	}
	
	

}
