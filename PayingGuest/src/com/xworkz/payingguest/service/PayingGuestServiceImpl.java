package com.xworkz.payingguest.service;

import java.util.List;

import com.xworkz.payingguest.dto.PayingGuestDto;
import com.xworkz.payingguest.repo.PayingGuestRepo;
import com.xworkz.payingguest.repo.PayingGuestRepoImpl;

public class PayingGuestServiceImpl implements PayingGuestService {
	
	PayingGuestRepo repo = new PayingGuestRepoImpl();

	public boolean save(PayingGuestDto dto) {
	   
		if(dto!=null) {
			if(dto.getId()>0) {
				if(dto.getPgName()!=null & dto.getPgName().length()>2) {
					System.out.println("Dto is Validated");
					repo.save(dto);
					return true;
					
				}
				System.out.println("Pg Name or length is not valid");
				return false;
			}
			System.out.println("ID is not valid");
			return false;
		}
		System.out.println("dto is not valid");
		return false;
	}

	@Override
	public PayingGuestDto findbyName(String name) {
		
		if(name!=null) {
			System.out.println("Name is Validated to find");
			return  repo.findbyName(name);
		}
		System.out.println("Name is not valid");
		return null;
	}

	public boolean updateByName(String name,String location) {
		
		if(name!=null) {
			if(location!=null) {
				System.out.println("dto is Validated for update");
				return  repo.updateByName(name,location);
			}
			System.out.println("location is not Valid");
			return false;
			
		}
		System.out.println("Name is not valid");
		return false;
	}

	@Override
	public List<PayingGuestDto> readAll() {
		
		return repo.readAll();
	}

	@Override
	public boolean deleteByName(String name) {
		
		if(name!=null) {
			System.out.println("Name is Validated");
			return repo.deleteByName(name);
			 
		}
		System.out.println("Name is not valid");
		return false;
		
		
	}

	@Override
	public boolean updateLocationAndRentByName(String name, String location, int rent) {
		if(name!=null) {
			if(location!=null) {
				if(rent>2000) {
					System.out.println("dto validated for update");
					return repo.updateLocationAndRentByName(name, location, rent);
				}
			}
		}
		return false;
	}

}
