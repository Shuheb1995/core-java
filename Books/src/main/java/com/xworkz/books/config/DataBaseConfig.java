package com.xworkz.books.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
public class DataBaseConfig {
	
	@Bean
	public LocalEntityManagerFactoryBean LocalEntityManagerFactoryBean() {
		
		LocalEntityManagerFactoryBean lemfb = new LocalEntityManagerFactoryBean();
		lemfb.setPersistenceUnitName("Book-Connection");		
		return lemfb;
		
	}

}
