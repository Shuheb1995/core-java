package com.xworkz.facebook.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.facebook.Dto.facebookDto;

public class facebookRepoImpl implements facebookRepo {

	@Override
	public boolean save(facebookDto dto) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/facebook", "root",
				"Xworkzodc@123");

		String query = "insert into fb_table values(?,?,?,?,?,?,?,?)";
		PreparedStatement statement = connection.prepareStatement(query);

		statement.setInt(1, dto.getId());
		statement.setString(2, dto.getFirstName());
		statement.setString(3, dto.getLastName());
		statement.setDate(4, dto.getDOB());
		statement.setString(5, dto.getEmail());
		statement.setInt(6, dto.getPhoneNumber());
		statement.setString(7, dto.getGender());
		statement.setString(8, dto.getPassword());

		int i = statement.executeUpdate();
		System.out.println("effected rows : " + i);
		statement.close();
		return false;
	}

	@Override
	public boolean update(String firstName, String lastName, Date DOB, String email, int phoneNumber, String gender,
			String password) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/facebook", "root",
				"Xworkzodc@123");

		String query = "update fb_table set firstName=?,lastName=?,DOB=?,email=?,phoneNumber=?,gender=?,password=? where id=3";
		PreparedStatement statement = connection.prepareStatement(query);

		statement.setString(1, firstName);
		statement.setString(2, lastName);
		statement.setDate(3, DOB);
		statement.setString(4, email);
		statement.setInt(5, phoneNumber);
		statement.setString(6, gender);
		statement.setString(7, password);

		int i = statement.executeUpdate();
		System.out.println("updated row : " + i);

		return false;
	}

	@Override
	public boolean read() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/facebook", "root",
				"Xworkzodc@123");

		String query = "select * from fb_table";
		PreparedStatement statement = connection.prepareStatement(query);

		ResultSet result = statement.executeQuery();
		if (result != null) {
			while (result.next()) {
				System.out.println(result.getInt(1) + " " + result.getString(2) + " " + result.getString(3) + " "
						+ result.getDate(4) + " " + result.getString(5) + " " + result.getInt(6) + " "
						+ result.getString(7) + " " + result.getString(8));
			}
			
		}else {
			System.out.println("wrong");
		}
		statement.close();

		return false;
	}

	@Override
	public boolean delete(int id) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/facebook", "root",
				"Xworkzodc@123");

		String query = "delete from fb_table where id=?";
		PreparedStatement statement = connection.prepareStatement(query);
		statement.setInt(1, id);
		int i = statement.executeUpdate();
		System.out.println("deleted rows : "+i);
		statement.close();

		return false;
	}

	@Override
	public boolean updateByEmail(String lastName,String email) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/facebook", "root",
				"Xworkzodc@123");

		String query = "update fb_table set lastName=? where email=?";
		PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, lastName);
		statement.setString(2, email);
		
		int i = statement.executeUpdate();
		System.out.println("updated By email : "+i);
		statement.close();
		
		return false;
	}
	
	public boolean readById(int id) throws ClassNotFoundException, SQLException {
		String query = "select * from fb_table where id=?";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/facebook", "root",
				"Xworkzodc@123");

		
		PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, id);
		ResultSet result = statement.executeQuery();
		if (result != null) {
			while (result.next()) {
				System.out.println(result.getInt(1) + " " + result.getString(2) + " " + result.getString(3) + " "
						+ result.getDate(4) + " " + result.getString(5) + " " + result.getInt(6) + " "
						+ result.getString(7) + " " + result.getString(8));
			}
			
		}else {
			System.out.println("not read");
		}
		statement.close();

		return false;
	}

}
