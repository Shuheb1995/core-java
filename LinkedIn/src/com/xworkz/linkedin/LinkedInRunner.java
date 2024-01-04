package com.xworkz.linkedin;

import java.sql.Date;

import com.xworkz.linkedin.Dto.LinkedInDto;
import com.xworkz.linkedin.Service.LinkedInSerivce;
import com.xworkz.linkedin.Service.LinkedInServiceImpl;

public class LinkedInRunner {

	
	public static void main(String[] args) {
		
		Date date = new Date(27/7/995);
		Date date1 = new Date(26/5/2001);
		
		
		LinkedInDto dto = new LinkedInDto(8,"7huheb","B.E","UlagaXworkz@gmail.com","2 Years","Java",date);
		
		LinkedInSerivce service = new LinkedInServiceImpl();
		
		//service.save(dto);
		
		service.updatebyEmail(6, "Kiran", "B.Sc", "3 Years", "MySql", date1);
	}

}
