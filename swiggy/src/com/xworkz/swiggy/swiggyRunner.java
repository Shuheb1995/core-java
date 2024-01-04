package com.xworkz.swiggy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class swiggyRunner {
	
	public static void main(String[] args) {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Mysql driver jdbc");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			//connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/swiggy","root","Xworkzodc@123");
			System.out.println(connection.getSchema());
			
			//writing query
			String query = "insert into swiggy values(6,'instamart','BTM')";
			
			//creating statements object
			Statement statement = connection.createStatement();
			
			//executing statement to get result
			//boolean insert = statement.execute(query);
			
			int i = statement.executeUpdate(query);
			System.out.println("Effected rows:"+i);
			//System.out.println(insert);
			
			//close the connection
			connection.close();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
