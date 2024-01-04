package com.xworkz.pizza.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;


import com.xworkz.pizza.dto.PizzaDto;

public class PizzaServiceImpl implements PizzaService{

	@Override
	public boolean save(PizzaDto dto, int id) {
		
		ValidatorFactory validate = Validation.buildDefaultValidatorFactory();
		Validator val = validate.getValidator();
		Set<ConstraintViolation<PizzaDto>> violation = val.validate(dto);
		
		if(violation.isEmpty()) {
			System.out.println("Dto is validated");
		}else {
			System.out.println("Dto is Not validated");
		}
		return false;
	}

}
