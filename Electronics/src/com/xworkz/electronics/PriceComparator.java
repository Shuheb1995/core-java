package com.xworkz.electronics;

import java.util.Comparator;

public class PriceComparator implements Comparator<ElectronicsDto> {
	
	@Override
	public int compare(ElectronicsDto o1, ElectronicsDto o2) {
		if(o1.getPrice()>o2.getPrice()) {
			return 1;
		}else {
			return -1;
		}
		
	}

}
