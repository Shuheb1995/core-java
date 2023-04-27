package com.xworkz.groceries;

import com.xworkz.groceries.dao.GroceriesDao;

public class GroceriesRunner {

	public static void main(String[] args) {

		GroceriesDao item = new GroceriesDao();
		item.addGroceries("Rice");
		item.addGroceries("Oil");
		item.addGroceries("Sugar");
		item.addGroceries("Salt");
		item.addGroceries("Flour");

		item.updateByIndex("Jaggery", 2);
		item.updateByNAme("Salt", "Powder Salt");
		item.deleteByIndex(1);
		item.deleteByName("oil");

		boolean result1 = item.searchMethod("Flour");
		System.out.println(result1);

		String[] result = item.read();
		for (int j = 0; j < result.length; j++) {
			System.out.println(result[j]);
		}

	}
}
