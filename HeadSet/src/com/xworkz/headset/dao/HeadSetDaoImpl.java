package com.xworkz.headset.dao;

import java.util.HashMap;
import java.util.Set;

import com.xworkz.headset.dto.HeadSetDto;

public class HeadSetDaoImpl implements HeadSetDao {
	
	HashMap<Integer, HeadSetDto> map = new HashMap<Integer, HeadSetDto>();

	@Override
	public boolean save(Integer key,HeadSetDto dto) {
		map.put(key, dto);
		System.out.println("Dto Saved Successfully");
		return true;
	}

	@Override
	public HashMap<Integer, HeadSetDto> read() {
		
		return map;
	}

	@Override
	public HeadSetDto findbyBrand(String brand) {
		Set<Integer> key = map.keySet();
		for(Integer integer : key) {
			HeadSetDto dto = map.get(integer);
			if(dto.getBrand().equals(brand)) {
				System.out.println("Dto found");
				return dto;
			}
			
		}
		System.out.println("Data not found");
		return null;
		
	}

	@Override
	public HeadSetDto updateByPrice(Integer key, int price) {
		HeadSetDto update = map.get(key);
		update.setPrice(price);
		System.out.println("Price Updated");
		return update;
	}

	@Override
	public boolean deleteByBrand(Integer key) {
		map.remove(key);
		System.out.println("Dto deleted");
		return true;
	}

}
