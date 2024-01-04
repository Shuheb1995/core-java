package com.xworkz.linkedin.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.linkedin.Dto.LinkedInDto;

public class LinkedInRepoImpl implements LinkedInRepo {

	@Override
	public boolean save(LinkedInDto dto) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/LinkedIn","root","Xworkzodc@123");
			
			String query = "insert into LinkedIn_Table values(?,?,?,?,?,?,?)";
			PreparedStatement statement = connection.prepareStatement(query);
			
			statement.setInt(1, dto.getId());
			statement.setString(2, dto.getName());
			statement.setString(3, dto.getQualification());
			statement.setString(4, dto.getEmail());	
			statement.setString(5, dto.getExperience());
			statement.setString(6, dto.getSkills());
			statement.setDate(7, dto.getDateOfBirth());
			
			int i = statement.executeUpdate();
			System.out.println("Effected rows :  "+i);
			statement.close();
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	
	@Override
	public boolean updatebyEmail(int id, String name, String qualification,String experience, String skills,Date Date_of_Birth) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/LinkedIn","root","Xworkzodc@123");
			
			String query = "update LinkedIn_Table set id=?,name=?,qualification=?,experience=?,skills=?,Date_of_Birth=? where email=KiranXworkz@gmail.com";
			PreparedStatement statement = connection.prepareStatement(query);
			
			statement.setInt(1, id);
			statement.setString(2, name);
			statement.setString(3,qualification );
			statement.setString(4, experience);
			statement.setString(5, skills);
			statement.setDate(6, Date_of_Birth);
			
			int i = statement.executeUpdate();
			System.out.println("Effected rows :  "+i);
			statement.close();
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
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
