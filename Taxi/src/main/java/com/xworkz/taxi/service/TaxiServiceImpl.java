package com.xworkz.taxi.service;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.taxi.dto.TaxiDto;
import com.xworkz.taxi.repo.TaxiRepo;
import com.xworkz.taxi.repo.TaxiRepoImpl;

public class TaxiServiceImpl implements TaxiService {
	
	TaxiRepo repo = new TaxiRepoImpl();

	@Override
	public boolean saveTaxi(TaxiDto dto) {
		if(dto!=null) {
			if(dto.getTaxiNumber()!=null && dto.getTaxiNumber().length()>4) {
				if(dto.getEarnings()!=null && dto.getEarnings().length()>=4) {
					if(dto.getLocation()!=null && dto.getLocation().length()>2) {
						if(dto.getTrips()!=null && dto.getTrips().length()>=1) {
							System.out.println("Data is valid for Saving");
							return repo.saveTaxi(dto);
						}
						System.out.println("Trips are not valid");
						return false;
					}
					System.out.println("Location is not valid");
					return false;
				}
				System.out.println("Earnings are not valid");
				return false;
			}
			System.out.println("Taxi Number is not valid");
			return false;
		}
		System.out.println("Dtois not valid");
		return false;
	}

	@Override
	public List<TaxiDto> readAll() {
		
		return repo.readAll();
	}

	@Override
	public boolean updateTaxiEarnings(String taxiNumber, String earnings) {
		
		if(taxiNumber!=null) {
			if(earnings!=null) {
				System.out.println("Valid for update");
				return repo.updateTaxiEarnings(taxiNumber,earnings);
			}
			System.out.println("earnings are not vaid");
			return false;
		}
		System.out.println("Taxi Number is not valid");
		return false;
	}

	@Override
	public boolean updateTaxiAvailabeById(int id,boolean isAvailable) {
		if(id!=0) {
			System.out.println("Valid for update");
			return repo.updateTaxiAvailabeById(id, isAvailable);
		}
		System.out.println("id should not be zero");
		return false;
	}

	@Override
	public TaxiDto findTaxiByLocation(String location) {
		
		if(location!=null) {
			System.out.println("Valid for Finding");
			return repo.findTaxiByLocation(location);
		}
		System.out.println("Location not valid");
		return null;
	}

	@Override
	public  List<TaxiDto> findAllTaxiAvailable() {
		List<TaxiDto> read = repo.readAll();
		List<TaxiDto> list = new ArrayList<TaxiDto>();
		
		
		   for (TaxiDto taxiDto : read) {
			if(taxiDto.isAvailable()==true) {
				list.add(taxiDto);
				
			}
			
		}
		
		   return list;
	}
	
	public List<TaxiDto> findAllTaxiByAvailabe(){
		return repo.findAllTaxiAvailable();
	}

	@Override
	public TaxiDto bookTaxi(String taxiNumber) {
		List<TaxiDto> book = findAllTaxiByAvailabe();
	    
		
		
		return repo.bookTaxi(taxiNumber);
	}

}
