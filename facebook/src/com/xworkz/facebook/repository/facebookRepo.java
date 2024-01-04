package com.xworkz.facebook.repository;

import java.sql.Date;
import java.sql.SQLException;

import com.xworkz.facebook.Dto.facebookDto;

public interface facebookRepo {
	
	boolean save(facebookDto dto) throws ClassNotFoundException, SQLException;
	boolean update(String firstName, String lastName, Date DOB, String email, int phoneNumber, String gender,
			String password) throws ClassNotFoundException, SQLException;

	boolean read() throws ClassNotFoundException, SQLException;
	boolean delete(int id) throws ClassNotFoundException, SQLException;
	boolean updateByEmail(String lastName,String email) throws ClassNotFoundException, SQLException;
	public boolean readById(int id) throws ClassNotFoundException, SQLException;
	
}
