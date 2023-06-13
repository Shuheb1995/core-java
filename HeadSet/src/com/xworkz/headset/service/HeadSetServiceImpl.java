package com.xworkz.headset.service;

import java.util.HashMap;

import com.xworkz.headset.dao.HeadSetDao;
import com.xworkz.headset.dao.HeadSetDaoImpl;
import com.xworkz.headset.dto.HeadSetDto;

public class HeadSetServiceImpl implements HeadSetService {

	HeadSetDao dao = new HeadSetDaoImpl();

	@Override
	public boolean save(Integer key, HeadSetDto dto) {
		if (key != null) {
			if (dto != null) {
				if (dto.getBrand() != null) {
					if (dto.getType() != null) {
						System.out.println("dto sent successfully");
						dao.save(key, dto);
						return true;
					}
					System.out.println("type is null");
					return false;

				}
				System.out.println("brand is null");
				return false;
			}
			System.out.println("Dto is null");
			return false;
		}
		System.out.println("key is null");
		return false;
	}

	@Override
	public HashMap<Integer, HeadSetDto> read() {
		
		return dao.read();
	}

	@Override
	public HeadSetDto findbyBrand(String brand) {
		System.out.println("sent request to find dto by brand");
		return dao.findbyBrand(brand);
		
	}

	@Override
	public HeadSetDto updateByPrice(Integer key, int price) {
		System.out.println("sent request to update price by key");
		return dao.updateByPrice(key, price);
		}

	
	@Override
	public boolean deleteByBrand(Integer key) {
		System.out.println("sent request to delete dto by key");
		return dao.deleteByBrand(key);
		
	}

}
