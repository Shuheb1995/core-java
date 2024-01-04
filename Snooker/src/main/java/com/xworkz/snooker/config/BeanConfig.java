package com.xworkz.snooker.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.snooker")
@EnableWebMvc
public class BeanConfig implements WebMvcConfigurer {
	
	public BeanConfig () {
		System.out.println("BeanConfig Constructor is running");
	}
	
    @Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addRedirectViewController("/", "Register.jsp");
	}
	
	@Bean
	public ViewResolver SnookerViewResolver() {
		return new InternalResourceViewResolver("/WEB-INF/" , ".jsp");
	}

	

}
