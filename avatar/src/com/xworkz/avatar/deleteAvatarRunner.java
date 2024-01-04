package com.xworkz.avatar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class deleteAvatarRunner {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/avatar", "root","Xworkzodc@123");
			
			String query = "delete from avatar_table where id=2";
			
			Statement state = connect.createStatement();
			
			boolean delete = state.execute(query);
			System.out.println(delete);
			
			connect.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
