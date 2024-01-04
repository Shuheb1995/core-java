package com.xworkz.avatarMovie.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.avatarMovie.dto.avatarDto;

public class avatarRepositoryImpl implements avatarRepository{

	@Override
	public boolean save(avatarDto dto) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/avatarmovie", "root","Xworkzodc@123");
			//System.out.println(connect.getSchema());
			
			String query = "insert into avatarmovie_table values(?,?,?,?,?,?)";
			
			PreparedStatement state = connect.prepareStatement(query);
			System.out.println("Inserted into : "+state);
			
			state.setInt(1, dto.getId());
			state.setString(2, dto.getName());
			state.setString(3, dto.getProducer());
			state.setString(4, dto.getDirector());
			state.setString(5, dto.getActor());
			state.setString(6, dto.getActress());
			System.out.println("Inserted into : "+state);
			
			int i = state.executeUpdate();		
			System.out.println("effected rows : "+i);
			state.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(String name, String producer, String director,String actor,String actress) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/avatarmovie", "root","Xworkzodc@123");
			
			String query = "update avatarmovie_table set Name=?,Producer=?,Director=?,Actor=?,Actress=? where id=3";
			
			PreparedStatement state = connect.prepareStatement(query);
			state.setString(1, name);
			state.setString(2, producer);
			state.setString(3, director);
			state.setString(4, actor);
			state.setString(5, actress);
			
			int i = state.executeUpdate();
			if(i>0) {
				System.out.println("Record updated : "+ i);
			}else {
				System.out.println("Record not updated : "+ i);
			}
			
			
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	

}
