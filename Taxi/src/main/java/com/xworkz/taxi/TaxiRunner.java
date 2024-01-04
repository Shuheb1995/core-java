package com.xworkz.taxi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.taxi.dto.TaxiDto;
import com.xworkz.taxi.service.TaxiService;
import com.xworkz.taxi.service.TaxiServiceImpl;

public class TaxiRunner {

	public static void main(String args[]) {

		TaxiService service = new TaxiServiceImpl();
//		TaxiDto dto = new TaxiDto(1, "KA-52 P 3891", "7000/week", true, "Hassan", "10 Trips/week");
//		TaxiDto dto1 = new TaxiDto(2, "KA-02 Q 8966", "9000/week", false, "Banglore", "12 Trips/week");
//		TaxiDto dto2 = new TaxiDto(3, "KA-03 S 5214", "5000/week", true, "Mysore", "5 Trips/week");
//		TaxiDto dto3 = new TaxiDto(4, "KA-04 T 8974", "8000/week", false, "Chikkamagaluru", "8 Trips/week");

//		service.saveTaxi(dto);
//		service.saveTaxi(dto1);
//		service.saveTaxi(dto2);
//		service.saveTaxi(dto3);

//		List<TaxiDto> read = service.readAll();
//		System.out.println(read);

//		boolean updateEarn = service.updateTaxiEarnings("KA-52 P 3891", "11000/week");
//		System.out.println(updateEarn);

//		boolean updateAvail = service.updateTaxiAvailabeById(4, true);
//		System.out.println(updateAvail);

//		TaxiDto findTaxi = service.findTaxiByLocation("Chikkamagaluru");
//		System.out.println(findTaxi);

		List<TaxiDto> findAll = service.findAllTaxiByAvailabe();
		for (TaxiDto taxiDto : findAll) {
			System.out.println(taxiDto);		
			}
			

	}
}
