package com.xworkz.agregation;

public class Starter {
	 
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		
		emp.salary= 50000;
		emp.profile= "Shuheb";
		emp.designation= "Software Developer";
		
		Address addrress= new Address();
		
		addrress.doorNo= 85;
		addrress.street= "BTM";
		addrress.colony= "BTM Layout";
		addrress.pinCode= 560008;
		addrress.state= "Karnataka";
		
		System.out.println(emp);
		
		
		
		
		
	}

}
