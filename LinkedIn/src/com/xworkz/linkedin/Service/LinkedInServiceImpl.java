package com.xworkz.linkedin.Service;

import java.sql.Date;

import com.xworkz.linkedin.Dto.LinkedInDto;
import com.xworkz.linkedin.repository.LinkedInRepo;
import com.xworkz.linkedin.repository.LinkedInRepoImpl;

public class LinkedInServiceImpl implements LinkedInSerivce {
	
	LinkedInRepo repo = new LinkedInRepoImpl();

	@Override
	public boolean save(LinkedInDto dto) {
		if(dto!=null) {
			System.out.println("Dto is Saved");
			boolean save = repo.save(dto);
			System.out.println(save);
		}
		return false;
	}
	
	@Override
	public boolean updatebyEmail(int id, String name, String qualification, String experirnce, String skills,
			Date dateOfBirth) {
		boolean update = repo.updatebyEmail(id, name, qualification, experirnce, skills, dateOfBirth);
		return false;
	}


	

	@Override
	public boolean readByEmail(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean readAll() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteIdByEmail(int id, String email) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean readIdByEmail(int id, String email) {
		// TODO Auto-generated method stub
		return false;
	}



	
}
