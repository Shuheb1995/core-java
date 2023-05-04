package com.xworkz.vegetable.dao;

import com.xworkz.vegetable.dto.VegetableDto;

public class VegetableDao {
	
	VegetableDto[] vegies = new VegetableDto[5];
	
	public VegetableDto saveVegetable(VegetableDto name) {
		
		for(int i = 0; i < vegies.length; i++) {
			if(vegies[i] == null) {
				vegies[i] = name;
				System.out.println("Names added");
				return vegies[i];
			}
		}
		return null;
	}
	public VegetableDto[] readAll() {
		return vegies;
	}
	
	public VegetableDto findByName(String name) {
		for(int i = 0; i < vegies.length; i++) {
				if(vegies[i].getName().equals(name)) {
				System.out.println("Founded by Name");
				return vegies[i];
			}
		}
		return null;
	}
	
	public VegetableDto deleteByName(String deleteName) {
		for(int i = 0; i < vegies.length; i++) {
			if(vegies[i].getName().equals(deleteName)) {
				vegies[i] = null;
				System.out.println("Deleted");
				return vegies[i];
				
			}
		}
		
		return null;
	}
	

}
