package com.xworkz.linkedin.repository;

import java.sql.Date;

import com.xworkz.linkedin.Dto.LinkedInDto;

public interface LinkedInRepo {
	
	boolean save(LinkedInDto dto);
	boolean updatebyEmail(int id, String name, String qualification, String experirnce, String skills, Date dateOfBirth);
	boolean readByEmail(String email);
	boolean readAll();
	boolean deleteIdByEmail(int id , String email);
	boolean readIdByEmail(int id , String email);
	

}
