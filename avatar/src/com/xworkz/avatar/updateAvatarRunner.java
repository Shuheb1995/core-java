package com.xworkz.avatar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class updateAvatarRunner {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/avatar", "root","Xworkzodc@123");
			
			String query = "update avatar_table set Cast_Name='Psych' where id=4";
			
			Statement state = connect.createStatement();
			
			boolean insert = state.execute(query);
			System.out.println(insert);
			
			connect.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
