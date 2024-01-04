package com.xworkz.cigeratte;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class smokerRunner {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			String query = "select * from cigeratte";
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/cigeratte", "root",
					"Xworkzodc@123");

			Statement state = connect.createStatement();

			ResultSet result = state.executeQuery(query);
			System.out.println(result);
			if (result != null) {
				while (result.next()) {
					System.out.println(result.getInt(1) + " " + result.getString(2) + " " + result.getString(3) + " "
							+ result.getInt(4) + " " + result.getInt(5) + " " + result.getInt(6) +
							 " " + result.getString(7) + " " + result.getString(8));
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
