package com.xworkz.facebook;

import java.sql.Date;
import java.sql.SQLException;

import com.xworkz.facebook.Dto.facebookDto;
import com.xworkz.facebook.service.facebookService;
import com.xworkz.facebook.service.facebookServiceImpl;

public class facebookRunner {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Date date = new Date(27/07/1995);
		facebookService service = new facebookServiceImpl();
		facebookDto dto = new facebookDto(4," ","Nathan",date,"UlagaXworkz@gmail.com",821765897,"Male","UlagaXworkz@123");
		service.save(dto);
		//service.update("Kiran", "Mahendrakar", date, "KiranXworkz@gmail.com", 874521639, "Male", "KiranXworkz@123");
		//service.read();
		//service.delete(2);
		//service.updateByEmail("Mahi","KiranXworkz@gmail.com");
		//service.readById(1);
	}

}
