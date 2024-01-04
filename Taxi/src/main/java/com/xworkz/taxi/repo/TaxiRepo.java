package com.xworkz.taxi.repo;

import java.util.List;

import com.xworkz.taxi.dto.TaxiDto;

public interface TaxiRepo {
	
	public boolean saveTaxi(TaxiDto dto);
	public List<TaxiDto> readAll();
	public boolean updateTaxiEarnings(String taxiNumber, String earnings);
	public boolean updateTaxiAvailabeById(int id,boolean isAvailable);
	public TaxiDto findTaxiByLocation(String location);
	public  List<TaxiDto> findAllTaxiAvailable();
	public TaxiDto bookTaxi(String taxiNumber);

}
