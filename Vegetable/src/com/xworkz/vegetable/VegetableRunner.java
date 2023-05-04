package com.xworkz.vegetable;


import com.xworkz.vegetable.constant.Type;
import com.xworkz.vegetable.dao.VegetableDao;
import com.xworkz.vegetable.dto.VegetableDto;
import com.xworkz.vegetable.dto.Vitamins;

public class VegetableRunner {
	
	public static void main(String[] args) {
		
		VegetableDao dao = new VegetableDao();
		Vitamins vita = new Vitamins("Vitamin A","Vitamin B","Vitamin C","Vitamin D");
		VegetableDto dto = new VegetableDto("Tomato","Red",50,Type.ORGANIC,vita);
		VegetableDto dto1 = new VegetableDto("Onion","Pinkish",70,Type.HYBRID,vita);
		VegetableDto dto2 = new VegetableDto("Potato","Brownish",40,Type.ORGANIC,vita);
		VegetableDto dto3 = new VegetableDto("Green Chilly","Greenish",80,Type.HYBRID,vita);
		
		
		
		dao.saveVegetable(dto);
		dao.saveVegetable(dto1);
		dao.saveVegetable(dto2);
		dao.saveVegetable(dto3);
		
		VegetableDto[] vegRead = dao.readAll();
		for(int i=0; i<vegRead.length; i++) {
 		if(vegRead[i] != null) {
			System.out.println(vegRead[i]);
			}
			
		}
		System.out.println("--------------------------------------------------------------");
		VegetableDto findPotato = dao.findByName("Potato");
		System.out.println(findPotato);
		System.out.println("--------------------------------------------------------------");
		VegetableDto deleteVeg = dao.deleteByName("Onion");
		System.out.println(deleteVeg);
		System.out.println("--------------------------------------------------------------");
		
		
		
	}

}
