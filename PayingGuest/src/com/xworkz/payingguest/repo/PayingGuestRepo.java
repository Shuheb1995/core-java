package com.xworkz.payingguest.repo;

import java.util.List;

import com.xworkz.payingguest.dto.PayingGuestDto;

public interface PayingGuestRepo {
	
	public boolean save(PayingGuestDto dto);
	
	public  PayingGuestDto findbyName(String name);
	
	public List<PayingGuestDto> readAll();
	
	public boolean updateByName(String name,String location);
	
	public boolean updateLocationAndRentByName(String name,String location,int rent);
	
	public boolean deleteByName(String name);

}
