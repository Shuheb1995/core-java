package com.xworkz.refrigerator.dao;

import java.util.HashMap;

import com.xworkz.refrigerator.dto.RefrigeratorDto;
import com.xworkz.refrigerator.service.RefrigeratorService;

public class RefrigeratorDaoImpl implements  RefrigeratorDao,RefrigeratorService {
	
	HashMap<Integer, RefrigeratorDto> map= new HashMap<Integer, RefrigeratorDto>();

	@Override
	public boolean save(Integer id,RefrigeratorDto dto) {
		map.put(id, dto);
		System.out.println("dto saved successfully");
		return false;
	}

	@Override
	public HashMap<Integer, RefrigeratorDto> read() {
		return map;
	}

	@Override
	public RefrigeratorDto find(Integer id) {
       return  map.get(id);
	}

	@Override
	public boolean update(Integer id,String brand) {
		RefrigeratorDto ref = map.get(id);
		ref.setBrand(brand);
		return true;
	}

	@Override
	public boolean delete(Integer id) {
		map.remove(id);
		return true;
	}

}	