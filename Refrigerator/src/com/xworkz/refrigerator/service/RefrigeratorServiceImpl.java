package com.xworkz.refrigerator.service;

import java.util.HashMap;

import com.xworkz.refrigerator.dao.RefrigeratorDao;
import com.xworkz.refrigerator.dao.RefrigeratorDaoImpl;
import com.xworkz.refrigerator.dto.RefrigeratorDto;

public class RefrigeratorServiceImpl implements RefrigeratorService {
	
	RefrigeratorDao ref = new RefrigeratorDaoImpl();

	@Override
	public boolean save(Integer id , RefrigeratorDto dto) {
		if(dto!=null) {
			if(dto.getBrand()!=null) {
				if(dto.getColor()!=null) {
					if(dto.getPrice()>5000) {
						if(dto.getCapacity()>=4) {
							if(dto.getType()!=null) {
								System.out.println("Vslidated Successfully");
								ref.save(id, dto);
								return true;
							}
							System.out.println("Type should not be null");
							return false;
						}
						System.out.println("Enter Valid Capacity");
						return false;
					}
					System.out.println("Enter Valid Price");
					return false;
				}
				System.out.println("color is null");
				return false;
			}
			System.out.println("Brand is null");
			return false;
		}
		System.out.println("Dto is null");
		return false;
	}

	@Override
	public  HashMap<Integer, RefrigeratorDto> read() {
		
		return ref.read();
	}

	@Override
	public RefrigeratorDto find(Integer id) {
		if(id!=0) {
			System.out.println("Validated id");
			return ref.find(id); 
		}
		System.out.println("id is null");
		return null;
	}

	@Override
	public boolean update(Integer id,String brand) {
		if(id!=0) {
			if(brand!=null) {
				System.out.println("Validated successfully");
				ref.update(id, brand);
				return true;
			}
			System.out.println("Brand is null");
			return false;
		}
		System.out.println("id is null");
		return false;
	}

	@Override
	public boolean delete(Integer id) {
		if(id!=0) {
				System.out.println("Validated successfully");
				ref.delete(id);
				return true;
		}
		System.out.println("id is null");
		return false;
	}
	
	

}
