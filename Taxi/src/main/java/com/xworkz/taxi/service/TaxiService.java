package com.xworkz.taxi.service;

import java.util.List;

import com.xworkz.taxi.dto.TaxiDto;

public interface TaxiService {
	
	public boolean saveTaxi(TaxiDto dto);
	public List<TaxiDto> readAll();
	public boolean updateTaxiEarnings(String taxiNumber, String earnings);
	public boolean updateTaxiAvailabeById(int id,boolean isAvailable);
	public TaxiDto findTaxiByLocation(String location);
	public  List<TaxiDto> findAllTaxiAvailable();
	
	public List<TaxiDto> findAllTaxiByAvailabe();
	
	public TaxiDto bookTaxi(String taxiNumber);

}
