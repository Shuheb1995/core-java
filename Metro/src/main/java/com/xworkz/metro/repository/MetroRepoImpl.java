package com.xworkz.metro.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;
import com.xworkz.metro.dto.MetroDto;

public class MetroRepoImpl implements MetroRepo {

	@Override
	public boolean save(MetroDto dto) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Metro", "root",
				"Xworkzodc@123");

		String query = "insert into metro_table values(?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement statement = connection.prepareStatement(query);

		statement.setString(1, dto.getid());
		statement.setString(2, dto.getName());
		statement.setString(3, dto.getCity());
		statement.setString(4, dto.getState());
		statement.setString(5, dto.getPincode());
		statement.setString(6, dto.getBirthDate());
		statement.setString(7, dto.getGender());
		statement.setString(8, dto.getMaritalStatus());
		statement.setString(9, dto.getMobileNumber());
		statement.setString(10, dto.getPeriod());
		statement.setString(11, dto.getFare());

		int i = statement.executeUpdate();
		System.out.println("Effected rows :  " + i);
		statement.close();

		return false;
	}

	@Override
	public ResultSet find(MetroDto dto,String name) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Metro", "root",
				"Xworkzodc@123");

		String query = "select * from metro_table where name=?";
		PreparedStatement statement = connection.prepareStatement(query);

		statement.setString(1, name);

		ResultSet result = statement.executeQuery();
		if (result != null) {
			while (result.next()) {
				System.out.println(result.getString(1) +" "+ result.getString(2) +"  "+result.getString(3) +" "+ result.getString(4)+
						" "+ result.getString(5) +" "+ result.getString(6) +" "+ result.getString(7) +" "+ result.getString(8)+" "
						+ result.getString(9) +" "+ result.getString(10) +" "+ result.getString(11));
			}
		}else {
			System.out.println("Not found");
		}
		statement.close();

		return null;
	}

}
