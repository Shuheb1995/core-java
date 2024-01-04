package com.xworkz.bank;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.bank.config.AppConfig;

public class BankRunner {
	
	public static void main(String args []) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		SbiBank bank = context.getBean(SbiBank.class);
		
//		bank.deposit();
//		bank.withdarw(1000);
		
		CanaraBank canbank = context.getBean(CanaraBank.class);
		
		canbank.deposit();
		canbank.withdarw(2000);
	}

}
