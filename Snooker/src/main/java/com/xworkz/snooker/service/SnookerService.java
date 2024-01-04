package com.xworkz.snooker.service;

import org.springframework.ui.Model;

public interface SnookerService {
	
	public boolean regiser(String name, int age, long contactNumber , Model model);

}
