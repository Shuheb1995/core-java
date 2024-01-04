package com.xworkz.employee.service;

import java.util.List;

import com.xworkz.employee.dto.EmployeeDto;

public interface EmployeeService {
	
	public boolean save(EmployeeDto dto);
	public EmployeeDto find(String name);
	public boolean updateMobileNumberByName(String name , long mobileNumber);
	public boolean deleteByName(String name);
	public List<EmployeeDto> readAll();

}
