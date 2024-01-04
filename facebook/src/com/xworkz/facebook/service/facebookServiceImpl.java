package com.xworkz.facebook.service;

import java.sql.Date;
import java.sql.SQLException;
import java.util.Set;

import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import javax.validation.metadata.ValidateUnwrappedValue;
import javax.xml.validation.Validator;

import com.xworkz.facebook.Dto.facebookDto;
import com.xworkz.facebook.repository.facebookRepo;
import com.xworkz.facebook.repository.facebookRepoImpl;

public class facebookServiceImpl implements facebookService {

	facebookRepo repo = new facebookRepoImpl();

	@Override
	public boolean save(facebookDto dto) throws ClassNotFoundException, SQLException {
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		javax.validation.Validator validator = factory.getValidator();	
		Set<ConstraintsViolation<facebookDto>> violation = validator.validate(dto);
		return false;
	}

	@Override
	public boolean update(String firstName, String lastName, Date DOB, String email, int phoneNumber, String gender,
			String password) throws ClassNotFoundException, SQLException {
		
		System.out.println("Dto saved");
		boolean save = repo.update(firstName, lastName, DOB, email, phoneNumber, gender, password);
		System.out.println(save);
	
		
		return false;
	}
	
	@Override
	public boolean read() throws ClassNotFoundException, SQLException {
		boolean read = repo.read();
		System.out.println(read);
		return false;
	}

	@Override
	public boolean delete(int id) throws ClassNotFoundException, SQLException {
		boolean delete = repo.delete(id);
		System.out.println(delete);
		return false;
	}

	@Override
	public boolean updateByEmail(String lastName,String email) throws ClassNotFoundException, SQLException {
		System.out.println("Update By email");
		boolean updateByEmail = repo.updateByEmail(lastName,email);
		System.out.println(updateByEmail);
		return false;
	}

	@Override
	public boolean readById(int id) throws ClassNotFoundException, SQLException {
		System.out.println("read Dto");
		boolean readById = repo.readById(id);
		System.out.println(readById);
		return false;
	}


	


	
}
