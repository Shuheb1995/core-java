package com.xworkz.aggregation;

public class Initialization {
	
	public static void main(String[] args) {
		
		Hospital hosp= new Hospital();
		hosp.hospitalName= "Psych Hospital";
		
		Doctors doc= new Doctors();
		doc.name= "Dr. Ulaga";
		doc.designation= "Surgeon";
		doc.dutyTimings= "9am to 7pm";
		doc.salary= 200000;
		doc.patiantsAttendingPerDay= 5;
		
		Patiant pat= new Patiant();
		pat.name= "Varun";
		pat.disease= "Kidney Filure";
		pat.admitedDays= 14;
		pat.bill= 150000;
		pat.dischargeDate= "05/04/2023";
		
		Employee emp=new Employee();
		emp.name= "Kiran";
		emp.type= "Junior Doc";
		emp.salary= 100000;
		emp.weekOff= 2;
		emp.logOutTimings= "7.30pm";
		
		Treatment treat= new Treatment();
		treat.treatmentName= "Dialysis";
		treat.treatmentSpecialist= "Dr. Madhusa";
		treat.treatmentPeriod= "2 months";
		treat.treatmentCost= 1000000;
		treat.treatmentCompleted= true;
		
		System.out.println(hosp);
		
	}

}
