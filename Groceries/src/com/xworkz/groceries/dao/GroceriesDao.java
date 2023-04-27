package com.xworkz.groceries.dao;

public class GroceriesDao {

	String[] groceries = new String[5];

	public String[] addGroceries(String groceriesName) {
		for (int i = 0; i < groceries.length; i++) {
			if (groceries[i] == null) {
				groceries[i] = groceriesName;
				System.out.println("groceries");
				return groceries;
			}
		}
		System.out.println("if the bike value is not null add add values");
		return groceries;
	}

	public String[] read() {
		return groceries;
	}

	public boolean updateByIndex(String newgroce, int index) {
		if (newgroce != null) {
			groceries[index] = newgroce;
			System.out.println("updated Successfully");
			return true;
		}
		System.out.println("Not updated");
		return false;
	}

	public boolean updateByNAme(String oldName, String newName) {
		for (int j = 0; j < groceries.length; j++) {
			if (oldName.equals(groceries[j])) {
				groceries[j] = newName;
				System.out.println("updated by name");
				return true;
			}
		}
		System.out.println("can't update by name");
		return false;
	}

	public boolean deleteByIndex(int index) {
		if (groceries != null) {
			groceries[index] = null;
			System.out.println("remove the value");
			return true;
		}
		System.out.println("can't remove the value");
		return false;
	}

	public boolean deleteByName(String groceName) {
		for (int k = 0; k < groceries.length; k++) {
			if (groceName.equals(groceries[k])) {
				groceries[k] = null;
				System.out.println("Value is deleted by Name");
				return true;
			}
		}
		System.out.println("Value is not deleted by Name");
		return false;
	}

	public boolean searchMethod(String groceriesName) {
		for (int i = 0; i < groceries.length; i++) {
			if (groceriesName.equals(groceries[i])) {
				groceries[i] = null;
				System.out.println("value is found");
				return true;
			}
		}
		System.out.println("value is not found");
		return false;
	}

}
