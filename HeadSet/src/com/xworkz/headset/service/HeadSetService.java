package com.xworkz.headset.service;

import java.util.HashMap;

import com.xworkz.headset.dto.HeadSetDto;

public interface HeadSetService {
	
	public boolean save(Integer key,HeadSetDto dto);
	public HashMap<Integer, HeadSetDto> read();
	public HeadSetDto findbyBrand(String brand);
	public HeadSetDto updateByPrice(Integer key, int price);
	public boolean deleteByBrand(Integer key);


}
