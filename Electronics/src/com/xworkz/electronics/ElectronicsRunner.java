package com.xworkz.electronics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ElectronicsRunner {

	public static void main(String[] args) {
		
		
		ElectronicsDto dto = new ElectronicsDto("Laptop","Dell", 52000, 31, 2);
		ElectronicsDto dto1 = new ElectronicsDto("Mobile","Oneplus", 32000, 30, 3);
		ElectronicsDto dto2 = new ElectronicsDto("Watch","iWatch", 20000, 29, 1);
		ElectronicsDto dto3 = new ElectronicsDto("Television","Redmi", 60000, 28, 5);
		ElectronicsDto dto4 = new ElectronicsDto("Washing Machine","LG", 25000, 27, 4);
		ElectronicsDto dto5 = new ElectronicsDto("Micro Wave","Sony", 30000, 26, 6);
		ElectronicsDto dto6 = new ElectronicsDto("Refrigerator","Samsung", 40000, 25, 9);
		ElectronicsDto dto7 = new ElectronicsDto("Digital Camera","CP Plus", 38000, 24, 8);
		ElectronicsDto dto8 = new ElectronicsDto("Mixer","Butterfly", 12000, 23, 7);
		ElectronicsDto dto9 = new ElectronicsDto("Play Station 5","Sony", 100000, 22,10 );
		
		List<ElectronicsDto> list =  Arrays.asList(dto,dto1,dto2,dto3,dto4,dto5,dto6,dto7,dto8,dto9);
		
//		PriceComparator pComp = new PriceComparator();
//		Collections.sort(list, pComp);
		
//		DateComparator dComp = new DateComparator();
//		Collections.sort(list, dComp);
		
		WarrantyComparator wComp = new WarrantyComparator();
		Collections.sort(list, wComp);
		
		for(ElectronicsDto eDto : list) {
			System.out.println(eDto);
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
