package com.xworkz.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.employee.dto.EmployeeDto;
import com.xworkz.employee.repo.EmployeeRepo;

@Component
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepo repo ;

	@Override
	public boolean save(EmployeeDto dto) {
		
		if(dto!=null) {
			if(dto.getId()>0) {
				if(dto.getName()!=null && dto.getName().length()>3) {
					if(dto.getAge()>=22) {
						if(dto.getMobileNumber()>0) {
							if(dto.getQualification()!=null && dto.getQualification().length()>=2) {
								if(dto.getGender()!=null) {
									if(dto.getDesignation()!=null) {
										if(dto.getSalary()>=25000 && dto.getSalary()<=45000) {
											if(dto.getAddress()!=null) {
												if(dto.getJoiningDate()!=null) {
													System.out.println("Data is valid & ready to save");
													return repo.save(dto);
												}
												System.out.println("JoiningDate is not valid");
												return false;
											}
											System.out.println("Address is not valid");
											return false;
										}
										System.out.println("Salary is not valid");
										return false;
									}
									System.out.println("Designation is not valid");
									return false;
								}
								System.out.println("Gender is not valid");
								return false;
							}
							System.out.println("Qualification is not valid");
							return false;							
						}
						System.out.println("Mobile Number is not valid");
						return false;
					}
					System.out.println("Age is not valid");
					return false;
				}
				System.out.println("Name is not valid");
				return false;
			}
			System.out.println("id is not valid");
			return false;
		}
		System.out.println("dto is not valid");
		return false;
	}

	@Override
	public EmployeeDto find(String name) {
		if(name!=null) {
			return repo.find(name);
		}
		return null;
	}

	@Override
	public boolean updateMobileNumberByName(String name, long mobileNumber) {
		if(name!=null) {
			if(mobileNumber!=0) {
				System.out.println("Mobile Number Updated");
				return repo.updateMobileNumberByName(name, mobileNumber);
			}
			System.out.println("Mobile Number is not Valid");
			return false;
		}
		System.out.println("Name is not valid");
		return false;
	}

	@Override
	public boolean deleteByName(String name) {
		if(name!=null) {
			System.out.println("Dto is deleted");
			return repo.deleteByName(name);
		}
		System.out.println("name is not valid");
		return false;
	}

	@Override
	public List<EmployeeDto> readAll() {
		
		return repo.readAll();
	}
	
	

}
