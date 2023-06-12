package com.xworkz.electronics;

import java.util.Comparator;

public class DateComparator implements Comparator<ElectronicsDto> {

	@Override
	public int compare(ElectronicsDto o1, ElectronicsDto o2) {
		if(o1.getDateOfManufactured()<o2.getDateOfManufactured()) {
			return 1;
		}else {
			return -1;
		}
	}

}
