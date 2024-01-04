package com.xworkz.avatar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class avatarRunner {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/avatar", "root","Xworkzodc@123");

			System.out.println(connect.getSchema());

			String query = "insert into avatar_table values(1,'Zoe Saldana',640000000,45,'Female','Neytiri',"
					+ "'Guardians of the galaxy','America','Special OPS:Lioness','Actress')";
			
			String query1 = "insert into avatar_table values(2,'Sam Worthington',8197.50,46,'Male','Jake Sully',"
					+ "'Clash Of The Titans','Australia','Avatar 3','Actor')";
			
			String query2 = "insert into avatar_table values(3,'Sigourny Weaver',600000000,73,'Female','Kiri',"
					+ "'Alien','America','Avatar 3','Actress')";
			
			String query3 = "insert into avatar_table values(4,'Michelle Rodriguez',700000000,44,'Female','Neytiri',"
					+ "'Fast & Furious','America','Fast & Furious 11','Actress')";
			
			String query4 = "insert into avatar_table values(5,'Joel David Moore',850000000,45,'Male','Norm Spellman',"
					+ "'Dodge Ball','America','Avatar 3','Actor')";
			
			String query5 = "insert into avatar_table values(6,'Laz Alonso',800000000,49,'Male','Tsutey',"
					+ "'Jumping The Broom','America','Avatar 3','Actor')";
			
			String query6 = "insert into avatar_table values(7,'Stephen Lang',700000000,70,'Male','Miles Quaritch',"
					+ "'Dont Breathe','America','Avatar 3','Actor')";
			
			String query7 = "insert into avatar_table values(8,'Giovanni Ribisi',750000000,48,'Male','Parker Selfridge',"
					+ "'Sneaky Pete','America','Avatar 3','Actor')";
			
			String query8 = "insert into avatar_table values(9,'CCh Pounder',550000000,70,'Female','Moat',"
					+ "'The Shield','America','Avatar 3','Actress')";
			
			String query9 = "insert into avatar_table values(10,'Wes Studi',780000000,75,'Male','Moat',"
					+ "'Hostiles','America','Avatar 3','Actor & Producer')";
			
			Statement state = connect.createStatement();
			int i = state.executeUpdate(query9);
			System.out.println("effected rows : "+i);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
