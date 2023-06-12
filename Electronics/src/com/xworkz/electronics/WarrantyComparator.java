package com.xworkz.electronics;

import java.util.Comparator;

public class WarrantyComparator implements Comparator<ElectronicsDto> {

	@Override
	public int compare(ElectronicsDto o1, ElectronicsDto o2) {
		if(o1.getWarranty()<o2.getWarranty()) {
			return 1;
		}else {
			return -1;
		}
	}
	

}
