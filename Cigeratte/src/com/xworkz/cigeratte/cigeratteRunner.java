package com.xworkz.cigeratte;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class cigeratteRunner {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Registered");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/cigeratte", "root","Xworkzodc@123");
			System.out.println(connect.getSchema());

			String query = "insert into cigeratte values(1,'King Gold Flake','Tobacco Honedew',18,180,10,'Regular','nill')";
			String query2 = "insert into cigeratte values(2,'Lights Gold Flake','Tobacco Honedew',18,180,10,'Lighter','nill')";
			String query3 = "insert into cigeratte values(3,'Gold Flake Small','Tobacco',10,100,10,'Regular','nill')";
			String query4 = "insert into cigeratte values(4,'Indie Mint','Tobacco',10,100,10,'Pan Beeda','nill')";
			String query5 = "insert into cigeratte values(5,'Wills Premium Flake','Strong Tobacco',9,90,10,'Strong Flavour','nill')";
			String query6 = "insert into cigeratte values(6,'Wills Galaxy Flake', 'Tobacco',5,50,10,'Regular','nill')";
			String query7 = "insert into cigeratte values(7,'Wills Smooth Flake','Smooth Tobacco',5,50,10,'Regular','nill')";
			String query8 = "insert into cigeratte values(8,'Marlboro','Filtered Tobacco',17,170,10,'Regular','nill')";
			String query9 = "insert into cigeratte values(9,'Esse Lights','Light Tobacco',10,150,20,'Regular','nill')";
			String query10 = "insert into cigeratte values(10,'Dunn Hill','Tobacco Mint',20,400,20,'Double Mint Shot','nill')";
			
			Statement state = connect.createStatement();
			
//			ResultSet result = state.executeQuery(query);
//			System.out.println(result);
//			if(result!=null) {
//				while(result.next()) {
//					System.out.println(result.getInt(1)+" "+result.getString(2)+" "+result.getString(3)+" "+result.getInt(4)+" "
//				+result.getInt(5)+" "+result.getInt(6)+" "+result.getInt(7)+" "+result.getString(8)+" "+result.getString(9));
//				}
//			}
			
			int i = state.executeUpdate(query10);
			System.out.println("effected rows : "+i);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
