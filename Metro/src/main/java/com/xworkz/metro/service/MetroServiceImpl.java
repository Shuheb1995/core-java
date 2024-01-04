package com.xworkz.metro.service;

import java.sql.ResultSet;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.mysql.cj.protocol.Resultset;
import com.xworkz.metro.dto.MetroDto;
import com.xworkz.metro.repository.MetroRepo;
import com.xworkz.metro.repository.MetroRepoImpl;

public class MetroServiceImpl implements MetroService {
	
	MetroRepo repo = new MetroRepoImpl();

	@Override
	public boolean save(MetroDto dto) throws Exception {
		
		ValidatorFactory validator = Validation.buildDefaultValidatorFactory();
		Validator validate = validator.getValidator();
		Set<ConstraintViolation<MetroDto>> set = validate.validate(dto);
		
		if(set.isEmpty()) {
			boolean send = repo.save(dto);
			System.out.println(send);
			System.out.println("Dto is Validated");
		}else {
			System.out.println("Dto is not Validated");
		}
		
		return false;
	}
	
	public ResultSet find(MetroDto dto,String name) throws Exception {
		
		
		ResultSet find = repo.find(dto,name);
			System.out.println(find);
			
		
		
		return null;
		
	}

}
