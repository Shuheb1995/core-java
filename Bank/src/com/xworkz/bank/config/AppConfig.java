package com.xworkz.bank.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.xworkz.bank.CanaraBank;
import com.xworkz.bank.SbiBank;

@Configuration
public class AppConfig {
	
	@Bean
	public SbiBank getSbiBank() {
		return new SbiBank();
	}
	@Bean
	public CanaraBank getCanBank() {
		return new CanaraBank();
	}

}
