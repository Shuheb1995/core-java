package com.xworkz.avatar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class movieRunner {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			String query = "select * from avatar_table";
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/avatar", "root",
					"Xworkzodc@123");
			Statement state = connect.createStatement();

			ResultSet set = state.executeQuery(query);
			System.out.println(set);
			if (set != null) {
				while (set.next()) {
					System.out.println(
							set.getInt(1) + " " + set.getString(2) + " " + set.getInt(3) + " " + set.getInt(4) + " "
									+ set.getString(5) + " " + set.getString(6) + " " + set.getString(7) + " "
									+ set.getString(8) + " " + set.getString(9) + " " + set.getString(10));
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
