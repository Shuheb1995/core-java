package com.xworkz.refrigerator.dao;

import java.util.HashMap;

import com.xworkz.refrigerator.dto.RefrigeratorDto;

public interface RefrigeratorDao {
	
	public boolean save(Integer id,RefrigeratorDto dto);
	public HashMap<Integer, RefrigeratorDto> read();
	public RefrigeratorDto find(Integer id);
	public boolean update(Integer id,String brand);
	public boolean delete(Integer id);

}
